/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Stuff;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class Course_UpdateTest {
    
    public Course_UpdateTest() {
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
     * Test of ignoreWhiteSpace method, of class Course_Update.
     */
    @Test
    public void testIgnoreWhiteSpace() {
        System.out.println("ignoreWhiteSpace");
        String s = "";
        String expResult = "";
        String result = Course_Update.ignoreWhiteSpace(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Course_Update.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Course_Update.main(args);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }
    
}
