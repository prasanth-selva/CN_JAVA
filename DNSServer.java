import java.net.*;
import java.util.HashMap;

public class DNSServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9876);

        HashMap<String, String> dns = new HashMap<>();
        dns.put("google.com", "142.250.190.78");

        byte[] buffer = new byte[1024];

        while (true) {
            DatagramPacket req = new DatagramPacket(buffer, buffer.length);
            socket.receive(req);

            String domain = new String(req.getData(), 0, req.getLength());
            String ip = dns.getOrDefault(domain, "Not Found");

            DatagramPacket res = new DatagramPacket(
                ip.getBytes(),
                ip.length(),
                req.getAddress(),
                req.getPort()
            );

            socket.send(res);
        }
    }
}