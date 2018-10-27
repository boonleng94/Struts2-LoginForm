package cz3002.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Utility class to connect to the database. Intermediary between UserRepo and MySQL
public class DBConnector {
	//Name of the database schema
	private static String schema = "cz3002_db";
	//Credentials of the MySQL user (Replace with your user credentials)
	private static String user = "root";
	private static String password = "root";
	
	//Establish DB Connection using given credentials
	//*MySQL 8.0 requires timezone to be specified*
	public static Connection getConnection() throws Exception {
		Connection conn = null;
		try {
			String url = "jdbc:mysql://localhost/" + schema + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&user=" + user + "&password=" + password;
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url);
		} catch (SQLException sqle) {
			System.out.println("SQLException: Unable to open connection to db: " + sqle.getMessage());
			throw sqle;
		} catch (Exception e) {
			System.out.println("Exception: Unable to open connection to db: " + e.getMessage());
			throw e;
		}
		return conn;
	}
	
	//Close DB Connection
	public static void closeConnection(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException sqle) {
			System.out.println("Error while closing connection.");
		}
	}
}
