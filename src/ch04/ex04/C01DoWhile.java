package ch04.ex04;

import java.util.Scanner;

public class C01DoWhile {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;
		
		do {
			System.out.print("a: "); a= sc.nextInt();
			System.out.print("b: "); b= sc.nextInt();
			
			result = a + b; 
			
			System.out.printf("%d + %d = %d\n", a, b, result);
		} while(result != 0);//result값이 0이 아니면? 다시 do로간다 ,어떤식이와도 true면실행, false면 실행하지않아. 참을 찾는게 아니라 반복을 위한 조건
	
		System.out.println("합계가 0이 되어 마칩니다.");
	
	}
}