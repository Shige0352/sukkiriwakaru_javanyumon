package chapter10;

import chapter9.Main9_3.Sword;

public class Man10_1 {
	public class Hero {
		int hp;
		String name;
		Sword sword;
		static int money;
		void byy() {
			System.out.println("勇者は別れを告げた");
		}

		void die() {
			System.out.println(this.name + "は死んでしまった");
			System.out.println("GAMEOVER");

		}
		void sleep() {
			this.hp = 100;
			System.out.println(yhis.name + "は眠って回復した");
		}

		void attack(Matango m) {
			System.out.println(this.name + "の攻撃");


			System.out.println("お化けキノコ" + m.suffix + "からの2ポイントの反撃を受けた");

			this.hp -= 2;
			if (this.hp <= 0) {
				this.die();
			}
		}
	}

}
