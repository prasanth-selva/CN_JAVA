import java.io.*;
import java.net.URL;

public class exp1{
	public static void main(String[] arg){
		try{
			URL url = new URL("www.google.com");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openstream()));
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("output.html"));
			
			String line;
			
			while((line = br.readLine())!=null){
			bw.write(line);
			}

			br.close();
			bw.close();

		System.out.println("Bluethooth device ");
		}
			catch (Exception e){System.out.println(e);
		}
	}
}

