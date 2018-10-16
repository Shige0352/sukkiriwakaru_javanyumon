package chapter15;

public class Main15_5 {
	public class Person {
		int age;
		public void setAge(int age) {
			if (age < 0) {
				throw new IllegalArgumentException("年齢は正の数で指定するべきです。指定値=" + age);

			}
			this.age = age;
		}
	}

	public class main {
		public static void main(String[] args) {
			Person person = new Person();
			p.setAge(-128);

		}
	}

}
