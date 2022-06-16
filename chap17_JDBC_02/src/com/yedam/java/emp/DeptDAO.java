package com.yedam.java.emp;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DeptDAO {

	private static DeptDAO deptdao = null;

	private DeptDAO() {

	}

	public static DeptDAO getInstance() {
		if (deptdao == null) {
			deptdao = new DeptDAO();
		}
		return deptdao;
	}

	String jdbc_driver;
	String oracle_url;
	String connectedId;
	String connectedPwd;

	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;

	public void connect() {
		dbConfig();
		try {

			Class.forName(jdbc_driver);

			conn = DriverManager.getConnection(oracle_url, connectedId, connectedPwd);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver 접속되지 않았습니다.");
		} catch (SQLException e) {
			System.out.println("DB 접속되지 않았습니다");
		}
	}

	private void dbConfig() {
		String resource = "config/db.properties";
		Properties properties = new Properties();

		try {
			String filePath = ClassLoader.getSystemClassLoader().getResource(resource).getPath();
			properties.load(new FileInputStream(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		jdbc_driver = properties.getProperty("driver");
		oracle_url = properties.getProperty("url");
		connectedId = properties.getProperty("id");
		connectedPwd = properties.getProperty("password");
	}

	public void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Department> selectAll() {
		List<Department> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM departments ORDER BY department_id");
			while (rs.next()) {
				Department dept = new Department();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setManagerId(rs.getInt("manager_id"));
				dept.setLocationId(rs.getInt("location_id"));

				list.add(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			disconnect();
		}
		return list;
	}

	public Department selectOne(int departmentId) {
		Department dept = null;
		try {
			connect();
			String sql = "SELECT * FROM departments WHERE department_id =" + departmentId;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				dept = new Department();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setManagerId(rs.getInt("manager_id"));
				dept.setLocationId(rs.getInt("location_id"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return dept;
	}
	
	public void insert(Department dept) {
		try {
			connect();
			String sql = "INSERT INTO departments VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDepartmentId());
			pstmt.setString(2, dept.getDepartmentName());
			pstmt.setInt(3, dept.getManagerId());
			pstmt.setInt(4, dept.getLocationId());
			
			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("삽입이 완료되었습니다.");
			} else {
				System.out.println("잘못된 입력값입니다.");
			}
			System.out.println(result + "행 입력이 완료되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	public void update(Department dept) {
		try {
			connect();
			String sql = "UPDATE departments SET location_id = ? WHERE department_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getLocationId());
			pstmt.setInt(2, dept.getDepartmentId());
	
			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(result + "가 수정되었습니다.");
			} else {
				System.out.println("다시 입력해주세요.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}
	public void delete(int departmentId) {
		try {
			connect();
			String sql = "DELETE FROM departments WHERE department_id=" + departmentId;
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("삭제가 완료되었습니다.");
			} else {
				System.out.println("다시 입력해주세요.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	
	
}