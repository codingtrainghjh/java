package com.yedam.java.ch1501;
//꺾쇠안에 제네릭으로 쓸 문자를 넣으면 됨
public class Box<T, V, K> {
	T t;
	V v;
	K k;
	int num;
	
	public void setT(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
	
	public void setV(V v) {
		this.v = v;
	}
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public V getV() {
		return v;
	}
}
