package ch03.ex06.home;

import java.util.Scanner;

public class Adjust {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		double x = sc.nextDouble();
		
		//double result = x - x % 1;
		double result = Math.floor(x)% x; //round로하면 6.55555하면 버그발생.. 
		//선생님의 알고리즘: double result = x - x % 1;
		System.out.println(result); 
	}
}
/*
 * 입력된 실수값의 소수점 이하를 털어라.
 * % 연산자를 사용하라
 * (casting) 연산자 사용금지
 * --
 * x : 3.1492
 * 3.0
 *
 * x : 4.15
 * 4.0
 * 내가 쓴 코드 1차
 * 		double f = 3.141592;
		
		double result = (3f % 3.141592);
		System.out.println(result); 
		3.0이 출력되도 이건 1차원적인 코드다. 
 * 2차
 * 	Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		double f = sc.nextDouble();
		
		double result = Math.round(f)% f;
		System.out.println(result); 
 * 
 */
