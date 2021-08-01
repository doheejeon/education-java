package ch04.ex01.home;
//학점을 세분화하는 과제
public class Grade {
	public static void main(String[] args) {
		int score = 84;
		String grade = "";
		
		if(score >=98) grade ="A+";
		else if(score >= 94) grade ="A";
		else if(score >= 90) grade ="A-";
		else if(score >= 88) grade ="B+";
		else if(score >= 84) grade ="B";
		else if(score >= 80) grade ="B-";
		else grade ="C";
		System.out.printf("grede: %s", grade);
	}

}
/*
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
