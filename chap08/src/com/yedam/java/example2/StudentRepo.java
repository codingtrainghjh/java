package com.yedam.java.example2;

public class StudentRepo implements Access {
	// 저장소는 프로젝트마다 하나이므로 싱글톤으로 제작(외부에서 나를 만들수없게 막고 내부에서 인스턴스를 만들기)
	private static StudentRepo instance = new StudentRepo();
	private StudentRepo() {
		init();
	}
	public static StudentRepo getInstance() {
		return instance;
	}
	//실제 사용 필드 및 메소드
	private Student[] dataList;
	private int listIndex;
	
	private void init() { //초기 설정 지정 메소드
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
		//기존 데이터 -> 임시변수
		Student[] tempList = dataList;
		int tempIndex = listIndex;
		//기존 필드 초기화
		init();
		//임시변수에서 데이터만 기존 필드로 복사
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
