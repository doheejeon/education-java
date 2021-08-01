package ch05.ex05.home.case03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Dice dice = new Dice();
		Console console = new Console();
		Console.setNumber((int)(Math.random() * 6) + 1);
		Console.roll(dice);
		System.out.println(console.getNumber());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주사위를 굴릴까요(y/n)?");
		console.respond(sc.nextLine());
		
		
	}

}
/*과제
주사위를 굴린다.
--
(주사이ㅜ를 굴린다)
5 
주사위를 굴릴까요(y/n)? - ingorcase 쓰기, 예외처리하기 ,
1 
주사위를 굴릴까요(y/n)? 
4
주사위를 굴릴까요(y/n)? enter
ERROR] y나 n을 입력하세요. ( 엔터, 문자열 전부 예외처리)
주사위를 굴릴까요(y/n)? hello
ERROR] y나 n을 입력하세요. ( 엔터, 문자열 ,숫자 전부 예외처리)
주사위를 굴릴까요(y/n)? 1
ERROR] y나 n을 입력하세요. ( 엔터, 문자열 ,숫자 전부 예외처리)
끝.
*/