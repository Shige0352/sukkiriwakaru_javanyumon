package chapter15;

public class Main15_7 {
	public static void main(String[] args) {
		try {
			throw new UnsuppotedMusicFileEcxeption("未対応のファイルです");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
