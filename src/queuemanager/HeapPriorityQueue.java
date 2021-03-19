/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

/**
 * Implements code found at https://www.geeksforgeeks.org/priority-queue-using-binary-heap/
 * @author Jonah
 * @param <T>
 */
public class HeapPriorityQueue<T> implements PriorityQueue<T> {
    
    /**
     * Where the data is actually stored.
     */
    private final Object[] storage;

    /**
     * The size of the storage heap.
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
    public HeapPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }
    
    // This function takes a position of an item, and finds it's parent using
    // the heap formula
    public int parent (int position) {
        return (position - 1) / 2;
    }
    
    // This function takes a position of an item, and finds it's left most child
    // using the heap formula
    public int leftChild(int position) {
        return ((2 * position) + 1);
    }
    
    // This function takes a position of an item, and finds it's right most child
    // using the heap formula
    public int rightChild(int position) {
        return ((2 * position) + 2);
    }
    
    // This function takes in two heap positions and swaps the values positions
    public void swap(int position1, int position2) {
        // Takes the first position and makes a temp variable equal to its
        // value
        PriorityItem<T> temp = (PriorityItem<T>) storage[position1];
        // This makes the first position's value equal to the second position
        storage[position1] = storage[position2];
        // This makes the second position's value equal to the temp that was
        // created
        storage[position2] = temp;
    }
    
    // This function takes a heap position and checks the value with it's parent
    // to move up the heap and maintain the heap property
    public void shiftUp (int position) {
        // This while function compares the priorities of a child and it's parent
        // while making sure that the value that is being shifted up is not the
        // top most parent
        while (position > 0 && ((PriorityItem<T>) storage[parent(position)]).getPriority() < ((PriorityItem<T>) storage[position]).getPriority()) {
            // In the case that the priority of the child is higher
            // The two positions are swapped
            swap(parent(position), position);
            // The position i is updated to the position that was the parent previously
            // to continue shifting up
            position = parent(position);
        }
    }
    
    // This function checks an heap position against it's children, and swaps
    // the positions in the case that the parent has a lower priority
    public void shiftDown (int position) {
        // This is a integer that saves the new position once the priority in the
        // original position has been compared to it's children
        int newPosition = position;
        // This saves the position of the left child of the current position
        int leftChild = leftChild(position);
        // This if statement makes sure the left child is not a position higher
        // than the tailIndex, and checks to see whether the priority of the
        // left child is greater than the priority of the parent
        if (leftChild <= tailIndex && ((PriorityItem<T>) storage[leftChild]).getPriority() > ((PriorityItem<T>) storage[newPosition]).getPriority()) {
            // If it is, the new position is updated to the position of the left
            // child
            newPosition = leftChild;
        }
        // This saves the position of the right child of the current position
        int rightChild = rightChild(position);
        // This if statement makes sure the right child is not a position higher
        // than the tailIndex, and checks to see whether the priority of the
        // right child is greater than the priority of the parent
        if (rightChild <= tailIndex && ((PriorityItem<T>) storage[rightChild]).getPriority() > ((PriorityItem<T>) storage[newPosition]).getPriority()) {
            // If it is, the new position is updated to the position of the right
            // child
            newPosition = rightChild;
        }
        // If the original position is not the same as the new position
        if (position != newPosition) {
            // The original position and the new position values are swapped
            swap(position, newPosition);
            // The new position value is shifted down again, until the value of
            // parent is larger than the children
            shiftDown(newPosition);
        }
    }
    // Function to find the item in the heap with the highest priority
    @Override
    public T head() throws QueueUnderflowException {
        // Checks to see if the heap is empty and throws UnderflowException
        if (isEmpty()) {
            throw new QueueUnderflowException();
        // If it is not empty
        } else {
            // It returns the item in the heap of position 0
            return ((PriorityItem<T>) storage[0]).getItem();
        }
    }
    
    // Function to add a new item to the heap
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
            // Adding the new item to the tail of the heap
            storage[tailIndex] = new PriorityItem<>(item, priority);
            // The new item is shifted up until the new item obeys the heap
            // property
            shiftUp(tailIndex);
        }
    }
    
    // Function to remove the item with the highest priority
    @Override
    public void remove() throws QueueUnderflowException {
        // Checks to see if the heap is empty and throws exception
        if (isEmpty()) {
            throw new QueueUnderflowException();
        // If statement that deals with removing the heap item
        } else {
            // Takes the highest priority item, the item at the head and puts it
            // into a temp variable
            PriorityItem<T> temp = (PriorityItem<T>) storage[0];
            // The last item in the heap is swapped with the item that is being removed
            storage[0] = storage[tailIndex];
            // The tailIndex is decremented by 1 to reflect the removed item
            tailIndex = tailIndex - 1;
            // The new head needs to be shifted down to make sure the heap property
            // is maintained
            shiftDown(0);
        }
    }
    
    // Method to check is the heap is empty
    @Override
    public boolean isEmpty() {
        // tailIndex begins at -1 so this is an easy way to find out if the heap
        // is empty
        return tailIndex < 0;
    }
    
    // Method to print out the heap
    @Override
    public String toString() {
        // Beginning of string
        String result = "[";
        // For loop to iterate by each item in the heap
        for (int i = 0; i <= tailIndex; i++) {
            // THis is to add commas after the first heap item
            if (i > 0) {
                //Adds the item to the string
                result = result + ", ";
            }
            result = result + storage[i];
        }
        // Adds the ending brace and returns the result
        result = result + "]";
        return result;
    }
}
