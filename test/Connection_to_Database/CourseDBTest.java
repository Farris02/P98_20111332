/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection_to_Database;

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
public class CourseDBTest {
    
    public CourseDBTest() {
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
     * Test of main method, of class CourseDB.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        CourseDB.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addingAdminsUsnPswd method, of class CourseDB.
     */
    @Test
    public void testAddingAdminsUsnPswd() throws Exception {
        System.out.println("addingAdminsUsnPswd");
        CourseDB sbs = new CourseDB();
        CourseDB.addingAdminsUsnPswd(sbs);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addingStudents method, of class CourseDB.
     */
    @Test
    public void testAddingStudents() throws Exception {
        System.out.println("addingStudents");
        CourseDB sbs = new CourseDB();
        CourseDB.addingStudents(sbs);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addingCourses method, of class CourseDB.
     */
    @Test
    public void testAddingCourses() throws Exception {
        System.out.println("addingCourses");
        CourseDB sbs = new CourseDB();
        CourseDB.addingCourses(sbs);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkExistedTable method, of class CourseDB.
     */
    @Test
    public void testCheckExistedTable() {
        System.out.println("checkExistedTable");
        String name = "";
        CourseDB instance = new CourseDB();
        instance.checkExistedTable(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnection method, of class CourseDB.
     */
    @Test
    public void testCloseConnection() {
        System.out.println("closeConnection");
        CourseDB instance = new CourseDB();
        instance.closeConnection();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
