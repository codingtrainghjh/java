package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) throws Exception {
		//1. JDBC Driver �ε��ϱ�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. DB ���� �����ϱ�
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pwd = "hr";
		
		Connection con = DriverManager.getConnection(url, id, pwd);
		
		//3. Statement or PreparedStatement ��ü �����ϱ�
		Statement stmt = con.createStatement();
		
		//4. Query ����
		String sql = "SELECT * FROM employees"; 
		//SQL�� �״�� ���� ��, �����ݷ� ����, statement�� ������ ������ ������ �䱸��
		
		//5. Query ����
		ResultSet rs = stmt.executeQuery(sql);
		
		//6. ����� ����ϱ�
		while(rs.next()) {
			String name = rs.getString("first_name") + " " + rs.getString("last_name");
			System.out.println(name);
		}
		
		//7. �ڿ������ϱ�
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(con != null) con.close();
		
	}

}
