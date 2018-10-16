package chapter15;

import java.io.FileWriter;

public class Main15_3 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("date.text");
			fw.write("Hello");
			fw.close();

		} catch (Exception e) {
			System.out.println("エラーが発生しました");

		}

	}

}
