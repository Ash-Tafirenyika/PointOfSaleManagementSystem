/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientRun;

import ClientRun.*;
import java.io.IOException;

/**
 *
 * @author Dr~Newt
 */

public class RunPOSclient {
    
    public static void main(String[] args) throws IOException{
        ClientPOS obj = new ClientPOS();
        obj.getConnection();
    }
     
}
