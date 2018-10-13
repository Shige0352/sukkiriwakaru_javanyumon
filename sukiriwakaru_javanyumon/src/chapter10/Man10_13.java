package chapter10;

public class Man10_13 {
	private String name;

	public void setName(String name) {
		if (name == nall) {
			throw new IllegalArgumentException("名前がnullであるとき処理を中断");

		}

		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎるとき処理を中断");

		}

		if (name.length() >= 8) {
			throw new IllegalAccessException("名前が長すぎるとき処理を中断")
		}
		this.name = name;
	}


}
