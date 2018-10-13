package chapter11;

import chapter9.Main9_22.Hero;

public class Main11_3 {
	public class SuperHero extends Hero {
		private boolean flying;
		public void fly() {
			this.flying = ture;
			System.out.println("飛び上がった！");
		}

		public void land() {
			this.flying = false;
			System.out.println("着地した");
		}
	}

}
