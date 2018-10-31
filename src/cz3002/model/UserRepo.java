package cz3002.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cz3002.util.DBConnector;

//Model class to hold User account
public class UserRepo {
	//New DBConnection
	private Connection dbConnection;
	
	//User credentials
	private String username;
	private String password;
	
	//Constructor
	public UserRepo(String username, String password) {
		this.username = username;
		this.password = password;
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
	public boolean loginValidate() throws Exception {
		String[] params = {username, password};
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
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
