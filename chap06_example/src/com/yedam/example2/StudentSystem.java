package com.yedam.example2;

public class StudentSystem {

	public static void main(String[] args) {
		Student hong = new Student("ȫ��ȣ");
		
		System.out.println(Student.getSerialNum());
		System.out.println(hong.getName() +"�� �й� : " + hong.getStudentId());

		Student son = new Student("�ռ���");
		
		System.out.println(Student.getSerialNum());
		System.out.println(son.getName() +"�� �й� : " + son.getStudentId());
		
		System.out.println(son.getName() +"�� �й� : " + son.getStudentId());
	}

}
