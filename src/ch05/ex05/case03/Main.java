package ch05.ex05.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Paper paper = null;
		int result = 0;
		
		result = calculator.add(1, 2);
		System.out.println(result);  //3
		
		paper = new Paper();
		paper.setA(1);
		paper.setB(2);
		
		result = calculator.add(paper);
		System.out.println(result);		//3
		
	}
}
/*
*9> 페이퍼를 생성한다. 
*16> 계산기에 종이를 넣고 result에 저장한다.
*9-10> 1,2같은 리터럴값을 받아도 같은 값이 출력된다. 
*/