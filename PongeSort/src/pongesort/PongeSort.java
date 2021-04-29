/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongesort;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicola.cristian
 */
public class PongeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        try {
       Socket server;
      
            server = new Socket("127.0.0.1", 5500);       

    
      ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
         
        String all= "abcdefghilmnopqrstuvz";
        char[]array= new char[10];
        
        
        for (int i = 0; i < array.length; i++) {
            array[i]=all.charAt((int)(Math.random()*20));
            System.out.print(array[i]);
        }
       
        
        out.writeObject(array);
        out.flush();
        
        
        Thread.sleep(100000);
        
        
        
        
        
           } catch (IOException ex) {
            Logger.getLogger(PongeSort.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(PongeSort.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        
        
        
    }
    
}
