/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaceServer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dr~Newt
 */
public class UsersFormTest {
    
    public UsersFormTest() {
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
     * Test of updateTable method, of class UsersForm.
     */
    @Test
    public void testUpdateTable() {
        System.out.println("updateTable");
        UsersForm instance = new UsersForm();
        instance.updateTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class UsersForm.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UsersForm.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
