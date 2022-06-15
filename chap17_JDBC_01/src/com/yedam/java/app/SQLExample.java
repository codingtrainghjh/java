package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQLExample {
	public static void main(String[] args) throws Exception {
		//1. JDBC Driver �ε��ϱ�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. DB ���� �����ϱ�
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pwd = "hr";
		
		Connection con = DriverManager.getConnection(url, id, pwd);
		
		//3. CRUD ����
		
		/***************INSERT*******************/
		//3-1. Statement or PrepareStatement ��ü �����ϱ�
		//PrepareStatement = insert�ÿ� �Ķ���Ϳ� ?�� ������ ��
		String insert = "INSERT INTO employees VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(insert);
		//3-2. SQL ���� �� ����
		//��Ʈ�� ��������ϴ� ���� �ƴ϶� �����͸� ���� ���� ���� ������� ¥���Ѵ�.
		pstmt.setInt(1, 1000); //ù��° �Ķ���͸� 1000���� ��ü�Ѵ�.
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
		
		//3-3. ��� ���
		int result = pstmt.executeUpdate(); //
		
		System.out.println("insert ��� : " + result);
		
		/***************UPDATE*******************/
		//3-1. Statement or PrepareStatement ��ü �����ϱ�
		//�÷��� �ʵ���� ����ǥX
		String update = "UPDATE employees SET last_name = ? WHERE employee_id = ?";
		pstmt = con.prepareStatement(update);
		
		//3-2. SQL ���� �� ����
		pstmt.setInt(2, 1000);
		pstmt.setString(1, "Kang");
		
		//3-3. ��� ���
		result = pstmt.executeUpdate();
		
		System.out.println("update ��� : " + result);
		
		/***************SELECT*******************/
		//3-1. Statement or PrepareStatement ��ü �����ϱ�
		String select = "SELECT * FROM employees ORDER BY employee_id";
		pstmt = con.prepareStatement(select);
		
		//3-2. SQL ���� �� ����
		ResultSet rs = pstmt.executeQuery();
		
		//3-3. ��� ���
		while(rs.next()) {
			String info = rs.getInt("employee_id") + " : " + rs.getString("first_name");
			System.out.println(info);
		}
		
		/***************DELETE*******************/
		//3-1. Statement or PrepareStatement ��ü �����ϱ�
		String delete = "DELETE FROM employees WHERE employee_id = ?";
		pstmt = con.prepareStatement(delete);
		
		//3-2. SQL ���� �� ����
		pstmt.setInt(1, 1000);
		
		//3-3. ��� ���
		result = pstmt.executeUpdate();
		
		System.out.println("delete ��� : " + result);
		
		//4. �ڿ������ϱ�
		
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(con != null) con.close();
	}
}
