/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerRun;

import UserInterfaceServer.LogInForm;
import java.sql.SQLException;


/**
 *
 * @author Dr~Newt
 */
public class StartServer {
    
    public static void main(String[] args) throws SQLException {
        LogInForm form = new LogInForm();
        form.serverStart();
        //Server2 t = new Server2(8089);
        //t.start();
    }
    
}
