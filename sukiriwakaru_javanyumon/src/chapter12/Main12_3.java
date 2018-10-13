package chapter12;

public class Main12_3 {
	public class hero extends Character {
		public void attack(Matango m) {
			System.out.println(this.name + "の攻撃！");
			System.out.println("敵に10ポイントのダメージを与えた");
			m.hp -= 10;
		}

	}

}
