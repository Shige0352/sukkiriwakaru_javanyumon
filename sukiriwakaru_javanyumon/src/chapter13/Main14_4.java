package chapter13;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Main14_4 {
	public static void main(String[] args) throws Exception {

		Date now = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");

		String s = f.format(now);
		System.out.println(s);

		Date date = f.parse("2011/09/22 01:2:45");


	}

}
