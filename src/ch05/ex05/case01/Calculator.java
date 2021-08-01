package ch05.ex05.case01;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
/*
*8> overloading 이 됨. 4번메서드는 add int int , 8번은 add int int int 로 컴파일러는 받아들임. 
*오버로딩 하나의 클래스에 이름이 같고 파라미터가 다른  메소드를 두 개 이상 정의하는 것. 
*/