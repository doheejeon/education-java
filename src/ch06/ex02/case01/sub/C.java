package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A{
	public void test() {
		int x = 0;
		//x = a;		//감춰짐
		//x = b;		//동네가 달라서 안보임
		x = c;
		x = d;
		
		//m1();
		//m2();
		m3();
		m4();
		
		
	}
}
