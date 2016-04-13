/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmantrees;

import java.util.ArrayList;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Muhammet
 */
public class BinarySearchTreeTest {
    BinarySearchTree<Character> Btree;
    
    public BinarySearchTreeTest() 
    {
        Btree=new BinarySearchTree<>();
        Btree.add('a');
        Btree.add('d');
        Btree.add('e');
        Btree.add('b');
        Btree.add('f');
        Btree.add('c');
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
     * Test of main method, of class BinarySearchTree.
     */
    @Test
    public void testMain() {
        ArrayList a1=new ArrayList();
        ArrayList a2=new ArrayList();
        
        a2.add('a');
        a2.add('b');
        a2.add('c');
        a2.add('d');
        a2.add('e');
        a2.add('f');
        
        Iterator iterator=Btree.iter();
        while(iterator.hasNext())
            a1.add(iterator.next());
        
        assertEquals(a1, a2);
    }
    
}
