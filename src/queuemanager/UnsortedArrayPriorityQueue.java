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

    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            T item;
            item = ((PriorityItem<T>) storage[0]).getItem();
            ((PriorityItem<T>) storage[0]).getPriority();
            
            for (int i = 0; i < tailIndex - 1; i++) {
                if (((PriorityItem<T>) storage[i]).getPriority() < ((PriorityItem<T>) storage[i + 1]).getPriority()) {
                    item = ((PriorityItem<T>) storage[i + 1]).getItem();
                }
            }
            
            return item;
        }
    }

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        tailIndex = tailIndex + 1;
        if (tailIndex >= capacity) {
            /* No resizing implemented, but that would be a good enhancement. */
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else {
            /* Scan backwards looking for insertion point */
            for (int i = tailIndex; i > 0; i--) {
                storage[i] = storage[i - 1];
            }
            storage[0] = new PriorityItem<>(item, priority);
        }
    }

    @Override
    public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            int position = 0;
            
            for (int i = 0; i < tailIndex - 1; i++) {
                if (((PriorityItem<T>) storage[i]).getPriority() < ((PriorityItem<T>) storage[i + 1]).getPriority()) {
                    position = i;
                }
            }
            
            for (int i = position + 1; i < tailIndex; i++) {
                storage[i] = storage[i+1];
            }
            
            tailIndex = tailIndex - 1;
        }
    }

    @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage[i];
        }
        result = result + "]";
        return result;
    }
}
