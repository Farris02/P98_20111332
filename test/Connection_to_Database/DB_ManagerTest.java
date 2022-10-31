/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection_to_Database;

import java.sql.Connection;
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
public class DB_ManagerTest {
    
    public DB_ManagerTest() {
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
     * Test of main method, of class DB_Manager.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DB_Manager.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class DB_Manager.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        DB_Manager instance = new DB_Manager();
        Connection result = instance.getConnection();
        Connection expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of establishConnection method, of class DB_Manager.
     */
    @Test
    public void testEstablishConnection() {
        System.out.println("establishConnection");
        DB_Manager instance = new DB_Manager();
        instance.establishConnection();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnections method, of class DB_Manager.
     */
    @Test
    public void testCloseConnections() {
        System.out.println("closeConnections");
        DB_Manager instance = new DB_Manager();
        instance.closeConnections();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
