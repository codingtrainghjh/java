package com.yedam.example2;

public class StudentSystem {

	public static void main(String[] args) {
		Student hong = new Student("홍준호");
		
		System.out.println(Student.getSerialNum());
		System.out.println(hong.getName() +"의 학번 : " + hong.getStudentId());

		Student son = new Student("손수경");
		
		System.out.println(Student.getSerialNum());
		System.out.println(son.getName() +"의 학번 : " + son.getStudentId());
		
		System.out.println(son.getName() +"의 학번 : " + son.getStudentId());
	}

}
