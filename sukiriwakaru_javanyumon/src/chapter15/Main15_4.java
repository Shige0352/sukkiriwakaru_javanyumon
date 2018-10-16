package chapter15;

import java.io.FileWriter;

public class Main15_4 {
	public static void main(String[] args) {
		FileWriter fw = null;

		try {
			FileWriter fw = new FileWriter("date.text");
			fw.write("Hello");

		} catch (Exception e) {
			System.out.println("エラーが発生しました");

		}
		fw.close();


	}

}
