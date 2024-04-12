package java_socket;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5678);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println("Received: " + line);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

