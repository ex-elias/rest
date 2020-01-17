package rest.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQL {

	public static Connection getConnection() {
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties properties = new Properties();
			properties.put("user", "epam");
			properties.put("password", "call911");
			properties.put("serverTimezone", "Europe/Moscow");
			properties.put("characterEncoding", "utf8");
			Connection connection = DriverManager.getConnection("jdbc:mysql://playways.ru:3306/epam", properties);
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}

}
