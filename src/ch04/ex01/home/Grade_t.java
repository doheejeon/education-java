package ch04.ex01.home;
//내가 한  Grade과제에서 3번씩 중복이 일어난 A,B를 개선하는 방법.
public class Grade_t {
	 public static void main(String[] args) {
		int score = 90;
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
			if(score >= 98) grade += "+";
			else if(score < 94) grade += "-";
		}else if (score >= 80) {
			grade = "B";
			if(score >= 88) grade += "+";
			else if(score < 84) grade += "-";
		}else {
			grade = "C";
		}
		System.out.printf("grade: %s", grade);
	}
}
/*
  * 1. 학점을 3가지 관점 A,B,C로 본다면?
 * 2. if문 3개 큰 틀을 만들어놓고 그 틀안에 추가한다. 
*/
