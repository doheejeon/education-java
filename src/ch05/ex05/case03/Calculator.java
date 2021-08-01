package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(Paper paper) {
		return paper.getA() + paper.getB();
	}	
}
/*
8>숫자값 두개가 모아서 전달하는 메소드= 종이에 숫자를 적어주고 그 종이를 주면 된다., 파라미터 paper에는 객체주소값이 담긴다. = 객체가 담긴다.

*/