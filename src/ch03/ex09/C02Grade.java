package ch03.ex09;

public class C02Grade {
	public static void main(String[] args) {
		int score = 50;
		char grade = score >=90 ? 'A' : (score >= 80? 'B' : 'C'); //스코어 값이 90이상이면 A, 아니면 B, 스코어가 80이면 비아니면C 이런식으로 확장가능.
		System.out.println(grade); //C출력/해당코드는 가독성이 떨어진다.
		
	}
}

