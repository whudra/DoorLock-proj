package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserDAO {
	Connection conn = null;
	
	public UserDAO() {
		// TODO Auto-generated constructor stub
		try {
			String dbURL = "jdbc:mysql://192.168.86.252:9001/mydb";
			String dbID = "root";
			String dbPassword = "1234";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("!????!");
		}
	}
	
	public String He() {
		return "hi";
	}
}
