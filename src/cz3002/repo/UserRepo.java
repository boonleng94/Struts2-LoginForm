package cz3002.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cz3002.util.DBConnector;

//Repo class to hold MySQL queries and results for the User 
public class UserRepo {
	//New DBConnection
	private Connection dbConnection;
	
	//Constructor
	public UserRepo() {
		// TODO Auto-generated constructor stub
		try {
			dbConnection = DBConnector.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//MySQL Query
	private static final String LOGIN_QUERY = "SELECT * FROM users WHERE username=? AND password=?";
	
	//Connect to DB, execute query, return results
	public boolean loginValidate(String[] params) throws Exception {
		boolean contains = false;
		Connection conn = null;
		try {
			conn = dbConnection;
			PreparedStatement prepStmt = conn.prepareStatement(LOGIN_QUERY);
			int count = 1;
			for (String param : params) {
				prepStmt.setString(count, param);
				count++;
			}

			ResultSet rs = prepStmt.executeQuery();
			if (rs.next()) {
				System.out.println("User login is valid in DB");
				contains = true;
			} else {
				System.out.println("Fail");
			}
		} catch (Exception e) {
			System.out.println("Error while validating password: " + e.getMessage());
			throw e;
		} finally {
			DBConnector.closeConnection(conn);
		}
		return contains;
	}
}
