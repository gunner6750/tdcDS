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
import java.io.*;
import java.util.Date;

public class DayTimeServer {

    public final static int daytimePort = 5000;

    public static void main(String[] args) {
        ServerSocket theServer;
        Socket theConnection;
        PrintStream p;
        try {
            theServer = new ServerSocket(daytimePort);
            while (true) {
                theConnection = theServer.accept();
                p = new PrintStream(theConnection.getOutputStream());
                p.println(new Date());
                theConnection.close();
                theServer.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
