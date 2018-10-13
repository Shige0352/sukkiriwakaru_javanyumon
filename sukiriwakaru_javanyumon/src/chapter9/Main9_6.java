package chapter9;

import chapter9.Main9_3.Sword.Hero;

public class Main9_6 {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "Minato";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
		Wixard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h3);

	}

}
