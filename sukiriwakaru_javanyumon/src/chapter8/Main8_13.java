package chapter8;

public class Main8_13 {
	public static void main(String[] args) {
		//勇者を生成
		Hero h = new Hero();

		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出した");

		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}

}
