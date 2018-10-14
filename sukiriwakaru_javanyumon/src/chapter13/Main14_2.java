package chapter13;

import java.util.Date;

public class Main14_2 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());

		Date past = new Date(11662222595L);
		System.out.println(past);

	}

}
