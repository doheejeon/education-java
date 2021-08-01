package ch02.ex02;

import java.time.LocalDate;

//날짜를 산술연산하는 방법
public class C08Date {
	public static void main(String [] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		date = date.plusDays(1); //날짜에 플러스 하고 싶을때.
		System.out.println(date);
		
		date = date.minusDays(1);//날짜 마이너스하고싶을때.
		System.out.println(date);
		
		
	
	}

}
