import java.util.*;

public class ARP {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("192.168.1.1", "AA:BB");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP: ");
        String ip = sc.nextLine();

        System.out.println("MAC: " + map.get(ip));
    }
}