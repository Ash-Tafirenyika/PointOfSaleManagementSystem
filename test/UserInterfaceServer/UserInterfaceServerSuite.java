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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Dr~Newt
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({UserInterfaceServer.UsersFormTest.class, UserInterfaceServer.UserAdditionFormTest.class, UserInterfaceServer.AddStockTest.class, UserInterfaceServer.splashFormTest.class, UserInterfaceServer.StockViewTest.class, UserInterfaceServer.ReportFormTest.class, UserInterfaceServer.LogInFormTest.class, UserInterfaceServer.SystemSetupWindowTest.class, UserInterfaceServer.BackOfficeManagementFormTest.class, UserInterfaceServer.ConfiguratioFormTest.class})
public class UserInterfaceServerSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
