package ch02.ex02.home;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("공연일자를 입력하세요. ");
		String s = sc.nextLine();
		System.out.print("년:");
		int a = sc.nextInt();
		System.out.print("월:");
		int b= sc.nextInt();
		System.out.print("일:");
		int c= sc.nextInt();
		
		System.out.printf("\n%d-%d-%d" + " 공연을 예매했습니다.", a ,b ,c  );
		
		LocalDate date = LocalDate.of(a,b,c);
		System.out.println();
		date = date.minusDays(3);
		
		System.out.println(date + " 까지 환불이 가능합니다.");
		
		
		
		
		
	}

}
/*
예매하라. 공연일로부터 3일 전까지 환불이 가능하다.abstract
--콘솔예
공연 일자를 입력하세요. 
년: 2025 (대기) 입력하면
월: 7(대기) 입력하면
일: 17(대기)입력하면
2025-07-07 공연을 예매했습니다.abstract
2025-07-14 까지 환불이 가능합니다.( 3일)*/
