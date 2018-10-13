package chapter10;

import chapter9.Main9_3.Sword;

public class Man10_4 {
	public class Hero {
		private int hp;
		String name;
		Sword sword;
		static int money;

		void sleep() {
			this.hp = 100;
			System.out.println(this.name + "は眠って回復した");
		}
	}

}
