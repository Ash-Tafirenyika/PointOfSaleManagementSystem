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
public class StockViewTest {
    
    public StockViewTest() {
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
     * Test of UpdateTable method, of class StockView.
     */
    @Test
    public void testUpdateTable() throws Exception {
        System.out.println("UpdateTable");
        StockView instance = new StockView();
        instance.UpdateTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class StockView.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StockView.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
