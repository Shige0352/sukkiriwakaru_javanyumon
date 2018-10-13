package chapter11;

public class Main11_7 {
	public class Hero {

		public final void slip() {
			this.hp -= 5;
			System.out.println(this.getName() + "転んだ");
			System.out.println("5のダメージ");
		}

		public void run() {
			System.out.println(this.getName() + "逃げ出した");
		}
	}

}
