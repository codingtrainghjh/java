package com.yedam.java.ch1501;

public class MainTest {

	public static void main(String[] args) {
		Bag bag = new Bag();
		
		bag.set(new Note());
		String name = (String)bag.get();
		
		bag.set("�ſ���");
		Note note = (Note)bag.get();
		
		Box<Note, String, Integer> box = new Box<>(); //int,char ���� �⺻ Ŭ�������� ��ü�� �ȵ�
		
		box.setT(new Note());
		box.setK(500);
		box.setV("ȫ�浿");
		
		Note memo = box.getT();
		int num = box.getK();
		String str = box.getV();
		
		Box<Car, Bus, Taxi> vehicle = new Box<>();
		vehicle.setT(new Car());
		vehicle.setK(new Taxi());
		vehicle.setV(new Bus());
		
		Car car = vehicle.getT();
		Bus bus = vehicle.getV();
		Taxi taxi = vehicle.getK();
		
	}

}

class Car{}
class Bus{}
class Taxi{}

