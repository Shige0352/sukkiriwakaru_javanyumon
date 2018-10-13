package chapter11;

import chapter9.Main9_22.Hero;

public class Main11_9 {
	public class Superhero extends Hero {
		public void attack(Matanago m) {
			super.attack(m);
			if (this.flying) {
				super.attack(m);
			}
		}
	}

}
