package chapter13;

import chapter11.Main11_10.Hero;
import chapter13.Main13_2.Wizard;

public class Main13_6 {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		Thief t1 = new Thief();
		Wizard w1 = new Wizard();
		Wizard w2 = new Wizard();


		h1.setHp(h1.getHp() + 50);
		h2.setHp(h2.getHp() + 50);
		t1.setHp(t1.getHp() + 50);
		w1.setHp(w1.getHp() + 50);
		w2.setHp(w2.getHp() + 50);
	}

}
