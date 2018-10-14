package chapter13;

import chapter13.Main13_2.Character;

public class Main13_8 {
	public class Hero extends Character {
		public void attack(Matango m) {
			System.out.println(this.name + "の攻撃");
			System.out.println("敵に10ポイントのダメージを与えた");
			m.hp -= 10;

		}

		public void attack(Matango m) {
			System.out.println(this.name + "は火の玉を放った");
			System.out.println("敵に10ポイントのダメージ");
			g.hp -= 10;
		}
	}
}
