package ch05.ex06.case02;

public class MyNumber {
	private static int x;				//스태틱변수
	private int y;						//인스턴스변수
	
	public static void init1() {		//초기화하는 것. 
		MyNumber.x = 1;					//scope범위안에 있다.
		//y = 2;						스태텍메소드에서는 인스턴스변수에 접근하지 못한다. 스태틱메소드만들때 인스턴스객체를 생성해주지 않아서...
	}
	
	public void init2() {
		MyNumber.x = 1;					//인스턴스메소드에는 스태틱변수 접근가능.
		this.y = 2;						//this안에는 마이넘버타입의 객체가 들어가있다. y는 인스턴스변수 
	}

}
/*
14> 논리적으로는 this안에 2가 있다고볼수있지만 물리적으로는 없고 실제로 메소드영역에 있음. 
생성자 메소드 이름은 첫글자가 대문자다. 
일반 메소드의 이름은 소문자
[선언부관점]

메소드와 생성자의 차이
->생성자는 리턴타입이 없다. 이름이 클래스와 같다.
일반 메소드는 리턴타입이 있다. 그래서 리턴값이 없으면 void라도 써줘야한다. 
즉 생성자에서 리턴값이 없어야한다. 
메소드는 나의 선택에따라 리턴값의 유무가 결정된다. 
생성자는 구현할 수 있는 알고리즘이 한정된다. 




*/