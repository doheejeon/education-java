package ch04.ex04.home;

import java.util.Scanner;

public class Calculator_t {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		char op = 0; //연산자를 담는다.
		int result = 0;
		char isRepeat = 0; //반복계산할건지 물어보고 그 답을 저장.
		
		do {
			System.out.println("a: ");
			a = sc.nextInt(); sc.nextLine(); //다음에 이어서 나오는게 문자 연산자라서  남아있는 역슬래시n과 빈칸 쓰레기값을 없애야해서 추가로 빈칸입력받음. 
			System.out.println("op: ");
			op = sc.nextLine().charAt(0);
			System.out.println("b: ");
			b = sc.nextInt(); sc.nextLine(); // 쓰레기청소
			
			switch(op) { //if보다 switch가 더 깔끔
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b; 
			}
		
			System.out.printf("%d %c %d = %d\n", a, op , b, result);
			System.out.println("계속할까요(y/n)");
			isRepeat = sc.nextLine().charAt(0);
		
		} while (isRepeat == 'y');
		System.out.println("끝.");
	}
}


