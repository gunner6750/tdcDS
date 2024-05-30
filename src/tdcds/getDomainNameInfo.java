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
public class getDomainNameInfo {
    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }
        String domainName = args[0];
        String hostname = "whois.internic.net";
        int port= 43;
        try (Socket socket = new Socket( hostname, port

                        )) {
        OutputStream output = socket.getOutputStream();
                        PrintWriter writer =new PrintWriter(output
                        , 
                        true
                        );
        writer.println(domainName
                        );
        InputStream input =socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input
                ));
        String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                
            
        }
        } catch (UnknownHostException ex) {
        System.out.println("Server not found: " + ex.getMessage());
        }catch (IOException ex) {
                                System.out.println(
                            "I/O error:" + ex.getMessage());
        }
}
}
