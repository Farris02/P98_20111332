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
public class Student_UpdateTest {
    
    public Student_UpdateTest() {
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
     * Test of checkingcode method, of class Student_Update.
     */
    @Test
    public void testCheckingcode() {
        System.out.println("checkingcode");
        String SQL = "SELECT *FROM STUDENTS_INFO";
        Student_Update instance = new Student_Update();
        instance.checkingcode(SQL);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Student_Update.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Student_Update.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
