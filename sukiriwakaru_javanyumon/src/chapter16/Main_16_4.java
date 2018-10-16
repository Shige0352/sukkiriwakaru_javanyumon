package chapter16;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main_16_4 {
	public static void main(String[] args) throws Exception {

		Class.forName("...");
		String dburl = "...";

		String sql = "INSERT INTO EMPLOYEES(name) VALUES('iida')";
		Connection connection = DriverManager.getConnection(dburl);

		conn.creatStatement().excuteUpdate(sql);

		conn.close();

	}

}
