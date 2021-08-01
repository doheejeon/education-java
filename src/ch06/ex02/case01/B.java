package ch06.ex02.case01;

public class B {
	public void test() {
		A test = new A(); 	//A는 퍼블릭이라 남이쓸수있어서 이처럼 객체 생성도 가능하다	
		
		int x = 0;
		//x = test.a; 		//A클래스에서 변수들을 모두 private으로 감췄기때문에 여기서 쓸 수 없다. (private int a;)
		x = test.b;
		x = test.c;
		x = test.d;
		
		//test.m1();		//m1은 private이여서 오류
		test.m2();
		test.m3();
		test.m4();
	}

}
/*
class앞에 public을 붙인다. 

*/