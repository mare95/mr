package primer2;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientSockets {

	public static void main(String[] args) {
//		String host = "localhost";
//		System.out.println("Trenutak pocetka: " + new Date());
		
		// pokusavamo da napravimo Socket
		// drugi argument je port koji moze da bude od 0 do 65535
		
//		for (int i = 0; i < 1024; i++) {
//			try (Socket s = new Socket(host, i)) {
//				System.out.println("Found server on the port: " + i);
//				System.out.println("Trenutak pronalazenja: " + new Date());
//			} catch (UnknownHostException ex) {
//				ex.printStackTrace();
//				break;
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		
		// od niza argumenata pokusaj socket da napravis sa tim hostname na portu 80
		// SOCKET INFO
//		for (int i = 0; i < args.length; i++) {
//			try (Socket s = new Socket(args[i], 80))  {
//				System.out.println("Connected to " + s.getInetAddress() + " on port " + s.getPort() +
//						" from port " + s.getLocalPort() + " of " + s.getLocalAddress());
//			} catch (UnknownHostException e) {
//				System.out.println("Ne moze da nadje host " + args[i]);
//			} catch (SocketException e) {
//				System.out.println("Ne moze da se konektuje na host " + args[i]);
//			} catch (IOException e) {
//			}
//		}
		
		
		// citaj iz soketa na ovoj adersi
//		String hostname = "time.nist.gov";
//			try (Socket s = new Socket(hostname, 13)) {
//				System.out.println("@#$$#@$#@$#@$@#$@#");
//				InputStream timeStream = s.getInputStream();
//				int c;
//				StringBuffer time = new StringBuffer();
//				while ((c = timeStream.read()) != -1) {
//					time.append((char) c);
//				}
//				System.out.println("It is " + time.toString().trim() + " at " + hostname);
//			} catch (UnknownHostException e) {
//				System.out.println("Ne moze da nadje host");
//			} catch (IOException e) {
//			}
		
		
		
		
		// upisujemo sa std in-a u socket i odatle da citamo onda 
//		String hostname = "time.nist.gov";
//		try (Socket s = new Socket(hostname, 13)) {
//			System.out.println("dasdasdsadasdadadas");
//			BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
//			PrintWriter out = new PrintWriter(s.getOutputStream());
//			
//			BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
//			// osluskujemo na serveru sta se desava
//			while (true) {
//				System.out.println("=================");
//				String userLine = userIn.readLine();
//				System.out.println("################");
//				if (userLine.equals(".")) {
//					break;
//				}
//				
//				out.println(userLine);
//				out.flush();
//				System.out.println(reader.readLine());
//			}
//		} catch (UnknownHostException e) {
//			System.out.println("Ne zna host ovaj");
//		} catch (IOException e) {
//		}
		
		
		//pokusaj da napravis socket server na localhostu na bilo kom portu
//		String hostname = "localhost";
//		try {
//			InetAddress address = InetAddress.getByName(hostname);
//			for (int i = 0; i< 65535; i++) {
//				Socket s = null;
//				try {
//					s = new Socket(address, i);
//					System.out.println("There is a server on port " + i + " on host " + hostname);
//				} catch (IOException e) {
//				} finally {
//					try {
//						if (s != null) {
//							s.close();
//						}
//					} catch (IOException e) {
//					}
//				}
//			}
//		} catch (UnknownHostException e) {
//			System.out.println("Ne moze na taj host");
//		}
	}

}
