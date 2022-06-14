package com.yedam.java.example1;

import java.util.Scanner;

public class SchedulerSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���");
			System.out.println("R : �Ѹ� ���ʴ�� �Ҵ�");
			System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
			System.out.println("P : �켱 ������ ���� �� ���� �Ҵ�");
			System.out.println("E : ����");
			
			System.out.println("Setting >");
			String ch = sc.next();
			
			Scheduler scheduler = null;
			if("R".equals(ch) || "r".equals(ch)) {
				scheduler = new RoundRobin();
				
			}else if("L".equals(ch) || "l".equals(ch)) {
				scheduler = new LeastJob();
			}else if("P".equals(ch) || "p".equals(ch)) {
				scheduler = new PrioritiyAllocation();
			}else if("E".equals(ch) || "e".equals(ch)) {
				System.out.println("���α׷� ����");
				break;
			}else {
				System.out.println("�������� �ʴ� ����Դϴ�.");
			}
			
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
			
			System.out.println();
		}
}
}
