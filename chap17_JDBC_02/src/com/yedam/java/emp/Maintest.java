package com.yedam.java.emp;

import java.util.List;

public class Maintest {

	public static void main(String[] args) {
		List<Employee> list = EmpDAO.getInstance().selectAll();
		
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

}
