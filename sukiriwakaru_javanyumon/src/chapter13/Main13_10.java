package chapter13;

import chapter13.Main13_5.Monster;
import chapter13.Main13_5.Slime;

public class Main13_10 {
	public static void main(String[] args) {
		Monster[] monsters = new Monster[3];
		monster[0] = new Slime();
		monster[1] = new Goblin();
		monster[2] = new DeathBat();

		for (Monster m : monster) {
			m.run();
		}
	}

}
