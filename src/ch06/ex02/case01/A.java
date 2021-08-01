package ch06.ex02.case01;

public class A {
	private int a; 				//1.접근제한자 "private"- 가장범위가 좁다(scope이 가장 좁다) 
	int b;						//2.접근제한자"default"- 나의동네(패키지) 같은 패키지를 가진 객체들끼리는 접근가능.(scope이 패키지)
	protected int c; 			//3.접근제한자 - 나의 자식까지 접근가능. scope이 패키지이지만 자식이 다른동네에 있어도 접근가능. 스콥이 내 패키지 
	public int d;				//4. 제한이 없는 무한 

	private void m1() {}		//m1메소드를 나만 쓰고 싶을때 - 메소드앞에 private을 붙이는 경우는 드물다. 
	void m2() {}
	protected void m3() {}
	public void m4() {}			//public이라는 메소드(문)를 통한다면 누구든 접근가능하다. 
	
}
/*
3.protected 제한자는 상속자체를 현장에서 잘 쓰지않아서 사용빈도가 낮다.

만약 내가API를 만든다면 내 클래스를 누군가가 상속할 수 있다는 것을 염두해둔다.
"프라이빗 멤버변수 퍼블릭 멤버메소드 "로 디자인하자. 데이터는 문을 통해 들락날락할 수 있다 = 즉 항상 캡슐화를 하자. 

*/