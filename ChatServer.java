import java.net.*;
import java.io.*;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();

        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream())
        );
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader user = new BufferedReader(
            new InputStreamReader(System.in)
        );

        while (true) {
            System.out.println("Client: " + in.readLine());
            System.out.print("Server: ");
            out.println(user.readLine());
        }
    }
}