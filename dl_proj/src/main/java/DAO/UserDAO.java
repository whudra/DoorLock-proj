package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.UserDTO;

public class UserDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "";
	String returns = "a";
	String dbURL = "jdbc:mysql://192.168.86.252:9001/mydb";
	String dbID = "root";
	String dbPassword = "1234";
	
	private static UserDAO instance = new UserDAO();

	public static UserDAO getInstance() {
		return instance;
	}
	
	public String check_Serial(UserDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			sql = "select * from userinfo where Serial_Number = ?";// 조회
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getSerialNumber());
			rs = pstmt.executeQuery();
			
			if (rs.next()) returns = "시리얼 인증 성공!";
			else returns = "시리얼 인증 실패!";
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)try {pstmt.close();} catch (SQLException ex) {}
			if (conn != null)try {conn.close();	} catch (SQLException ex) {	}
		}
		return returns;
	}
	
	public String check_Password(UserDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			sql = "select * from userinfo where a_pw = ?";// 조회
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getA_pw());
			rs = pstmt.executeQuery();
			
			if (rs.next()) returns = "비밀번호 인증 성공!";
			else returns = "비밀번호 인증 실패!";
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)try {pstmt.close();} catch (SQLException ex) {}
			if (conn != null)try {conn.close();	} catch (SQLException ex) {	}
		}
		return returns;
	}
}
