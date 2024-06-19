package Generics;

public class MyGenericClass<T,V> {
	T t;
	V v;
	
	public MyGenericClass(T t, V v) {
		this.t = t;
		this.v = v;
	}
	
	public T getTValue() {
		return t;
	}
	
	public V getVValue() {
		return v;
	}
	
	public static void main(String[] args) {
		MyGenericClass <Integer,Double> myGen = new MyGenericClass<>(1,1.2);
		
		System.out.println(myGen.getTValue());
		System.out.println(myGen.getVValue());
	}
}
