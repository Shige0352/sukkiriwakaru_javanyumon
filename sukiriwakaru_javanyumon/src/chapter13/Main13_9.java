package chapter13;

import chapter13.Main13_2.Character;

public class Main13_9 {
	public class Hero extends Character {
		public void attack(Matanago m) {
			System.out.println(this.name + "の攻撃");
			System.out.println("敵に10ポイントのダメージを与えた");
			m.hp -= 10;

		}
	}

}
