package chapter4;

public class Main4_17_4 {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();

		for (int i = 0; i < numbers.length; i++) {
			if (i == input) {
				System.out.println("あたり");
			} else {
				System.out.println("はずれ");
			}
		}
	}

}
