package chapter11;

public class Main11_10 {
	public class Hero {

		public Hero() {
			System.out.println("Heroのコンストラクタが動作");
		}

		public class SuperHero extends Hero {

			public Superhero() {
				System.out.println("SuperHeroのコンストラクタが動作");
			}

			public static void main(String[] args) {
				SuperHero sh = new SuperHero();
			}
		}
	}

}
