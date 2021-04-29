/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicola.cristian
 */
   /**
     * @param args the command line arguments
     */
public class Server {
    
    public static void main(String[] args) {

        ServerSocket ss;
        try {
          ss = new ServerSocket(5500);   
            System.out.println("Server in ascolto"); 
          Socket s = ss.accept();
          
            System.out.println(s.getInetAddress());
          BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        
      System.out.println(in.readLine());
        
       
}  catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
