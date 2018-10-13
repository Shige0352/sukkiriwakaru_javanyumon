package chapter11;

public class Main11_2 {
	public class SuperHero {
		private String name = "ミナト";
		private int hp = 100;
		private boolean flying;

		public boolean attack(Matango m) {
			System.out.println(this.name + "の攻撃");
			m.hp -= 5;
			System.out.println("5ポイントのダメージを与えた");

		}

		public void run() {
			System.out.println(this.getName() + "逃げ出した");
		}

		public void fly() {
			this.flying = true;
			System.out.println("飛び上がった");


		}

		public void land() {
			this.flying = false;
			System.out.println("着地した");
		}
	}

}
