package com.yedam.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("½ÅÀ±±Ç", 85);
		map.put("È«±æµ¿", 90);
		map.put("µ¿Àå±º", 80);
		System.out.println("ÃÑ Entry ¼ö : " + map.size());
		
		Integer returnVal = map.put("È«±æµ¿", 100);
		
		if(returnVal != null) {
			System.out.println("±âÁ¸ °ª : " + returnVal);
		}
		System.out.println("\tÈ«±æµ¿ : " + map.get("È«±æµ¿"));
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
		
		map.remove("È«±æµ¿");
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator
			= entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
			//while¹®ÀÌµç for¹®ÀÌµç °°Àº °á°ú°¡ ³ª¿È
		}
		System.out.println();
		for(Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		
	}
}
