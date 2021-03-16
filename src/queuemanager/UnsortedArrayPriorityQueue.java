/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

/**
 *
 * @author Jonah
 * @param <T>
*/
public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T> {
    
    /**
     * Where the data is actually stored.
     */
    private final Object[] storage;

    /**
     * The size of the storage array.
     */
    private final int capacity;

    /**
     * The index of the last item stored.
     *
     * This is equal to the item count minus one.
     */
    private int tailIndex;

    /**
     * Create a new empty queue of the given size.
     *
     * @param size
     */
    public UnsortedArrayPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }

    // Function to find the item in the array with the highest priority
    @Override
    public T head() throws QueueUnderflowException {
        // Checks to see if the array is empty and throws UnderflowException
        if (isEmpty()) {
            throw new QueueUnderflowException();
        // If it is not empy
        } else {
            // Innitialise the item and the priority with the first item in the array to use in the for loop
            T item = ((PriorityItem<T>) storage[0]).getItem();
            int priority = ((PriorityItem<T>) storage[0]).getPriority();
            
            // For loop that iterates through the array to fint the item with the highest priority
            for (int i = 0; i <= tailIndex; i++) {
                // If statement to check whether the item in the array has a greater priority than the saved priority
                if (((PriorityItem<T>) storage[i]).getPriority() > priority) {
                    // If the priority is higher than the saved priority, the item is updated with the name of this new item in the array,
                    // and the priority is updated
                    item = ((PriorityItem<T>) storage[i]).getItem();
                    priority = ((PriorityItem<T>) storage[i]).getPriority();
                }
            }
            // Item is returned to where the method was called
            return item;
        }
    }

    // Function to add a new item to the array
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        // Incrementing the tailIndex to reflect the added item
        tailIndex = tailIndex + 1;
        // Checking if the tailIndex is larger than the capacity
        if (tailIndex >= capacity) {
            // If the tailIndex is larger than the specified capacity, the tailIndex is deincremented
            tailIndex = tailIndex - 1;
            // Exception is thrown
            throw new QueueOverflowException();
        // This takes care of when the capacity is not reached
        } else {
            // Adding the new item to the head of the array
            storage[tailIndex] = new PriorityItem<>(item, priority);
        }
    }

    // Function to remove the item with the highest priority
    @Override
    public void remove() throws QueueUnderflowException {
        // Checks to see if the array is empty and throws exception
        if (isEmpty()) {
            throw new QueueUnderflowException();
        // If statement that deals with removing the array item
        } else {
            // Initialising the position and setting the priority to the head of the array
            int position = 0;
            int priority = ((PriorityItem<T>) storage[0]).getPriority();
            
            //For loop to iterate throughout the entire array
            for (int i = 1; i <= tailIndex; i++) {
                // If statement that checks the priority of an item in an array to the largest recorded priority
                if (((PriorityItem<T>) storage[i]).getPriority() > priority) {
                    //Changes the position to the new higher priority position, and updates the priority
                    position = i;
                    priority = ((PriorityItem<T>) storage[i]).getPriority();
                }
            }
            
            // For loop to shift the entire array down
            for (int i = position; i < tailIndex; i++) {
                storage[i] = storage[i+1];
            }
            
            // Reducing the tail Index to reflect the removal
            tailIndex = tailIndex - 1;
        }
    }

    // Method to check is the array is empty
    @Override
    public boolean isEmpty() {
        // tailIndex begins at -1 so this is an easy way to find it
        return tailIndex < 0;
    }

    // Method to print out the array
    @Override
    public String toString() {
        // Beginning of string
        String result = "[";
        // For loop to iterate by each item in the array
        for (int i = 0; i <= tailIndex; i++) {
            // THis is to add commas after the first array item
            if (i > 0) {
                result = result + ", ";
            }
            //Adds the item to the string
            result = result + storage[i];
        }
        // Adds the ending brace and returns the result
        result = result + "]";
        return result;
    }
}
