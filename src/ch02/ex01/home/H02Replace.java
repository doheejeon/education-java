package ch02.ex01.home;

import java.util.Scanner;

public class H02Replace {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a:");
		int a = sc.nextInt(); //String 을 넣어서 틀린것.. 
		System.out.print("b:");
		int b = sc.nextInt();
		System.out.printf("=>a:%d, b:%d",a, b);
		
		System.out.println("\n=> a, b 변수의 값을 교체 합니다.");
		int tmp = 0;
		tmp = a;
		a = b;
		b = tmp;
		System.out.printf("=>a:%d, b:%d\n", a, b);
	}
}


// Q. a, b 변수의 값을 교체하라. (고도화작업)
/* a: 1를 입력하면 b가 나오고
b : 2를 입력하면 
=> a: 1, b:2
=> a, b 변수의 값을 교체합니다.
=> a:2, b:1
*/
