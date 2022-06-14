package com.yedam.jaca.ch1101;

import java.util.HashMap;
import java.util.Map;

public class KeyTest {

	public static void main(String[] args) {
		Map<Key, String> map = new HashMap<Key, String>();
		
		map.put(new Key(1), "ȫ�浿");
		
		String value = map.get(new Key(1));
		System.out.println(value);
	}

}
