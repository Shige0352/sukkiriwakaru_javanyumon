package chapter9;

public class Main9_24 {
	public class Hero {
		String name;
		int hp;
		static int money;

		static void setRandomMoney() {
			Hero.money = (int) (Math.random() * 1000);
			System.out.println(this.name + "達の所持金を初期化します");
		}
	}

}
