package chapter9;

public class Main9_22 {
	public class Hero {
		String name;
		int hp;
		static int money;

		static void setRandomMoney() {
			Hero.money = (int) (Math.random() * 1000)
		}
	}

}
