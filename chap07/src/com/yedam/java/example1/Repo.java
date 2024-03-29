package com.yedam.java.example1;

//고객정보를 저장하는 저장소
public class Repo {
	// 필드
	private Customer[] dataList;
	private int listIndex;

	// 생성자
	public Repo() {
		dataList = new Customer[100];
		listIndex = -1;
	}

	// 메소드
	// 등록
	public void insert(Customer customer) {
		dataList[++listIndex] = customer;
	}

	// 수정
	public void update(Customer customer) {
		for (int i = 0; i <= listIndex; i++) {
			if (dataList[i].getCustomerId() == customer.getCustomerId())
				;
			dataList[i] = customer;
		}
	}

	// 삭제
	public void delete(int customerId) {
		// 데이터 삭제
		for (int i = 0; i <= listIndex; i++) {
			if (dataList[i].getCustomerId() == customerId)
				;
			dataList[i] = null;
		}
		// 데이터정리
		cleanDataList();
	}

	// 기존 데이터, 임시 변수에 복사
	private void cleanDataList() {
		Customer[] temp = dataList;
		int tempIndex = listIndex;

		// 기존 데이터를 초기화
		this.dataList = new Customer[100];
		this.listIndex = -1;
		for (int i = 0; i <= tempIndex; i++) {
			if (temp[i] == null) {
				continue;
			}
			dataList[++listIndex] = temp[i];
		}
	}

	// 조회
	// 전체출력
	public Customer[] selectAll() {
		return dataList;
	}

	// 부분출력
	public Customer selectOne(int customerId) {
		Customer selected = null;
		for (int i = 0; i <= listIndex; i++) {
			if (dataList[i].getCustomerId() == customerId) {
				selected = dataList[i];
				break;
			}
		}
		return selected;
	}

}
