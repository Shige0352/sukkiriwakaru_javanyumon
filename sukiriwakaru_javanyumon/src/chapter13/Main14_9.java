package chapter13;

import chapter11.Main11_10.Hero;

public class Main14_9 {
	String name;
	int hp;


	public String toString() {
		return "名前" + this.name + "/HP:" + this.hp;
	}

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println(h);
	}

}
