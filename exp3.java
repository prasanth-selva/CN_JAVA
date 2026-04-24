import java.net.*;
import java.io.*;

public class exp3 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 1234);

        BufferedReader user = new BufferedReader(
            new InputStreamReader(System.in)
        );

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream())
        );

        System.out.print("Enter msg: ");
        String msg = user.readLine();

        out.println(msg);
        System.out.println(in.readLine());

        s.close();
    }
}
