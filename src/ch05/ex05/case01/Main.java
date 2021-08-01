package ch05.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.add(1, 2);
		calculator.add(1, 2, 3);
		
		System.out.println();
		
		//calculator.add(1, 2.0);
	}

}
/*
* println이 오버로딩으로 된 것
* 12>정의된 메소드 중에add int double은 없어서 컴파일 에러가 난다. 즉 컴파일러는 이름뿐만아니라 파라미터데이터타입까지 구분한다.
*/