package chapter12;

import chapter12.Main12_16.Human;

public class Main12_17 {
	public class Fool extends Character implements Human {

		public void attack(Matango m) {
			System.out.println(this.getname() + "は戦わずに遊んでいる");
		}

		public void talk() {}
		public void watch() {}
		public void hear() {}
		public void run() {}
	}

}
