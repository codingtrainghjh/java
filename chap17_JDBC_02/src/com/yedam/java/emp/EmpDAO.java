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

public class EmpDAO {
	// �̱���
	private static EmpDAO empDAO = null;

	private EmpDAO() {
	}

	public static EmpDAO getInstance() {
		if (empDAO == null) {
			empDAO = new EmpDAO(); // �޸� �Ҵ� ���� �������� ���, ���� ����
		}
		return empDAO;
	}

	// Oracle ���� ����
	String jdbc_driver; // ����ٴ� ���������� ���� ��
	String oracle_url;
	String connectedId;
	String connectedPwd;

	// �� �޼ҵ忡�� ���������� ����ϴ� �ʵ�
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;

	public void connect() {
		dbConfig();
		try {
			// 1.JDBC Driver �ε�
			Class.forName(jdbc_driver);
			// 2.DB ���� ����
			conn = DriverManager.getConnection(oracle_url, connectedId, connectedPwd);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
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

	// 4.�ڿ� ����
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

	// 3.CRUD ����
	// ��ü��ȸ
	public List<Employee> selectAll() {
		List<Employee> list = new ArrayList<>();// ���ϵǴ� Ÿ���� ���� ��쿡�� �������� ���� ����
		try {
			connect();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employees ORDER BY employee_id");
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));

				list.add(emp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			disconnect();
		}
		return list;
	}

	// �ܰ���ȸ
	public Employee selectOne(int employeeId) {
		Employee emp = null;
		try {
			connect();
			String sql = "SELECT * FROM employees WHERE employee_id =" + employeeId;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace(); // ����� ���� ����
		} finally {
			disconnect();
		}
		return emp;
	}

	// ���
	public void insert(Employee emp) {
		try {
			connect();
			String sql = "INSERT INTO employees VALUE(?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getLastName());
			pstmt.setString(4, emp.getEmail());
			pstmt.setString(5, emp.getPhoneNumber());
			pstmt.setDate(6, emp.getHireDate());
			pstmt.setString(7, emp.getJobId());
			pstmt.setDouble(8, emp.getSalary());
			pstmt.setDouble(9, emp.getCommissionPct());
			pstmt.setInt(10, emp.getManagerId());
			pstmt.setInt(11, emp.getDepartmentId());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("����� �Ϸ�Ǿ����ϴ�.");
			} else {
				System.out.println("��ϵ��� �ʾҽ��ϴ�.");
			}
			System.out.println(result + "���� �Ϸ�Ǿ����ϴ�.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// ����
	public void update(Employee emp) {
		try {
			connect();
			String sql = "UPDATE employees SET salary = ? WHERE employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(2, emp.getEmployeeId());
			pstmt.setDouble(1, emp.getSalary());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(result + "�� ����� �Ϸ�Ǿ����ϴ�.");
			} else {
				System.out.println("�������� �Ⱦҽ��ϴ�.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// ����
	public void delete(int employeeId) {
		try {
			connect();
			String sql = "DELETE FROM employees WHERE employee_id=" + employeeId;
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("���������� �����Ǿ����ϴ�.");
			} else {
				System.out.println("���������� �������� �ʾҽ��ϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
}
