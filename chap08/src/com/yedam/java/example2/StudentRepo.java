package com.yedam.java.example2;

public class StudentRepo implements Access {
	// ����Ҵ� ������Ʈ���� �ϳ��̹Ƿ� �̱������� ����(�ܺο��� ���� ��������� ���� ���ο��� �ν��Ͻ��� �����)
	private static StudentRepo instance = new StudentRepo();
	private StudentRepo() {
		init();
	}
	public static StudentRepo getInstance() {
		return instance;
	}
	//���� ��� �ʵ� �� �޼ҵ�
	private Student[] dataList;
	private int listIndex;
	
	private void init() { //�ʱ� ���� ���� �޼ҵ�
		dataList = new Student[100];
		listIndex = -1;
	}

	@Override
	public void insert(Student student) {
		dataList[++listIndex] = student;

	}

	@Override
	public void update(Student student) {
		for(int i=0; i<=listIndex; i++) {
			if(dataList[i].getId() == student.getId()) {
				dataList[i] = student;
				//dataList[i].score
			}
		}
		cleanDataList();
	}
	private void cleanDataList() {
		//���� ������ -> �ӽú���
		Student[] tempList = dataList;
		int tempIndex = listIndex;
		//���� �ʵ� �ʱ�ȭ
		init();
		//�ӽú������� �����͸� ���� �ʵ�� ����
		for(int i = 0; i<=tempIndex; i++) {
			if(tempList[i] != null) {
				dataList[++listIndex] = tempList[i];
			}
		}
	}

	@Override 
	public void delete(int studentId) {
		for(int i=0; i<=listIndex; i++) {
			if(dataList[i].getId() == studentId) {
				dataList[i] = null;
			}
		}

	}

	@Override
	public Student[] selectAll() {
		Student[] list = new Student[listIndex+1];
		for(int i=0; i<list.length; i++) {
			list[i] = dataList[i];
		}
		return list;
	}

	@Override
	public Student selectone(int studentId) {
		Student selected = null;
		for(int i=0; i<=listIndex; i++) {
			if(dataList[i].getId() == studentId) {
				selected = dataList[i];
			}
		}
		return selected;
	}

}
