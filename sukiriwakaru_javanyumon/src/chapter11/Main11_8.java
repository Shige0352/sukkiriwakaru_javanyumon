package chapter11;

public class Main11_8 {
	public class SuperHero extends Hero {
		public void attack(matango m) {
			System.out.println(this.name + "の攻撃！");
			m.hp -= 5;
			System.out.println("5ポイントのダメージを与えた");

			if (this.flying) {
				System.out.println(this.name + "の攻撃");
				m.hp -= 5;
				System.out.println("５のポイントのダメージを与えた");
			}
		}

	}

}
