package ch02.ex02;

import java.time.LocalDate;
import java.time.LocalTime;

//특정 날짜의 시간대를 지정해서 쓰고싶다면? , 날짜는 +, -로 연산할 수 있다. 곱셈과나눗셈은 불가 
public class C07Date {
	public static void main(String [] args) {
		LocalDate date = LocalDate.of(2025, 1, 1); //특정 날짜를 쓸때 of메소드 //import해주시고~~
		LocalTime time = LocalTime.of(18, 7, 13);
		
		System.out.println(date);
		System.out.println(time);
	}


}

