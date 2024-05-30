/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdcds;

/**
 *
 * @author ACER
 */
import java.net.*;
public class HostInfo {
    public static void main(String args[]){
        HostInfo host = new HostInfo();
        host.init();
    }
    public void init() {
    try {
        InetAddress myHost = InetAddress.getLocalHost();
        System.out.println(myHost.getHostAddress());
        System.out.println(myHost.getHostName());
    }
    catch (UnknownHostException ex) {
        System.err.println("Cannot find local host");
    }
}
}
