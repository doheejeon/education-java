package ch05.ex07.case02;

public class Stack {
	public static void first() {
		System.out.println("first 시작."); 	
		
		int a = 0;
		Stack.second();						
		
		System.out.println("first 끝.");
	}
	
	public static void second() {
		System.out.println("second 시작."); 	
		
		int a = 0;
	
		System.out.println("second 끝.");
	}
}
/*
인스턴스생성메소드와 생성자생성메소드의 코드상차이 
	->인스턴스생성할땐 메소드이름앞에 "인스턴스의이름. "하고 호출. 생성자호출은 메소드앞에 new 가 붙는다. 
		인스턴스 ,생성자 호출시 각각의 블럭안의 명령문실행 
	->new는 객체를 생성한다. 
	생성자는 new연산자를 통해 객체를 생성하고 그 직후의 생성자의 블럭이 실행 () <- 이것.  즉 객체가 생성되는 즉시 생성자도 실행.
	= 생성자는 객체가 생성된 후에 실행된다. 

컴파일러가 기본생성하는 생성자 : 기본생성자  ex ) Cat() {} 


*/