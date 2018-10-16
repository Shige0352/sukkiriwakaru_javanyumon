package chapter16;

import java.io.InputStream;
import java.net.URL;

public class Main16_3 {
	public static void main(String[] args) throws Exception {

		URL u = new URL("...");
		InputStream is = u.openStream();
		int i = is.read();
		while (i != -1) {
			char c = (char) i;
			System.out.println(c);
			i = is.read();
		}
	}


}
