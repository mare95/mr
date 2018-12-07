import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


public class Uries {
	public static void main(String[] args) {
		
		try {
			URL uri1= new URL(args[0]);
			URL uri2= new URL(args[1]);
			
			if(uri1.getHost()==uri2.getHost() || uri1.getPort()==uri2.getPort()
					|| uri1.getPath()==uri2.getPath())
				System.out.println("DA");
			else
				System.out.println("NE");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
