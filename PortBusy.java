/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sohesh
 */
    import java.net.ServerSocket;
import java.io.IOException;
    
public class PortBusy {
    
 public static void main(String args[]) 
 {
  for(int i = 0; i < 65536; i++) 
  {
    try 
    {
      ServerSocket serversock = new ServerSocket(i);
      serversock.close();        		
    }
    catch(IOException e) 
    {
      System.out.println( i + " Port is busy");
    }
  }
 }
}
    
