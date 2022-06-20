package com.yedam.app.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DAO {
	//Oracle DB 정보
	private String jdbcDriver;
	private String oracleUrl;
	private String connectedId;
	private String connectedPwd;
	
	//공통으로 사용되는 필드
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	public DAO() {
		dbConfig(); //한번만 실행시키고자 한다면 생성자에서 실행시키면 됨, 메소드에서 실행시키면 정보를 계속 로딩함
	}
	
	//DB에 접속하는 메소드
	public void connect() {
		try {
			Class.forName(jdbcDriver);
			
			conn = DriverManager.getConnection(oracleUrl, connectedId, connectedPwd);
	
		}catch(ClassNotFoundException e) {
			System.out.println("jdbc driver 로딩 실패");
		}catch(SQLException e) {
			System.out.println("DB 연결 실패");
		}
	}	
	
	
	//DB 정보를 가져오는 메소드
	private void dbConfig() {
		String resource = "config/db.properties";
		Properties properties = new Properties();

		try {
			String filePath = ClassLoader.getSystemClassLoader().getResource(resource).getPath();
			properties.load(new FileInputStream(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		jdbcDriver = properties.getProperty("driver");
		oracleUrl = properties.getProperty("url");
		connectedId = properties.getProperty("id");
		connectedPwd = properties.getProperty("pwd");
	}
	//DB 접속을 해제하는 메소드
	public void disconnect() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
