package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptSQLExample {

	public static void main(String[] args) {
		try {
		//1. JDBC Driver �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. DB ���� ����
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pwd = "hr";
		
		Connection conn = DriverManager.getConnection(url, id, pwd);
		
		//3. CRUD
		
		/****************INSERT********************/
		//-1. PreparedStatement ��ü ����
		String isert = "INSERT INTO departments VALUES(?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(isert);
		
		//-2. Query ����
		pstmt.setInt(1, 1000);
		pstmt.setString(2, "YEDAM");
		pstmt.setInt(3, 100);
		pstmt.setInt(4, 2500);
		
		//-3. ���� �� ��� ���
		int result = pstmt.executeUpdate();
		
		System.out.println("insert ���� : " + result);
		
		/****************UPDATE********************/
		//-1. PreparedStatement ��ü ����
		String update = "UPDATE departments SET department_name = ? WHERE department_id = ?";
		pstmt = conn.prepareStatement(update);
		
		//-2. Query ����
		pstmt.setString(1, "JAVA");
		pstmt.setInt(2, 1000);
		
		//-3. ���� �� ��� ���
		result = pstmt.executeUpdate();
		System.out.println("update ��� : " + result);
		
		/****************SELECT********************/
		//-1. PreparedStatement ��ü ����
		String select = "SELECT * FROM departments ORDER BY department_id";
		pstmt = conn.prepareStatement(select);
		
		//-2. Query ����
		ResultSet rs = pstmt.executeQuery();
		
		//-3. ���� �� ��� ���
		while(rs.next()) {
			String info = "�μ� ��ȣ : " + rs.getInt("department_id") + 
					", �μ� �̸� : " + rs.getString("department_name");
			System.out.println(info);
		}
		/****************DELETE********************/
		//-1. PreparedStatement ��ü ����
		String delete = "DELETE FROM departments WHERE department_id = ?";
		pstmt = conn.prepareStatement(delete);
		
		//-2. Query ����
		pstmt.setInt(1, 1000);
		
		//-3. ���� �� ��� ���
		result = pstmt.executeUpdate();
		System.out.println("delete ��� : " + result);
		
		//4. �ڿ�����
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
		
		}catch(ClassNotFoundException e) {
			System.out.println("DB ���� ���� ����");
		}catch(SQLException e) {
			System.out.println("Query ���� ����");
			
		}finally {
		}
	}

}
