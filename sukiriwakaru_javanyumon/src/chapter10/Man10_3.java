package chapter10;

import chapter9.Main9_22.Hero;

public class Man10_3 {
	public class king {
		void talk(Hero h) {
			System.out.println("王様: ようこそ我が城へ、勇者" + h.name + "よ");
			System.out.println("王様: 長旅ご苦労であった");
			System.out.println("王様: まずは、下町を見てくるといいだろう");

			h.die();
		}
	}

}
