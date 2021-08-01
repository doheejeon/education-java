package ch07.ex01.case02;

public class Main {
	public static void main(String[] args) {
		C c = new C();		//여기는 결국 A,B다 갖고있다.
		B b = c;
		A a = c;
		Object o = c;
		
		c = (C)o;
		c = (C)a;				//a타입을 C타입으로 캐스팅해본다.
		c = (C)b;
		
		b = (B)a;			
		
		
	}

}
