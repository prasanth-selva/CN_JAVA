import java.net.*;
import java.io.*;

public class exp2 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();

        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream())
        );

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        String msg = in.readLine();
        out.println("Echo: " + msg);

        s.close();
        ss.close();
    }
}
