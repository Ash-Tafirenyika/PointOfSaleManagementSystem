/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerRun;

import UserInterfaceServer.LogInForm;
import UserInterfaceServer.ManagementForm;
import java.awt.List;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Dr~Newt
 */

public class Server2 extends Thread {
        private ServerSocket serverSocket;
        private int barcode;
        private boolean t;
        private String Request,pass,uname;
        private String toDictionary = "FATALeRROR";
        private String test = null;
        private DatabaseControl ctr = new DatabaseControl();
        private ResultSet rs = null;
        private String[] v = {"uname","pass"};
        //private List<ServerClients> = new ArrayList<ServerClients>();
        public Server2(int port) {
            try {
                serverSocket = new ServerSocket(port);
                serverSocket.setSoTimeout(180000);
            } catch (IOException e) { 
                JOptionPane.showMessageDialog(null, "Server Running already!","WARNING .... ",JOptionPane.WARNING_MESSAGE);
                System.exit(0);
                //e.printStackTrace();
            }
        }
        
         

        @Override
        @SuppressWarnings("empty-statement")
        public void run() {
            OutputStream oStream;
            while (true) {
                
                    System.out.println("Server:\tWaiting for client on port "
                            + serverSocket.getLocalPort() + "…");               
                    try (Socket server = serverSocket.accept()) {
                        System.out.println("Server:\tJust connected to " + server.getRemoteSocketAddress());
                        ManagementForm form = new ManagementForm();
                        form.com.setText(String.valueOf(server.getRemoteSocketAddress()));
                        DataInputStream in = new DataInputStream(
                                server.getInputStream());
                        oStream = server.getOutputStream();
                        DataOutputStream out = new DataOutputStream(oStream);
                        
                        String req = in.readUTF();
                        this.Request = req;
                        System.out.println("Server:\t\t Got Data : " + Request);
                        out.writeUTF(processDat());
                        System.out.println("Server:\tSending data :" + processDat());
                        
                        
                        server.close();
                } catch (SocketTimeoutException s) {
                    System.out.println("Socket timed out!");
                    break;
                } catch (IOException e) {
                    
                    break;
                } catch (SQLException ex) {
                    
                    Logger.getLogger(Server2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
}        
        public String processDat() throws SQLException{
            int p = 0;
            
            String[] m = Request.split(":");
            System.out.println(m[0]);
            switch (m[0]) {
                case "SBDR":
                    test = itemDetails(Integer.parseInt(m[1]));
                    this.toDictionary = test;
                    break;
                case "lg":
                    this.pass = m[2];
                    this.uname = m[1];
                    test = "success";
                    this.toDictionary = test;
                    break;
                case "SALE":
                    test = "success";
                    saveSaleRec(Integer.parseInt(m[1]),m[2],Integer.parseInt(m[3]),Integer.parseInt(m[4]),Integer.parseInt(m[5]),m[6]);
                    this.toDictionary = "srRECEIVED";
                    break;
                default:
                    this.toDictionary="FATALeRROR";
                    break;
            }
            System.out.println("m:\t username : " + toDictionary +" "+ "password : " + test);
            return toDictionary;
        }
        
        public String getPassword(){
            return v[1];
        }
        
        public String getUsername(){
            return v[0];
        }
        
        public void saveSaleRec(int arg,String arg1,int arg2,int arg3,int arg4,String arg5) throws SQLException{
            DatabaseControl db = new DatabaseControl();
            String myQuery = "INSERT INTO `sales` (`saleID`, `tilliD`, `barcode`, `QuantityPurchased`, `totalCost`, `Date`) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = db.Conec().prepareStatement(myQuery);
            
            pst.setInt(1, arg);
            pst.setString(2, arg1);
            pst.setInt(3, arg2);
            pst.setInt(4, arg3);
            pst.setInt(5, arg4);
            pst.setString(6, arg5);
            pst.execute();
        }
        public String itemDetails(int barcode) throws SQLException{
            
            String myQuery = "Select * from stocks where ItemBarcode ='"+barcode+"'";
            rs = ctr.Conec().prepareStatement(myQuery).executeQuery();
            rs.next();
            return rs.getString(2)+":"+rs.getInt(7)+":"+rs.getInt(8);
        }
         
        public String getCLog() throws SQLException{
            String state = "success";
            LogInForm obj1 = new LogInForm();
            //obj1.LogIn(pass,uname);
            if (obj1.logInSt==true){
                state = "success";
            }
            return state;
        }
        
}
