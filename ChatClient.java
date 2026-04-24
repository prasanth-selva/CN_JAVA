import java.net.*;
import java.io.*;

public class ChatClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);

        BufferedReader user = new BufferedReader(
            new InputStreamReader(System.in)
        );
        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream())
        );
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        while (true) {
            System.out.print("Client: ");
            out.println(user.readLine());
            System.out.println("Server: " + in.readLine());
        }
    }
}