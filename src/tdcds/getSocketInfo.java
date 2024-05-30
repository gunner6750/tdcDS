/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdcds;

/**
 *
 * @author ACER
 */
import java.net.Socket;
import java.net.*;
import java.io.*;
public class getSocketInfo {
public static void main(String[] args) {
for (int i = 0; i < args.length; i++) {
try {
    Socket theSocket = new Socket (args[i], 80); 
    System.out.println("Connected to" +theSocket.getInetAddress() +
    "on port" + theSocket.getPort () + "from port"+
    theSocket.getLocalPort() +
    theSocket.getLocalAddress());
    theSocket.close();
    } catch (UnknownHostException e) {
    System.err.println("I can't find + args[i]");
    }
    catch (SocketException e) {
        System.err.println("Could not connect to + args[i]");
    } catch (IOException e) {

    System.err.println(e);
    } // end for
    } // end main
    }
}