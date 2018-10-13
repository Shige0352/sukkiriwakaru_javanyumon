package chapter12;

public class Main12_10 {
	public class void Dancer extends Character {
		public Void dance() {
			System.out.println(this.name + "は情熱的に踊った");
		}
	}

	public void attack(matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}


}
