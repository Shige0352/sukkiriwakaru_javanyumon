package chapter13;

public class Main13_2 {
	public abstract class Character {
		String name;
		int hp;
		public abstract void attack(Matango M);
		public void run() {}

	}

	public class Wizard extends Character {
		int mp;
		public void attack(Matango m) {
			System.out.println(this.name + "の攻撃");
			System.out.println("敵に3ポイントのダメージ");
			m.hp -= 3;

		}

		public void fireball(Matango m) {
			System.out.println(this.name + "は火の玉を放った");
			System.out.println("敵に20ポイントのダメージ");
			m.hp -= 3;
			this.mp -= 3;
		}
	}

}
