package com.yedam.java.ch1501;
//제네릭 일부사용
public class Util {
	public static <T> BoxA<T> boxing(T t){
		BoxA<T> box = new BoxA<>();
		box.set(t);
		return box;
	}
	//지정된 제네릭 타입만을 드래그해서 쓸 수 있음
	public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	public static <K, V> V printInfo(K key) {
		V v = null;
		return v;
		
	}
}
