package chapter12;

public abstract class Main12_8 {
	public class Character {
		String name;
		int hp;

		public void run() {
			System.out.println(this.name + "逃げ出した");
		}

		public abstract void attack(Matango m);

}
