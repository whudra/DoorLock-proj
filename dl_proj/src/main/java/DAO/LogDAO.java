package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.LogDTO;
import DTO.UserDTO;

public class LogDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "";
	String returns = "a";
	String dbURL = "jdbc:mysql://192.168.0.4:3306/mydb";
	String dbID = "root";
	String dbPassword = "1234";
	
	private static LogDAO instance = new LogDAO();

	public static LogDAO getInstance() {
		return instance;
	}
	
	public void updateLog(LogDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			sql = "INSERT INTO log VALUES(?,?,?,?,?)";// 조회
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getSerial_number());
			pstmt.setString(2, dto.getDate());
			pstmt.setString(3, dto.getState());
			pstmt.setString(4,  dto.getImagelog());
			pstmt.setInt(5,  dto.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)try {pstmt.close();} catch (SQLException ex) {}
			if (conn != null)try {conn.close();	} catch (SQLException ex) {	}
		}
	}
	
	public ArrayList<LogDTO> Loginfo() {
		ArrayList<LogDTO> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			sql = "select * from log ORDER BY date DESC";// 조회
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				LogDTO dtos = new LogDTO();
				dtos.setSerial_number(rs.getString("Serial_Number"));
				dtos.setDate(rs.getString("date"));
				dtos.setState(rs.getString("state"));
				list.add(dtos);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)try {pstmt.close();} catch (SQLException ex) {}
			if (conn != null)try {conn.close();	} catch (SQLException ex) {	}
		}
		return list;
	}
	
	
}
