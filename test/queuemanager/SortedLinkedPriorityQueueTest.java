/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonah
 */
public class SortedLinkedPriorityQueueTest {
    
    public SortedLinkedPriorityQueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of head method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testHead1() throws Exception {
        System.out.println("head1");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Argentina");
        int priority1 = 7;
        Person person2 = new Person("Brazil");
        int priority2 = 24;
        Person person3 = new Person("Germany");
        int priority3 = 65;
        Person person4 = new Person("Mexico");
        int priority4 = 111;
        Person person5 = new Person("Philippines");
        int priority5 = 139;
        
        instance.add(person2, priority2);
        instance.add(person1, priority1);
        instance.add(person4, priority4);
        instance.add(person3, priority3);
        instance.add(person5, priority5);
        
        // Creating the expected result string
        Object expResult = "Philippines";
        // Getting the result that the method creates
        Object result = instance.head().getName();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of head method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testHead2() throws Exception {
        System.out.println("head2");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Australia");
        int priority1 = 9;
        Person person2 = new Person("Canada");
        int priority2 = 33;
        Person person3 = new Person("India");
        int priority3 = 78;
        Person person4 = new Person("Netherlands");
        int priority4 = 123;
        Person person5 = new Person("Poland");
        int priority5 = 140;
        
        instance.add(person1, priority1);
        instance.add(person5, priority5);
        instance.add(person3, priority3);
        instance.add(person4, priority4);
        instance.add(person2, priority2);
        
        // Creating the expected result string
        Object expResult = "Poland";
        // Getting the result that the method creates
        Object result = instance.head().getName();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of head method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testHead3() throws Exception {
        System.out.println("head3");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Bahamas");
        int priority1 = 12;
        Person person2 = new Person("China");
        int priority2 = 37;
        Person person3 = new Person("Indonesia");
        int priority3 = 79;
        Person person4 = new Person("North Korea");
        int priority4 = 128;
        Person person5 = new Person("United Kingdom");
        int priority5 = 186;
        
        instance.add(person3, priority3);
        instance.add(person1, priority1);
        instance.add(person4, priority4);
        instance.add(person5, priority5);
        instance.add(person2, priority2);
        
        // Creating the expected result string
        Object expResult = "United Kingdom";
        // Getting the result that the method creates
        Object result = instance.head().getName();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of head method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testHead4() throws Exception {
        System.out.println("head4");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Belgium");
        int priority1 = 17;
        Person person2 = new Person("Denmark");
        int priority2 = 47;
        Person person3 = new Person("Japan");
        int priority3 = 86;
        Person person4 = new Person("Norway");
        int priority4 = 130;
        Person person5 = new Person("United States");
        int priority5 = 187;
        
        instance.add(person5, priority5);
        instance.add(person1, priority1);
        instance.add(person3, priority3);
        instance.add(person4, priority4);
        instance.add(person2, priority2);
        
        // Creating the expected result string
        Object expResult = "United States";
        // Getting the result that the method creates
        Object result = instance.head().getName();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of head method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testHead5() throws Exception {
        System.out.println("head5");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Belgium");
        int priority1 = 17;
        Person person2 = new Person("Denmark");
        int priority2 = 47;
        Person person3 = new Person("Japan");
        int priority3 = 86;
        Person person4 = new Person("Norway");
        int priority4 = 130;
        Person person5 = new Person("United States");
        int priority5 = 187;
        
        instance.add(person4, priority4);
        instance.add(person1, priority1);
        instance.add(person5, priority5);
        instance.add(person3, priority3);
        instance.add(person2, priority2);
        
        // Creating the expected result string
        Object expResult = "United States";
        // Getting the result that the method creates
        Object result = instance.head().getName();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of head method, of class SortedLinkedPriorityQueue.
     */
    @Test(expected = Exception.class)
    public void testHead6() throws Exception {
        System.out.println("head6");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
                
        // Getting the result that the method creates
        Object result = instance.head();
    }

    /**
     * Test of add method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testAdd1() throws Exception {
        System.out.println("add1");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 1 strings with priority to test
        Person person = new Person("Argentina");
        int priority = 7;
        instance.add(person, priority);
        
        // Creating the expected result string
        Object expResult = "[(Argentina, 7)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testAdd2() throws Exception {
        System.out.println("add2");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 2 strings with priorities to test
        Person person1 = new Person("Australia");
        int priority1 = 9;
        Person person2 = new Person("Canada");
        int priority2 = 33;
        
        instance.add(person1, priority1);
        instance.add(person2, priority2);
        
        // Creating the expected result string
        Object expResult = "[(Canada, 33), (Australia, 9)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testAdd3() throws Exception {
        System.out.println("add3");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 3 strings with priorities to test
        Person person1 = new Person("Bahamas");
        int priority1 = 12;
        Person person2 = new Person("China");
        int priority2 = 37;
        Person person3 = new Person("Indonesia");
        int priority3 = 79;
        
        instance.add(person3, priority3);
        instance.add(person1, priority1);
        instance.add(person2, priority2);
        
        // Creating the expected result string
        Object expResult = "[(Indonesia, 79), (China, 37), (Bahamas, 12)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testAdd4() throws Exception {
        System.out.println("add4");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 4 different strings with different priorities to test
        Person person1 = new Person("Belgium");
        int priority1 = 17;
        Person person2 = new Person("Denmark");
        int priority2 = 47;
        Person person3 = new Person("Japan");
        int priority3 = 86;
        Person person4 = new Person("Norway");
        int priority4 = 130;
        
        instance.add(person4, priority4);
        instance.add(person2, priority2);
        instance.add(person1, priority1);
        instance.add(person3, priority3);
        
        // Creating the expected result string
        Object expResult = "[(Norway, 130), (Japan, 86), (Denmark, 47), (Belgium, 17)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testAdd5() throws Exception {
        System.out.println("add5");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("");
        int priority1 = 17;
        Person person2 = new Person("Denmark");
        int priority2 = 47;
        Person person3 = new Person("Japan");
        int priority3 = 86;
        Person person4 = new Person("Norway");
        int priority4 = 130;
        Person person5 = new Person("United States");
        int priority5 = -187;
        
        instance.add(person3, priority3);
        instance.add(person5, priority5);
        instance.add(person4, priority4);
        instance.add(person1, priority1);
        instance.add(person2, priority2);
        
        // Creating the expected result string
        Object expResult = "[(Norway, 130), (Japan, 86), (Denmark, 47), (, 17), (United States, -187)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testAdd6() throws Exception {
        System.out.println("add6");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Belgium");
        int priority1 = 17;
        Person person2 = new Person("Denmark");
        int priority2 = 47;
        Person person3 = new Person("Japan");
        int priority3 = 86;
        Person person4 = new Person("Norway");
        int priority4 = 130;
        Person person5 = new Person("United States");
        int priority5 = -187;
        Person person6 = new Person("Bahamas");
        int priority6 = 12;
        Person person7 = new Person("China");
        int priority7 = 37;
        Person person8 = new Person("Indonesia");
        int priority8 = 79;
        Person person9 = new Person("North Korea");
        int priority9 = 128;
        
        instance.add(person1, priority1);
        instance.add(person2, priority2);
        instance.add(person3, priority3);
        instance.add(person4, priority4);
        instance.add(person5, priority5);
        instance.add(person6, priority6);
        instance.add(person7, priority7);
        instance.add(person8, priority8);
        instance.add(person9, priority9);
        
        // Creating the expected result string
        Object expResult = "[(Norway, 130), (North Korea, 128), (Japan, 86), (Indonesia, 79), (Denmark, 47), (China, 37), (Belgium, 17), (Bahamas, 12), (United States, -187)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testRemove1() throws Exception {
        System.out.println("remove1");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Argentina");
        int priority1 = 7;
        Person person2 = new Person("Brazil");
        int priority2 = 24;
        Person person3 = new Person("Germany");
        int priority3 = 65;
        Person person4 = new Person("Mexico");
        int priority4 = 111;
        Person person5 = new Person("Philippines");
        int priority5 = 139;
        
        instance.add(person4, priority4);
        instance.add(person3, priority3);
        instance.add(person1, priority1);
        instance.add(person2, priority2);
        instance.add(person5, priority5);
        
        instance.remove();
        
        // Creating the expected result string
        Object expResult = "[(Mexico, 111), (Germany, 65), (Brazil, 24), (Argentina, 7)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of remove method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testRemove2() throws Exception {
        System.out.println("remove2");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Australia");
        int priority1 = 9;
        Person person3 = new Person("India");
        int priority3 = 78;
        Person person4 = new Person("Netherlands");
        int priority4 = 123;
        Person person5 = new Person("Poland");
        int priority5 = 140;
        
        instance.add(person1, priority1);
        instance.add(person5, priority5);
        instance.add(person3, priority3);
        instance.add(person4, priority4);
        
        instance.remove();
        
        // Creating the expected result string
        Object expResult = "[(Netherlands, 123), (India, 78), (Australia, 9)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of remove method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testRemove3() throws Exception {
        System.out.println("remove3");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Bahamas");
        int priority1 = 12;
        Person person3 = new Person("Indonesia");
        int priority3 = 79;
        Person person4 = new Person("North Korea");
        int priority4 = 128;
        
        instance.add(person4, priority4);
        instance.add(person3, priority3);
        instance.add(person1, priority1);
        
        instance.remove();
        
        // Creating the expected result string
        Object expResult = "[(Indonesia, 79), (Bahamas, 12)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of remove method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testRemove4() throws Exception {
        System.out.println("remove4");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Belgium");
        int priority1 = 17;
        Person person4 = new Person("Norway");
        int priority4 = 130;
        
        instance.add(person4, priority4);
        instance.add(person1, priority1);
        
        instance.remove();
        
        // Creating the expected result string
        Object expResult = "[(Belgium, 17)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    } 
    
    /**
     * Test of remove method, of class SortedLinkedPriorityQueue.
     */
    @Test(expected = Exception.class)
    public void testRemove5() throws Exception {
        System.out.println("remove5");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        
        instance.remove();
    } 

    /**
     * Test of isEmpty method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testIsEmpty1() throws Exception {
        System.out.println("isEmpty1");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 2 different strings with different priorities to test
        Person person1 = new Person("Bahamas");
        int priority1 = 12;
        Person person2 = new Person("China");
        int priority2 = 37;
        
        instance.add(person1, priority1);
        instance.add(person2, priority2);
        
        // Creating the expected result boolean
        boolean expResult = false;
        // Getting the result that the method creates
        boolean result = instance.isEmpty();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isEmpty method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testIsEmpty2() {
        System.out.println("isEmpty2");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        
        // Creating the expected result boolean
        boolean expResult = true;
        // Getting the result that the method creates
        boolean result = instance.isEmpty();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testToString1() throws Exception {
        System.out.println("toString1");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Argentina");
        int priority1 = 7;
        Person person2 = new Person("Brazil");
        int priority2 = 24;
        Person person3 = new Person("Germany");
        int priority3 = 65;
        Person person4 = new Person("Mexico");
        int priority4 = 111;
        Person person5 = new Person("Philippines");
        int priority5 = 139;
        
        instance.add(person3, priority3);
        instance.add(person4, priority4);
        instance.add(person2, priority2);
        instance.add(person5, priority5);
        instance.add(person1, priority1);
        
        // Creating the expected result string
        Object expResult = "[(Philippines, 139), (Mexico, 111), (Germany, 65), (Brazil, 24), (Argentina, 7)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testToString2() throws Exception {
        System.out.println("toString2");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Australia");
        int priority1 = 9;
        Person person2 = new Person("Canada");
        int priority2 = 33;
        Person person3 = new Person("India");
        int priority3 = 78;
        Person person4 = new Person("Netherlands");
        int priority4 = 123;
        Person person5 = new Person("Poland");
        int priority5 = 140;
        
        instance.add(person4, priority4);
        instance.add(person5, priority5);
        instance.add(person3, priority3);
        instance.add(person2, priority2);
        instance.add(person1, priority1);
        
        // Creating the expected result string
        Object expResult = "[(Poland, 140), (Netherlands, 123), (India, 78), (Canada, 33), (Australia, 9)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testToString3() throws Exception {
        System.out.println("toString3");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Bahamas");
        int priority1 = 12;
        Person person2 = new Person("China");
        int priority2 = 37;
        Person person3 = new Person("Indonesia");
        int priority3 = 79;
        Person person4 = new Person("North Korea");
        int priority4 = 128;
        Person person5 = new Person("United Kingdom");
        int priority5 = 186;
        
        instance.add(person4, priority4);
        instance.add(person1, priority1);
        instance.add(person5, priority5);
        instance.add(person2, priority2);
        instance.add(person3, priority3);
        
        // Creating the expected result string
        Object expResult = "[(United Kingdom, 186), (North Korea, 128), (Indonesia, 79), (China, 37), (Bahamas, 12)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testToString4() throws Exception {
        System.out.println("toString4");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Belgium");
        int priority1 = 17;
        Person person2 = new Person("Denmark");
        int priority2 = 47;
        Person person3 = new Person("Japan");
        int priority3 = 86;
        Person person4 = new Person("Norway");
        int priority4 = 130;
        Person person5 = new Person("United States");
        int priority5 = 187;
        
        instance.add(person5, priority5);
        instance.add(person2, priority2);
        instance.add(person4, priority4);
        instance.add(person1, priority1);
        instance.add(person3, priority3);
        
        // Creating the expected result string
        Object expResult = "[(United States, 187), (Norway, 130), (Japan, 86), (Denmark, 47), (Belgium, 17)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testToString5() throws Exception {
        System.out.println("toString5");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Belgium");
        int priority1 = 17;
        Person person2 = new Person("Denmark");
        int priority2 = 47;
        Person person3 = new Person("Japan");
        int priority3 = 86;
        Person person4 = new Person("Norway");
        int priority4 = 130;
        Person person5 = new Person("United States");
        int priority5 = 187;
        
        instance.add(person1, priority1);
        instance.add(person3, priority3);
        instance.add(person2, priority2);
        instance.add(person4, priority4);
        instance.add(person5, priority5);
        
        // Creating the expected result string
        Object expResult = "[(United States, 187), (Norway, 130), (Japan, 86), (Denmark, 47), (Belgium, 17)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class SortedLinkedPriorityQueue.
     */
    @Test
    public void testToString6() throws Exception {
        System.out.println("toString6");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new SortedLinkedPriorityQueue<>();
        
        // Creating the expected result string
        Object expResult = "[]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
}
