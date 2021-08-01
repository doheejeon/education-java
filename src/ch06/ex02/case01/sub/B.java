package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		A test = new A();			//퍼블릭으로 공개된 A객체를 여기서도 생성할 수 있다. 하지만 컴파일러가 sub패키지를 A클래스를 찾지못해서오류가나서 import해준다.
		
		int x = 0;
		//x = test.a;
		//x = test.b; 
		//x = test.c;
		x = test.d;
		
		//test.m1();
		//test.m2();
		//test.m3();
		test.m4();
	}

}
/*


*/