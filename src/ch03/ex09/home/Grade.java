package ch03.ex09.home;
//변수명을 의미있게 쓰자~! , 변수이름 줄이지말고 풀로 쓰기
import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어:  ");
		double kor = sc.nextDouble();
		System.out.print("영어:  ");
		double eng = sc.nextDouble();
		System.out.print("수학:  ");
		double mat = sc.nextDouble();
		
		double total = kor + eng + mat;
		double average = (kor + eng + mat)/3;
		average = (int)average * 10 / 10.0;
		
		System.out.println();
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
		
		char grade = (average >= 90) ? 'A' : (average >= 80) ?'B' : 'C'; 
		System.out.printf("학점: %c\n", grade);
	}
}
/*
 *국어, 영어, 수학 점수를 입력받는다.
 *총점, 평균, 학점을 출력한다.
 *평균 점수는 소수점이하 1자리까지만 출력한다.
 *
 *평균점수를 m 이라한다. 
* 90<= m <= 100: A
* 80<= m <= 90: B
*      m <  80: C
* 
*  --
*  국어 : 95
*  영어: 100
*  수학: 100
*  
*  총점 : 295
*  평균: 98.3
*  학점: A
*/
 