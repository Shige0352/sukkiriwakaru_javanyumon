package chapter5;

public class Main5_15_2 {
	public static void main(String[] args) {
		String title = "お誘い";
		String address = "info@";
		String text = "今日ごはんいきませんか？";
		email(title,address, text);
		
	}
	
	public static void email(String title, String address, String text) {
		System.out.println("「" + address + "」に以下のメールを送信しました");
		System.out.println("件名:「 " + title + "」");		
		System.out.println("本文:「 " + text + "」");		
	}

}
