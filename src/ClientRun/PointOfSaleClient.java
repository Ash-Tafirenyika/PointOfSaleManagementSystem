/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientRun;

import ClientRun.ClientPOS.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Dr~Newt
 */
public class PointOfSaleClient {
    
    protected String host = "127.0.0.1";
    protected int port = 32000;
    protected Socket socket = null;
    PrintWriter out;
    BufferedReader input;
    
    private String Name;
    private int Price;
    private String InvoiceNum;
    
    private boolean connectionState ;
    
    public PointOfSaleClient(){
        try {
            this.socket = new Socket(host, port);
            connectionState = true;
        } catch (IOException e) {
            connectionState = false;
      }
    }
    
     public boolean getConnectionState(){
            return connectionState;
    }
     
     public int getPort(){
            return port;
    }
     
     public String getHost(){
         return host;
    }
     
    
    
    public void setPort(String arg1){
        port = Integer.parseInt(arg1);
    }
    
    public void setHost(String arg){
            host = arg;
    }
    
    public void SendString(String data) {
        if (socket == null) {
            System.out.println("Client:\tEmpty Socket client. Please retry");
            this.connectionState = false;
            return;
        }
        OutputStream oStream;
        try {
            System.out.println("Client:\tSending data:" + data);
            oStream = socket.getOutputStream();
            DataOutputStream out = new DataOutputStream(oStream);
            out.writeUTF(data);           
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
     public void ToServer(String arg){
         try{
             System.out.println(socket);
            PrintWriter outpt;
            outpt = new PrintWriter(socket.getOutputStream(), true);
             
            outpt.println(arg);
            outpt.flush();      
           
            System.out.println("Data sent" + arg);
        } catch (IOException e) {
            connectionState = false;
        }
     }
     
     public String FromServer(){
         String i = null;
         try {
            BufferedReader inpt;
            inpt = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            i = inpt.readLine();
            connectionState = true;
            
            System.out.println("======== Data received ====== ");
            System.out.println("-------> " + i);
        } catch (IOException e) {
            connectionState = false;
        }
         return i;
     }
     public Socket getSocket() throws IOException{
         
         return socket;
     }
     
     public void CloseConnection() throws IOException{
         
     }
     
     public void ConnectionEstablished(){
         
     }
     
     public void ConnectionClosed() throws IOException{

     
     }
     
     public void ConnectionException(){
     
     }
     
     public String itemName(){
        this.Name = FromServer();
        return Name;
    }
    
    public int ItemPrice(){
        this.Price = Integer.parseInt(FromServer());
        return Price;
    }
    
     public String InvoiceNum(){
        this.InvoiceNum = "";
        return InvoiceNum;
    }
}
