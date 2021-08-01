package ch05.ex05.case04;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Paper paper = null;
		
		paper = new Paper();
		paper.setA(1);
		paper.setB(2);
		
		calculator.add(paper);
		System.out.println(paper.getResult());		//3
		
		paper = calculator.add2(paper);
		System.out.println(paper.getResult());		//3 ,나쁜디자인 
	
		//
		System.out.println(paper);					//주소값 출력해서 종이가 있다는 것을 확인하자
		paper = calculator.add3(paper);
		System.out.println(paper);  				
	}
}
/*
*12> result = calculator.add(paper);쓰면 리턴값이 없어서 컴파일 오류가 난다. void여서 public void add(Paper paper)가 원인
*13> paper를 main도 갖고있어서 결과값을 도출하는 것은 문제가없다.
*15> public Paper add2(Paper paper) {
		paper.setResult(paper.getA() + paper.getB()); 계산기 클래스의 add2메소드를 메인 paper에 담음.
19>의 주소값은 ch05.ex05.case04.Paper@26f0a63f
20>의 주소값은 ch05.ex05.case04.Paper@4361bd48 
		즉 둘은 다른 종이. 
*/