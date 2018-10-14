package chapter13;

public class Main13_5 {

	public static void main(String[] args) {
		Slime slime = new Slime();
		Monster m = new Slime();
		s.run();
		m.run();

	}



	public abstract class Monster {
		public void run() {
			System.out.println("モンスターはひげ出した");
		}
	}

	public class Slime extends Monster {
		public void run() {
			System.out.println("スライムはササさっと逃げ出した");
		}
	}



}
