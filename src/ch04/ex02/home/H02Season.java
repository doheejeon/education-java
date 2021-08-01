package ch04.ex02.home;

import java.util.Scanner;

public class H02Season {
	public static void main(String[] args) {
		int month = 0;  						
		String season = "";
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("월: ");
		month = sc.nextInt();
		
		if (3 <= month && month <= 5) season = "봄";	
		else if(6 <= month && month <= 8) season = "여름";
		else if(9 <= month && month <= 11) season = "가을";
		else if(month == 12 || month == 1 || month ==2) season = "겨울";		
		else season = "존재하지 앟는 월"; //엉뚱한 값의 입력을 방지.
		
		
		System.out.printf("%d월은 %s입니다.", month, season);
	}


}
/*
ch04.ex02.C04Season 을 refactoring한다.
switch를 if로 변경한다.
*/