package ch04.ex04.home;

import java.util.Scanner;

public class Calculator_again {
	public static void main(String[] args) {
		
		calc();
//		Scanner sc = new Scanner(System.in);
//		
//		int a = 0;
//		int b = 0;
//		String aStr = "";
//		String bStr = "";
//		
//		String op = "";
//		
//		boolean isGood = false;
//		
//		int result = 0;
//		String isRepeat = "";
//		
//		do {
//		do {
//			System.out.print("a: ");
//			aStr = sc.nextLine();
//			if(aStr.length() == 1 && aStr.charAt(0) > '0' && aStr.charAt(0) <= '9') {
//				isGood = true;
//			a = Integer.parseInt(aStr);
//			} else System.out.println("ERROR] 한 자리 자연수를 입력하세요.");
//		}while(!isGood);
//		
//		do {
//			isGood = false;
//			System.out.print("op: ");
//			op = sc.nextLine();
//			if(op.length() == 1 &&
//					(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
//				isGood = true;
//			} else System.out.println("ERROR] +, -, *, / 중에 입력하세요.");
//		}while(!isGood);
//		
//		do {
//			isGood = false;
//			System.out.print("b: ");
//			bStr = sc.nextLine();
//			if(bStr.length() == 1 && bStr.charAt(0) > '0' && bStr.charAt(0) <= '9') {
//				isGood = true;
//				b = Integer.parseInt(bStr);
//			} else System.out.println("ERROR] 한 자리 자연수를 입력하세요.");
//		} while(!isGood);
//		
//		switch(op) {
//		case "+": result = a + b; break;
//		case "-": result = a - b; break;
//		case "*": result = a * b; break;
//		case "/": result = a / b;
//		}
//		
//		System.out.printf("%d %s %d = %d\n", a, op, b, result);
//		
//		do {
//			isGood = false;
//			System.out.print("계속할까요(y/n)");
//			isRepeat = sc.nextLine();
//			if(isRepeat.length() == 1 &&
//					(isRepeat.equalsIgnoreCase("y") || isRepeat.equalsIgnoreCase("n"))) {
//				isGood = true;
//			}else System.out.println("ERROR] y 혹은 n을 입력하세요.");
//		}while(!isGood);
//	} while(isRepeat.equalsIgnoreCase("y"));
//		System.out.println("끝.");
	}
	
	public static void calc() {
		
		String[] opArr = {"+", "-", "*", "/"};
		String op;
		boolean isCalc = true;
		int a = 0;
		int b = 0;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(isCalc) {
			
			System.out.print("a: ");
			a = sc.nextInt();
			if(a < 0 && a > 10) {
				System.out.println("ERROR] 한 자리 자연수를 입력하세요.");
				continue;
			}
			
			System.out.print("op: ");
			op = sc.next();
			boolean isOp = false;
			for(String s : opArr) {
				if(op.equals(s)) isOp = true;
			}
			
			if(!isOp) {
				System.out.println("ERROR] 연산자 확인해라.");
				continue;
			}
		
			System.out.print("b: ");
			b = sc.nextInt();
			if(b < 0 && b > 10) {
				System.out.println("ERROR] 한 자리 자연수를 입력하세요.");
				continue;
			}
			
			switch(op) {
			
				case "+": result = a + b; break;
				case "-": result = a - b; break;
				case "*": result = a * b; break;
				case "/": result = a / b;
			}
			
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			
			System.out.print("계속할까요(y/n)");
			
			String repeat = sc.next();
			if(repeat.toLowerCase().equals("n")) {
				System.out.println("끝.");
				isCalc = false;
			}else if(repeat.toLowerCase().equals("y")){
				isCalc = true;
				
			}else {
				System.out.println("ERROR] y 혹은 n을 입력하세요.");
			}
			
		}
	}
}
