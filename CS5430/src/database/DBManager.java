package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBManager {
	private static final int DB_PORT_NUM = 3306;
	private static final String HOSTNAME = "localhost";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	public static Connection getConnection() {
		try {
			return getConnection(USER, PASSWORD, HOSTNAME, DB_PORT_NUM);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static Connection getConnection(String userName, String pwd,
			String host, int port) throws SQLException {
		Connection conn = null;
		Properties connectionProps = new Properties();
		connectionProps.put("user", userName);
		connectionProps.put("password", pwd);
		conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port
				+ "/", connectionProps);
		System.out.println("Connected to database");
		return conn;
	}
}
