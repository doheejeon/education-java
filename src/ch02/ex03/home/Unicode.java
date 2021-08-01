package ch02.ex03.home;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.print("문자: ");
		char a = (char) sc.nextInt();
		int b = 
		*/ 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자: ");
		char ch = sc.nextLine().charAt(0);//첫번째 문자를 끌어내겠다.
		
		int unicode = ch;
		System.out.printf("%c의 unicode는 %d입니다.", ch, unicode);  
		
		
		
		
		
		
		
	
		
	}

}
/* 
입력한 문자의 unicode 출력한다

* 문자 : A (입력기다린다)
* A의 unicode는 65입니다.
*/
