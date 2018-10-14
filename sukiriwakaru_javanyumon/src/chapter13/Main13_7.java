package chapter13;

public class Main13_7 {
	public static void main(String[] args) {
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Hero();
		c[3] = new Hero();
		c[4] = new Hero();

		for (Character cha : c) {
			cha.setHP(cha.getHp() + 50);
		}
	}

}
