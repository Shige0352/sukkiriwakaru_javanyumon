package chapter16;

import java.io.FileReader;

public class Main16_2 {
	public static void main(String[] args) throws Exception {
		String fileName = "...";
		FileReader fw = new FileReader(fileName);
		fw.write('そ');
		fw.write('れ');
		fr.close();

}
