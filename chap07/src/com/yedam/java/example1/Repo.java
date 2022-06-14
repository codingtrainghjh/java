package com.yedam.java.example1;

//�������� �����ϴ� �����
public class Repo {
	// �ʵ�
	private Customer[] dataList;
	private int listIndex;

	// ������
	public Repo() {
		dataList = new Customer[100];
		listIndex = -1;
	}

	// �޼ҵ�
	// ���
	public void insert(Customer customer) {
		dataList[++listIndex] = customer;
	}

	// ����
	public void update(Customer customer) {
		for (int i = 0; i <= listIndex; i++) {
			if (dataList[i].getCustomerId() == customer.getCustomerId())
				;
			dataList[i] = customer;
		}
	}

	// ����
	public void delete(int customerId) {
		// ������ ����
		for (int i = 0; i <= listIndex; i++) {
			if (dataList[i].getCustomerId() == customerId)
				;
			dataList[i] = null;
		}
		// ����������
		cleanDataList();
	}

	// ���� ������, �ӽ� ������ ����
	private void cleanDataList() {
		Customer[] temp = dataList;
		int tempIndex = listIndex;

		// ���� �����͸� �ʱ�ȭ
		this.dataList = new Customer[100];
		this.listIndex = -1;
		for (int i = 0; i <= tempIndex; i++) {
			if (temp[i] == null) {
				continue;
			}
			dataList[++listIndex] = temp[i];
		}
	}

	// ��ȸ
	// ��ü���
	public Customer[] selectAll() {
		return dataList;
	}

	// �κ����
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
