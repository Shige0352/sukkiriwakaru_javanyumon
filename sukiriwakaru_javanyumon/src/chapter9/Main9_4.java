package chapter9;

import chapter9.Main9_3.Sword;
import chapter9.Main9_3.Sword.Hero;

public class Main9_4 {
	public static void main(Sring[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);

	}

}
