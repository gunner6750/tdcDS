/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tdcds;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
import java.net.Socket;
import java.io.IOException;

/**
 * A command line client for the date server. Requires the IP address of the
 * server as the sole argument. Exits after printing the response.
 */



public class DateTimeClient {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println(
            "Pass the server IP as the sole command line argument");
            //return;
        }
        Socket socket = new Socket("localhost", 5000);
        Scanner in = new Scanner(socket.getInputStream());
        System.out.println("Server response:  "+in.nextLine());
}
}
