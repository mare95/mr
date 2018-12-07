package primer1;

import java.io.*;
import java.net.*;
import java.util.*;


public class OReillyByName {
	
	public static int getVersion(InetAddress ia) {
		byte[] address = ia.getAddress();

		for (int i = 0; i < address.length; i++) {
			int bajt = address[i] < 0 ? address[i] + 256 : address[i];
			System.out.println(bajt + " ");
		}

		if (address.length == 4) {
			return 4;
		} else if (address.length == 16) {
			return 6;
		} else return -1;
		
	}
	
	public static String lookup (String host) {
		try {
			InetAddress address = InetAddress.getByName(host);
			if (isHostName(host)) {
				return address.getHostAddress();
			} else {
				return address.getHostName();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return "Ne moz nesto";
		}
	}
	
	public static boolean isHostName (String input) {
		// if it is ipv6 address
		if (input.indexOf(":") != -1) {
			return false;
		}
		
		// if it is ipv4
		char[] characters = input.toCharArray();
		for (int i = 0; i < characters.length; i++) {
			if (!Character.isDigit(characters[i])) {
				if (characters[i] != '.') {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static boolean isSpammer (String host) {
		String query = "sbl.spamhaus.org";
		try {
			InetAddress adresa = InetAddress.getByName(host);
			byte[] bajtovi = adresa.getAddress();
			for (byte b: bajtovi) {
				int bajt = b < 0 ? b + 256 : b;
				query = bajt + "." + query;
			}
			
			InetAddress.getByName(query);
			return true;
		} catch (UnknownHostException e) {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// OVO JE ZADATAK IZ JAVE?????
		MOZE NEKO DA ODGOVORI DA LI JE OVO ZADATAK IZ JAVE ??????????
			
			izgleda da jeste ali da treba da se menja fja koja moza da pristupa http
//		try {
//			InetAddress math = InetAddress.getByName("www.math.rs");
//			InetAddress matf = InetAddress.getByName("www.matf.bg.ac.rs");
//			System.out.println(math);
//			System.out.println(matf);
//			if (matf.equals(math)) {
//				System.out.println("math.rs is same as matf.bg.ac.rs");
//			} else {
//				System.out.println("math is not same as matf");
//			}
//		} catch (UnknownHostException e) {
//			System.out.println("Cannot find oreilly.com");
//		}
		
//		try {
//			InetAddress address = InetAddress.getByName("www.v6.facebook.com");
//			System.out.println(address);
//			System.out.println(Arrays.toString(InetAddress.getAllByName("www.v6.facebook.com")));
//		} catch (UnknownHostException e) {
//			System.out.println("Cannot find v6.facebook.com");
//			e.printStackTrace();
//		}
		
//		try {
//			InetAddress address = InetAddress.getByName("ipv6.google.com");
//			System.out.println(address);
//			System.out.println(Arrays.toString(InetAddress.getAllByName("ipv6.google.com")));
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			InetAddress localHost = InetAddress.getLocalHost();
//			System.out.println(localHost);
//			System.out.println(localHost.getHostName());
//			System.out.println(localHost.getHostAddress());
//			
//			System.out.println("Adresa je ipv" + getVersion(localHost));
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		try {
//			InetAddress local = InetAddress.getByName("127.0.0.1");
//			NetworkInterface ni = NetworkInterface.getByInetAddress(local);
//			if (ni != null) {
//				System.out.println(ni);
//			}
//			
//		} catch (SocketException ex) {
//			ex.printStackTrace();
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		}
		
//		try {
//			Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
//			while (interfaces.hasMoreElements()) {
//				NetworkInterface nextInterface = interfaces.nextElement();
//				System.out.println(nextInterface);
//				System.out.println(nextInterface.getName() + '\t' + nextInterface.getDisplayName() + '\t' + nextInterface.getIndex());
//				
//				Enumeration<InetAddress> interfaceAddresses = nextInterface.getInetAddresses();
//				while (interfaceAddresses.hasMoreElements()) {
//					System.out.println(interfaceAddresses.nextElement());
//				}
//			}
//		} catch (SocketException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter names and IP addresses. Enter exit to quit");
//
//		while(true) {
//			try {
//				String input = in.readLine();
//				if (input.equalsIgnoreCase("exit")) {
//					break;
//				} else {
//					System.out.println(lookup(input));
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		// proveriti da li je adresa sa args spam pomocu api-ja na
		for (String arg: args) {
			if (isSpammer(arg)) {
				System.out.println(arg + " - spammer");
			} else {
				System.out.println(arg + " - legitimate");
			}
		}
		
	}

}
