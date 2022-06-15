package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQLExample {
	public static void main(String[] args) throws Exception {
		//1. JDBC Driver 로딩하기
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. DB 서버 접속하기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pwd = "hr";
		
		Connection con = DriverManager.getConnection(url, id, pwd);
		
		//3. CRUD 실행
		
		/***************INSERT*******************/
		//3-1. Statement or PrepareStatement 객체 생성하기
		//PrepareStatement = insert시에 파라미터에 ?만 넣으면 됨
		String insert = "INSERT INTO employees VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(insert);
		//3-2. SQL 구성 후 실행
		//세트는 마음대로하는 것이 아니라 데이터를 보고 값에 따라 순서대로 짜야한다.
		pstmt.setInt(1, 1000); //첫번째 파라미터를 1000으로 대체한다.
		pstmt.setString(2, "kil-Dong");
		pstmt.setString(3, "Hong");
		pstmt.setString(4, "kdHong@google.com");
		pstmt.setString(5, "82.10.1234.1234");
		pstmt.setString(6, "21/11/05");
		pstmt.setString(7, "SA_REP");
		pstmt.setInt(8,6000);
		pstmt.setDouble(9, 0.15);
		pstmt.setDouble(10, 149);
		pstmt.setInt(11,80);
		
		//3-3. 결과 출력
		int result = pstmt.executeUpdate(); //
		
		System.out.println("insert 결과 : " + result);
		
		/***************UPDATE*******************/
		//3-1. Statement or PrepareStatement 객체 생성하기
		//컬럼과 필드명에는 물음표X
		String update = "UPDATE employees SET last_name = ? WHERE employee_id = ?";
		pstmt = con.prepareStatement(update);
		
		//3-2. SQL 구성 후 실행
		pstmt.setInt(2, 1000);
		pstmt.setString(1, "Kang");
		
		//3-3. 결과 출력
		result = pstmt.executeUpdate();
		
		System.out.println("update 결과 : " + result);
		
		/***************SELECT*******************/
		//3-1. Statement or PrepareStatement 객체 생성하기
		String select = "SELECT * FROM employees ORDER BY employee_id";
		pstmt = con.prepareStatement(select);
		
		//3-2. SQL 구성 후 실행
		ResultSet rs = pstmt.executeQuery();
		
		//3-3. 결과 출력
		while(rs.next()) {
			String info = rs.getInt("employee_id") + " : " + rs.getString("first_name");
			System.out.println(info);
		}
		
		/***************DELETE*******************/
		//3-1. Statement or PrepareStatement 객체 생성하기
		String delete = "DELETE FROM employees WHERE employee_id = ?";
		pstmt = con.prepareStatement(delete);
		
		//3-2. SQL 구성 후 실행
		pstmt.setInt(1, 1000);
		
		//3-3. 결과 출력
		result = pstmt.executeUpdate();
		
		System.out.println("delete 결과 : " + result);
		
		//4. 자원해제하기
		
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(con != null) con.close();
	}
}
