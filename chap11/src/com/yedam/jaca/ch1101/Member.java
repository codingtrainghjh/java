package com.yedam.jaca.ch1101;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// �������� ��������
		// 1.������ Ÿ������
		if (obj instanceof Member) {
			// 2.���� �ʵ� ���� ������
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public String toString() {
		return "id : " + id;
	}
	
	
}
