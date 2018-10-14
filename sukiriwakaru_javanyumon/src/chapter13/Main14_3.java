package chapter13;

import java.sql.Date;

public class Main14_3 {
	public static void main(String[] args) {
		Date now = new Date();
		Calender c = Calender.getInstance();
		s.setTime(now);
		int y = c.get(Clender.YEAR);
		System.out.println("今年は" + y + "年です");

		c.set(2010,8,22,1,2,45);
		c.set(Calender.YEAR, 2011);

	}

}
