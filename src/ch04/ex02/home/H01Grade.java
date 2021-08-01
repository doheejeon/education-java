package ch04.ex02.home;

public class H01Grade {
	public static void main(String[] args) {
		int score = 84;
		String grade = "";	
		
		switch(score/10) {
		case 10: grade = "A+"; break;
		case 9: grade = "A";
		if(score%10 >= 8) grade +="+"; 
		else if (score%10 < 4) grade +="-";break;
		
		case 8: grade = "B";
		if(score%10 >= 8) grade +="+"; 
		else if (score%10 < 4) grade +="-";break;
		
		default: grade = "C";	
		}
		
		System.out.println(grade);
	}
}

/*
ch04.ex01.home.Grade를 refactoring 한다.
switch 등의 문법을 이용한다.
 score 데이터는 hard coding(소스에내가정하는수치스캐너안쓴다)
 다음 점수 구간별로 학점을 부여한다.
 98 이상 A+
 94 이상 A (98미만 94이상)
 90 A-
 88 B+
 84 b
 80이상 b-
 나머지는 C 
 --
 
 grade : A-
 */

