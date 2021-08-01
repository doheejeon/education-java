package ch06.ex02.case01;

public class C extends A{
	public void test() {
		int x = 0;
		
		//x = a; //A로부터 상속받아도, private은 자식에게도 상속되지않는다. 
		x = b;
		x = c;
		x = d;
		
		//m1();
		m2();
		m3();
		m4();
		
	}
}
