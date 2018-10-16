package chapter15;

import java.io.FileWriter;
import java.io.IOException;

public class Main15_2 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("date.text");

		} catch (IOException e) {
			System.out.println("エラーが発生しました");

		}

	}

}
