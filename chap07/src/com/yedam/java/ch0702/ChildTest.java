package com.yedam.java.ch0702;

public class ChildTest {

	public static void main(String[] args) {
		Father father = new Father();
		Uncle uncle = new Uncle();
		Child child = new Child();
		Cousin cousin = new Cousin();

		GrandFa fa = father;
		fa.method();
		fa = uncle;
		fa.method();
		fa = child;
		fa.method();
		fa = cousin;
		fa.method();
		
		System.out.println();
		Father pa = child;
		//pa = uncle;
		//pa = cousin;
		pa.method();
		
		Child ch = (Child)pa;
		//Cousin co = (Cousin)pa;
		
		System.out.println();
		Uncle un = cousin;
		//un = father;
		//un = child;
		un.method();
	}
}
