/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientRun;

import ClientRun.*;
import UserIntefaceClient.ClientSetupMenu;
import UserIntefaceClient.LogInFormC;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dr~Newt
 */
public class ClientPOS {
    
    private Socket _client;
    private String _ServerName = "localhost";
    private int _port = 8089;
    private boolean connectionState;
   
    public ClientPOS(){
        try {
            this._client = new Socket(_ServerName, _port);
        } catch (IOException ex) {
            Logger.getLogger(ClientPOS.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    public void getConnection() throws IOException{
      
        if (getSocket()== null){
            JOptionPane.showMessageDialog(null, "Server not found");
            new ClientSetupMenu().setVisible(true);
            this.connectionState = false;
        }
        else{
            System.out.println("-------------------Point of Sale Client-----------------------");
            System.out.println("..............................................................\n\n");
            System.out.println("=====================Welcome to ServerName Point of sale System ======================");
            this.connectionState = true;
            new LogInFormC().setVisible(true);
        }
    }
 
    public String GetString() throws IOException{
     if (_client == null){
         System.out.println("Server:\tEmpty Socket client. Please retry");
         return "FATALeRROR";
     }
     DataInputStream in = new DataInputStream(
     _client.getInputStream());
     
     String resp = in.readUTF();
     System.out.println("Server Says:\t" + resp);
     return resp; 
 }
 
    public void SendString(String data) {
        if (_client == null) {
            System.out.println("Client:\tEmpty Socket client. Please retry");
            return;
        }
        OutputStream oStream;
        try {
            System.out.println("Client:\tSending data:" + data);
            oStream = _client.getOutputStream();
            DataOutputStream out = new DataOutputStream(oStream);
            out.writeUTF(data);           
        } catch (IOException e) {
        }
    }
    
        public boolean getConnectionState(){
            return connectionState;
        }

        public Socket getSocket(){
             return _client;
         }

        public void setPort(int arg1){
            this._port = arg1;
        }

        public void setHost(String arg){
                this._ServerName = arg;
        }
        
        public void setSocket(String arg ,int arg2) throws IOException{
            this._client = new Socket(arg,arg2);
        }
      
}
