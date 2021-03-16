/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

import javafx.scene.Node;

/**
 * Implements code found at https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
 * @author Jonah
 * @param <T>
 * Linked priority queue that is sorted 
 * Works on higher number higher priority
*/
public class SortedLinkedPriorityQueue<T> implements PriorityQueue<T> {
    // Global head variable that is a node
    Node head;
    
    // Class that sets the variables that Node behaves with
    public class Node {
        // Setting a variable called node info, which contains the object that was previously set to contain the name 
        // and the priority
        PriorityItem<T> nodeInfo;
        // Item that contains the way to the next node
        Node next;
    }
    
    // This creates a variable and calls the previously made class, so that's it's instantiated
    public Node node = new Node();
    
    // Function creates new nodes and takes in the PriorityItem object to submit into the node data
    public Node newNode(PriorityItem<T> info) {
        // Calls the Node data class and sets it into a node variable called temp
        Node temp = new Node();
        // Takes the object passed into the function and sets it into the temp data class
        temp.nodeInfo = info;
        // As the temp Node is not inserted yet, it does not have a pointer yet
        temp.next = null;
        // Returns the temp node to be used
        return temp;
    }
    
    // Function to add a new node into the linked list, takiung in the item and the priority
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        // This creates a node variable called start, and sets head equal to the start of the list 
        Node start = (head);
        // Creates an object called info which holds the item and priority information passed from the 
        // calling of the method
        Object info = new PriorityItem<>(item, priority);
        // This creates the temp node, by calling the new node function and inserting the newly created object
        Node temp = newNode((PriorityItem<T>) info);
        // this checks to see whether the linked list is empty
        if((head) == null) {
            // When it's empty, it sets the head of the array to the temp file and sets the next equal to nothing, as it is the only item
            (head) = temp;
            (head).next = null;
        // This is the if statement that checks to see if the head has a lower priority than the new temp item
        } else if ((head).nodeInfo.getPriority() < priority) {
            // If it does, it sets the temp to the new item, and changes the pointer to the head item 
            temp.next = head;
            (head) = temp;
        // This is the case where the list is not empty, the head is still the item with the highest priority
        } else {
            // While loop that iterates through the linked list to find the correct insertion point
            while (start.next != null && start.next.nodeInfo.getPriority() > priority) {
                // Here we change the node until we find the insetrion point
                start = start.next;
            }
            
            // Here we set temps pointer to be equal to the pointer of start
            temp.next = start.next;
            // Here we set the pointer of start equal to temp, inserting temp in between start and start.next
            start.next = temp;
        }
    }

    // Function to find the head of the linked list
    @Override
    public T head() throws QueueUnderflowException {
        // Checks if the array is empty
        if (isEmpty()) {
            // If it is empty, it throws a list is emptty exception
            throw new QueueUnderflowException();
        // IF the array is not empty
        } else {
            // It takes the head of the list and returns, the name, as it is a sorted list
            return (head).nodeInfo.getItem();
        }
    }

    // This fuction removes the head item
    @Override
    public void remove() throws QueueUnderflowException {
        // Checks if the array is empty
        if (isEmpty()) {
            // If it is empty, it throws a list is emptty exception
            throw new QueueUnderflowException();
        // IF the array is not empty
        } else {
            // This sets the temp node equal to the head
            Node temp = head;
            // THis takes the head, and makes it the nest item in the list
            (head) = (head).next;
        }
    }

    // Function to find if the array is empty
    @Override
    public boolean isEmpty() {
        // Returns whether the head is null or not
        // If it is null, then it's empty
        return ((head) == null);
    }

    // Method to print out the array
    @Override
    public String toString() {
        // Sets the current node as the head to iterate in the futre
        Node currNode = (head);
        // Creates a counter, as we use a while loop instead of a for loop
        int i = 0;
        
        // Beginning of string
        String result = "[";
        // While loop to iterate through the list
        while (currNode != null) {
            // Checks to see if the first item has already been added to add commas
            if (i > 0) {
                // Adds commas to the string
                result = result + ", ";
            }
            // Addes the info of the current node from the PriorityItem to the string
            result = result + currNode.nodeInfo;
            // Moves the current node to the next item
            currNode = currNode.next;
            // Iterates the counter
            i++;
        }
        
        // Adds the ending brace and returns the result
        result = result + "]";
        // Returns the result string
        return result;
    }

    
}
