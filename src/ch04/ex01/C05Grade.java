package ch04.ex01;
//기능을 변환하지않고 리팩토링하는것 삼항연산자를 이프로~
public class C05Grade {
	public static void main(String[] args) {
		int score = 45;
		char grade = 0;
		
		if(score >= 90) grade = 'A';
		else if(score >= 80) grade ='B'; //90 > score > 80 를 생각한 것
		else grade = 'C'; //A,B외에는 학점을 주고싶지 않다면 10번 메소드를 그냥 안쓰면됨.
		
		System.out.println(grade); 
	}

}
