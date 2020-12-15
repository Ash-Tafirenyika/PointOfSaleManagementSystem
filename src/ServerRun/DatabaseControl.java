/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerRun;

import java.io.IOException;
import java.sql.*;
/**
 *
 * @author Dr~Newt
 */
public class DatabaseControl {
    
    PreparedStatement pst;
    
    public Connection Conec() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/maindb","root","");  
                Statement stmt = con.createStatement();
                
         return con;       
	}catch(SQLException | ClassNotFoundException e) {
            System.out.print(e);
            //case of a connection failure
            return null;
        }
        
}
	
	void SaveData() {
            
	}
	
	public void EditDbInfo() {
		
	}	
	
	public void DeleteDbInfo() {
		
	}
	
	public void UpdateDB() {
		
	}
}
