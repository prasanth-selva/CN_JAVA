import java.net.*;
import java.io.*;

public class DNSClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("localhost");

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.print("Enter domain: ");
        String domain = br.readLine();

        DatagramPacket req = new DatagramPacket(
            domain.getBytes(),
            domain.length(),
            ip,
            9876
        );

        socket.send(req);

        byte[] buffer = new byte[1024];
        DatagramPacket res = new DatagramPacket(buffer, buffer.length);
        socket.receive(res);

        System.out.println("IP: " +
            new String(res.getData(), 0, res.getLength()));
    }
}
