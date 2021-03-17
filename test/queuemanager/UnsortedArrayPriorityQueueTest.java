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
public class UnsortedArrayPriorityQueueTest {
    
    public UnsortedArrayPriorityQueueTest() {
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
     * Test of head method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testHead1() throws Exception {
        System.out.println("head1");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        instance.add(person2, priority2);
        instance.add(person5, priority5);
        instance.add(person1, priority1);
        instance.add(person3, priority3);
        
        // Creating the expected result string
        Object expResult = "Philippines";
        // Getting the result that the method creates
        Object result = instance.head().getName();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of head method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testHead2() throws Exception {
        System.out.println("head2");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        
        instance.add(person5, priority5);
        instance.add(person2, priority2);
        instance.add(person3, priority3);
        instance.add(person4, priority4);
        instance.add(person1, priority1);
        
        // Creating the expected result string
        Object expResult = "Poland";
        // Getting the result that the method creates
        Object result = instance.head().getName();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of head method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testHead3() throws Exception {
        System.out.println("head3");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        instance.add(person2, priority2);
        instance.add(person1, priority1);
        instance.add(person3, priority3);
        instance.add(person5, priority5);
        
        // Creating the expected result string
        Object expResult = "United Kingdom";
        // Getting the result that the method creates
        Object result = instance.head().getName();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of head method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testHead4() throws Exception {
        System.out.println("head4");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        instance.add(person5, priority5);
        instance.add(person4, priority4);
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
     * Test of head method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testHead5() throws Exception {
        System.out.println("head5");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        
        instance.add(person3, priority3);
        instance.add(person1, priority1);
        instance.add(person2, priority2);
        instance.add(person5, priority5);
        instance.add(person4, priority4);
        
        // Creating the expected result string
        Object expResult = "United States";
        // Getting the result that the method creates
        Object result = instance.head().getName();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of head method, of class UnsortedArrayPriorityQueue.
     */
    @Test(expected = Exception.class)
    public void testHead6() throws Exception {
        System.out.println("head6");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
                
        // Getting the result that the method creates
        Object result = instance.head();
    }

    /**
     * Test of add method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testAdd1() throws Exception {
        System.out.println("add1");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
     * Test of add method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testAdd2() throws Exception {
        System.out.println("add2");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
        // Adding 2 strings with priorities to test
        Person person1 = new Person("Australia");
        int priority1 = 9;
        Person person2 = new Person("Canada");
        int priority2 = 33;
        
        instance.add(person2, priority2);
        instance.add(person1, priority1);
        
        // Creating the expected result string
        Object expResult = "[(Canada, 33), (Australia, 9)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testAdd3() throws Exception {
        System.out.println("add3");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
        // Adding 3 strings with priorities to test
        Person person1 = new Person("Bahamas");
        int priority1 = 12;
        Person person2 = new Person("China");
        int priority2 = 37;
        Person person3 = new Person("Indonesia");
        int priority3 = 79;
        
        instance.add(person1, priority1);
        instance.add(person2, priority2);
        instance.add(person3, priority3);
        
        // Creating the expected result string
        Object expResult = "[(Bahamas, 12), (China, 37), (Indonesia, 79)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testAdd4() throws Exception {
        System.out.println("add4");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
        // Adding 4 different strings with different priorities to test
        Person person1 = new Person("Belgium");
        int priority1 = 17;
        Person person2 = new Person("Denmark");
        int priority2 = 47;
        Person person3 = new Person("Japan");
        int priority3 = 86;
        Person person4 = new Person("Norway");
        int priority4 = 130;
        
        instance.add(person2, priority2);
        instance.add(person4, priority4);
        instance.add(person3, priority3);
        instance.add(person1, priority1);
        
        // Creating the expected result string
        Object expResult = "[(Denmark, 47), (Norway, 130), (Japan, 86), (Belgium, 17)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testAdd5() throws Exception {
        System.out.println("add5");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        
        instance.add(person4, priority4);
        instance.add(person3, priority3);
        instance.add(person1, priority1);
        instance.add(person5, priority5);
        instance.add(person2, priority2);
        
        // Creating the expected result string
        Object expResult = "[(Norway, 130), (Japan, 86), (, 17), (United States, -187), (Denmark, 47)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testAdd6() throws Exception {
        System.out.println("add6");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        int priority5 = 187;
        
        instance.add(person1, priority1);
        instance.add(person3, priority3);
        instance.add(person5, priority5);
        instance.add(person4, priority4);
        instance.add(person2, priority2);
        
        // Creating the expected result string
        Object expResult = "[(, 17), (Japan, 86), (United States, 187), (Norway, 130), (Denmark, 47)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testRemove1() throws Exception {
        System.out.println("remove1");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        
        instance.add(person1, priority1);
        instance.add(person2, priority2);
        instance.add(person4, priority4);
        instance.add(person3, priority3);
        instance.add(person5, priority5);
        
        instance.remove();
        
        // Creating the expected result string
        Object expResult = "[(Argentina, 7), (Brazil, 24), (Mexico, 111), (Germany, 65)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of remove method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testRemove2() throws Exception {
        System.out.println("remove2");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        instance.add(person3, priority3);
        instance.add(person5, priority5);
        instance.add(person4, priority4);
        
        instance.remove();
        
        // Creating the expected result string
        Object expResult = "[(Australia, 9), (India, 78), (Netherlands, 123)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of remove method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testRemove3() throws Exception {
        System.out.println("remove3");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Bahamas");
        int priority1 = 12;
        Person person3 = new Person("Indonesia");
        int priority3 = 79;
        Person person4 = new Person("North Korea");
        int priority4 = 128;
        
        instance.add(person4, priority4);
        instance.add(person1, priority1);
        instance.add(person3, priority3);
        
        instance.remove();
        
        // Creating the expected result string
        Object expResult = "[(Bahamas, 12), (Indonesia, 79)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of remove method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testRemove4() throws Exception {
        System.out.println("remove4");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
        // Adding 5 different strings with different priorities to test
        Person person1 = new Person("Belgium");
        int priority1 = 17;
        Person person4 = new Person("Norway");
        int priority4 = 130;
        
        instance.add(person1, priority1);
        instance.add(person4, priority4);
        
        instance.remove();
        
        // Creating the expected result string
        Object expResult = "[(Belgium, 17)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    } 
    
    /**
     * Test of remove method, of class UnsortedArrayPriorityQueue.
     */
    @Test(expected = Exception.class)
    public void testRemove5() throws Exception {
        System.out.println("remove5");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
        
        instance.remove();
    } 

    /**
     * Test of isEmpty method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testIsEmpty1() throws Exception {
        System.out.println("isEmpty1");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
     * Test of isEmpty method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testIsEmpty2() {
        System.out.println("isEmpty2");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
        
        // Creating the expected result boolean
        boolean expResult = true;
        // Getting the result that the method creates
        boolean result = instance.isEmpty();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testToString1() throws Exception {
        System.out.println("toString1");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        instance.add(person1, priority1);
        instance.add(person2, priority2);
        instance.add(person5, priority5);
        instance.add(person3, priority3);
        
        // Creating the expected result string
        Object expResult = "[(Mexico, 111), (Argentina, 7), (Brazil, 24), (Philippines, 139), (Germany, 65)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testToString2() throws Exception {
        System.out.println("toString2");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        
        instance.add(person3, priority3);
        instance.add(person5, priority5);
        instance.add(person4, priority4);
        instance.add(person1, priority1);
        instance.add(person2, priority2);
        
        // Creating the expected result string
        Object expResult = "[(India, 78), (Poland, 140), (Netherlands, 123), (Australia, 9), (Canada, 33)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testToString3() throws Exception {
        System.out.println("toString3");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        
        instance.add(person2, priority2);
        instance.add(person4, priority4);
        instance.add(person5, priority5);
        instance.add(person3, priority3);
        instance.add(person1, priority1);
        
        // Creating the expected result string
        Object expResult = "[(China, 37), (North Korea, 128), (United Kingdom, 186), (Indonesia, 79), (Bahamas, 12)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testToString4() throws Exception {
        System.out.println("toString4");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        
        instance.add(person2, priority2);
        instance.add(person4, priority4);
        instance.add(person3, priority3);
        instance.add(person1, priority1);
        instance.add(person5, priority5);
        
        // Creating the expected result string
        Object expResult = "[(Denmark, 47), (Norway, 130), (Japan, 86), (Belgium, 17), (United States, 187)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testToString5() throws Exception {
        System.out.println("toString5");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
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
        instance.add(person4, priority4);
        instance.add(person1, priority1);
        instance.add(person2, priority2);
        instance.add(person3, priority3);
        
        // Creating the expected result string
        Object expResult = "[(United States, 187), (Norway, 130), (Belgium, 17), (Denmark, 47), (Japan, 86)]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testToString6() throws Exception {
        System.out.println("toString6");
        //Creating an instance to test
        PriorityQueue<Person> instance;
        // Creating an array of size 8
        instance = new UnsortedArrayPriorityQueue<>(8);
        
        // Creating the expected result string
        Object expResult = "[]";
        // Getting the result that the method creates
        Object result = instance.toString();
        // Testing whether the expected result and result are equal to each other
        assertEquals(expResult, result);
    }
    
}
