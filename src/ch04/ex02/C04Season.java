package ch04.ex02;

import java.util.Scanner;

//계절을 코드로 구현해보자
public class C04Season {
	public static void main(String[] args) {
		int month = 0;  						
		String season = "";
		Scanner sc = new Scanner(System.in);		//상단에 실행을 위한 로직작성
		
		System.out.print("월: ");
		month = sc.nextInt();
		
		switch(month) {  //month가 int타입이라 case에도 int로 넣어줘야함.
		case 3:			//case옆에 명령문을 두는 것은 선택사항이다. 16-18처럼 세로로 나열가능하며 20처럼 가로로도 나열가능
		case 4:
		case 5:
			season = "봄"; break;
		case 6: case 7: case 8:
			season = "여름"; break;
		case 9: case 10: case 11:
			season = "가을"; break;
		case 12: case 1: case 2: season = "겨울";
		}
		
		System.out.printf("%d월은 %s입니다.", month, season);
	}

}
