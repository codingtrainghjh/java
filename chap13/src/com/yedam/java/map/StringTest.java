package com.yedam.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("������", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		System.out.println("�� Entry �� : " + map.size());
		
		Integer returnVal = map.put("ȫ�浿", 100);
		
		if(returnVal != null) {
			System.out.println("���� �� : " + returnVal);
		}
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		for(String key : keySet) {
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.remove("ȫ�浿");
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator
			= entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
			//while���̵� for���̵� ���� ����� ����
		}
		System.out.println();
		for(Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		
	}
}
