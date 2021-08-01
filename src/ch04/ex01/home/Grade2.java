package ch04.ex01.home;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int korean = 0;
		int english = 0;
		int math = 0;
		int total = 0;
		double avg = 0;
		char grade = 0;
		//presentation logic 입력받고 보여줄 내용
		System.out.print("국어: ");
		korean = sc.nextInt();
		System.out.print("영어: ");
		english = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		//business logic 처리내용 
		total = korean +  english + math;
		avg = total / 3.0;
		
		if(avg >= 90) grade = 'A';	
		else if (avg >= 80) grade = 'B';
		else grade = 'C';
		
		System.out.printf("\n총점: %d\n평균: %.1f\n학점: %c", total, avg, grade);
		
	}

}
/*
 * ch03.ex09.home.Grade를 refactoring한다.
 * 삼항 연산자를 if로 변경한다.
 * 
 */
