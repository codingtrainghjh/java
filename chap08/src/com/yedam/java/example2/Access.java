package com.yedam.java.example2;

public interface Access {
	//����ҿ� ���� ������� ����
	//���
	public void insert(Student student);
	//����
	public void update(Student student);
	//����
	public void delete(int studentId);
	//��ü��ȸ
	public Student[] selectAll();
	//�ܰ���ȸ
	public Student selectone(int studentId);
}
