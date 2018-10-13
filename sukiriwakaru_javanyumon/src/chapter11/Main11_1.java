package chapter11;

public class Main11_1 {
	private String name = "ミナト";
	private int hp = 100;

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ぽイントのダメージを与えた");

	}

	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

}
