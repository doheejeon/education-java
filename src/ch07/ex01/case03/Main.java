package ch07.ex01.case03;

public class Main {
	public static void main(String[] args) {
		D d = new D();
		C c = d;
		B b = d;
		A a = d;
		Object o = d; //여기까지 다 프로모션.
		
		d = (D)o;		//object타입을 d타입으로 캐스팅
		d = (D)a;		//a를 d로 캐스팅
		d = (D)b;
		d = (D)c;
		
	}
}
