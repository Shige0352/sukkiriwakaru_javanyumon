package chapter8;

public class Main8_17_3 {
	public class clecic {
		String name;
		int hp;
		int mp;
		final int MAX_HP = 50;
		final int MAX_MP = 10;

		public void selfAid() {
			System.out.println(this.name + "セルフエイドを唱えた！");
			this.hp = this.MAX_HP;
			this.mp -= 5;
			System.out.println("HPが最大まで回復した");
		}
	}

}
