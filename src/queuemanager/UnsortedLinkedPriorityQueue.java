/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

/**
 * Implements code found at https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
 * @author Jonah
 * @param <T>
 * Linked priority queue that is sorted 
 * Works on higher number higher priority
*/
public class UnsortedLinkedPriorityQueue<T> implements PriorityQueue<T> {
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
    public void add(T item, long priority) throws QueueOverflowException {
        // This creates a node variable called start, and sets head equal to the start of the list 
        Node start = (head);
        // Creates an object called info which holds the item and priority information passed from the 
        // calling of the method
        Object info = new PriorityItem<>(item, priority);
        // This creates the temp node, by calling the new node function and inserting the newly created object
        Node temp = newNode((PriorityItem<T>) info);
        // this checks to see whether the linked list is empty
        if(isEmpty()) {
            // When it's empty, it sets the head of the array to the temp file and sets the next equal to nothing, as it is the only item
            (head) = temp;
            (head).next = null;
        // This is the if statement that deals for the case when the head is not empty
        } else {
            // If there is a head, it pushes the head down one item, making the temp node the new head
            temp.next = head;
            (head) = temp;
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
            // This creates a node variable called start, and sets head equal to the start of the list 
            Node start = (head);
            // This takes the priority of the head, as the current node is the head
            long priority = (head).nodeInfo.getPriority();
            // This variable takes holds Node with the value with the highest priority
            Node highestPriority = (head);
            
            // While loop that iterates through the linked list to find the node with the highest priority
            while (start != null) {
                // If statement to find whether the current node has a higher priority than the saved priority
                if (start.nodeInfo.getPriority() > priority) {
                    // If it does, the highestPriority is changed to the current node and the priority is updated to the new node
                    highestPriority = start;
                    priority = start.nodeInfo.getPriority();
                }
                // Here we change the node until we find the highest priority node
                start = start.next;
            }
            
            // It takes node that was found and returns the item 
            return highestPriority.nodeInfo.getItem();
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
            // This creates a node variable called start, and sets head equal to the start of the list 
            Node start = (head);
            // This saves the priority of the head to test against it
            long priority = (head).nodeInfo.getPriority();
            // This sets the highest priority node as the head, as it's the first we check
            Node highestPriority = (head);
            // This is a place holder Node for the node before the highest 
            // priority node that need to be removed
            Node removalPoint = (head);
            
            // While loop that iterates through the linked list to find the correct removal point
            while (start != null) {
                // Without this if statement, the saved priority is compared to a null value,
                // Crashing the program
                if (start.next != null) {
                    // If statement to test the priority of the current node vs the saved priority
                    // To find the node with the higher priority
                    if (start.next.nodeInfo.getPriority() > priority) {
                        // If the priority is higher, the highest priority item is changed
                        // To the current node
                        highestPriority = start.next;
                        // The priority is updated to the current node priority
                        priority = start.next.nodeInfo.getPriority();
                        // This changes the value of the removal point to the 
                        // current node, as the next node has a higher priority
                        // than the current node
                        removalPoint = start;
                    }
                }
                // Here we change the node until we find the highest priority node
                start = start.next;
            }
            
            // This if statement deals with finding the node before the highest
            // priority node
            if (highestPriority == (head)){
                // This sets the temp node equal to the head
                Node temp = head;
                // This takes the head, and makes it the nest item in the list
                // Effectively removing the previous head node
                (head) = (head).next;
            // This case handles the case where the highest priority is not the head
            } else {
                // This takes the removed Node and makes it a temp node variable
                Node temp = highestPriority;
                // This takes the pointer of the previous Node and makes it point
                // to the removed Node's pointee
                removalPoint.next = highestPriority.next;
            }
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
