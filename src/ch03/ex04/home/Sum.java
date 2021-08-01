package ch03.ex04.home;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		int c = (a + b);
		System.out.printf("%d + %d = %d", a, b, c);
		
	}

}
/*
두 자연수를 입력 받아, 그 합계를 출력하라.
--

a: 1(입력)
b: 2 (입력)
1 + 2 = 3

선생님이 쓴 코드
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.print("b: ");
	int b = sc.nextInt();
	
	System.out.printf("%d + %d = %d", a, b, a +b);
*/