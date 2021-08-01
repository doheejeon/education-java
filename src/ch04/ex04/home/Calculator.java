package ch04.ex04.home;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		char op = 0; //연산자를 담는다.
		int result = 0;
		char isRepeat = 0; //반복계산할건지 물어보고 그 답을 저장.
		String tmp = "";
		
		do {
			System.out.println("a: ");
			a = sc.nextInt();
			tmp = sc.nextLine();
			System.out.println("op: ");
			op = sc.nextLine().charAt(0);
			System.out.println("b: ");
			b = sc.nextInt();
			tmp = sc.nextLine();
			
			if(op == '+') {result = a + b;
				System.out.printf("%d %c %d = %d\n", a, op, b, result);
			}else if (op == '-') {result = a - b;
				System.out.printf("%d %c %d = %d\n", a, op, b, result);
			}else if (op == '*') {result = a * b;
				System.out.printf("%d %c %d = %d\n", a, op, b, result);
			}else if (op == '/') {result = a / b;
				System.out.printf("%d %c %d = %d\n", a, op, b, result);
			}
		
			System.out.println("계속할까요(y/n)");
			isRepeat = sc.nextLine().charAt(0);
		
		} while (isRepeat == 'y');
		System.out.println("끝.");
	}
}
/*
계산기를 만든다. 
연산자는 +, -, *, / 이다.(나누기는 몫만 얻는다)
실행순서는,
- 숫자값 하나를 입력한다. 
- 연산자를 입력한다. 
- 숫자값 하나를 입력한다. 
- 연산결과를 출력한다.
--
a: 1
op : +
b: 2 
1 + 2 = 3
계속할까요(y/n)? y
a: 2
op : * 
b:2
2 *2 = 4
계속할까요(y/n)? n
끝.
*/
