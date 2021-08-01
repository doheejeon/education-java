package ch04.ex04.home;
import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
												//입력변수
		int a = 0;
		int b = 0;
		String aStr = "";
		String bStr = "";						// a,b에 입력할 임시변수를 만들어줘서 nextline으로 만든다.
		
		String op = ""; 
	
		boolean isGood = false;
												//출력변수
		int result = 0;
		String isRepeat = ""; 
							
		do {
			
			do {	
				System.out.print("a: ");
				aStr= sc.nextLine();
				if(aStr.length() == 1 && aStr.charAt(0) > '0' && aStr.charAt(0) <= '9') {
					isGood = true; 
				a = Integer.parseInt(aStr);		//parseint로 다시 변환
			} else System.out.println("ERROR] 한 자리 자연수를 입력하세요."); 
		} while(!isGood); 						//참이 아니면 반복한다.
								 	 
			do {
				isGood = false;					//위에서 true로 돼서 반복하지 않게되기때문에 다시한번 isGood의 값을 초기화해줘야한다.사용전에 청소부터해줘야한다. 
				System.out.print("op: "); 
				op = sc.nextLine();
				if(op.length() == 1 && 
						(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))){
					isGood = true;
			} else { 
				System.out.println("ERROR] +, -, *, / 중에 입력하세요.");
			}
		}while(!isGood);
		
			do {
				isGood = false;
				System.out.print("b: ");
				bStr= sc.nextLine();
				if(bStr.length() == 1 && bStr.charAt(0) > '0' && bStr.charAt(0) <= '9') {
					isGood = true; 
				b = Integer.parseInt(bStr);
			} else System.out.println("ERROR] 한 자리 자연수를 입력하세요."); 
		} while(!isGood); 			//참이 아니면 반복한다.
			
	
		switch(op) { 
		case "+": result = a + b; break;  				//ctrl+F로 바꿀값을 한 번에 처리할 수 있다.
		case "-": result = a - b; break;
		case "*": result = a * b; break;
		case "/": result = a / b; 
		}
		
		System.out.printf("%d %s %d = %d\n", a, op , b, result);
		
		do {
			isGood = false;
			System.out.print("계속할까요(y/n)");
			isRepeat = sc.nextLine();
			if(isRepeat.length() == 1 && 
					(isRepeat.equalsIgnoreCase("y") || isRepeat.equalsIgnoreCase("n"))) {
				isGood = true;
			}else System.out.println("ERROR] y 혹은 n을 입력하세요.");
		}while(!isGood);
	} while(isRepeat.equalsIgnoreCase("y")); //대소문자 가리지 않고 받는 API
		System.out.println("끝.");
		}
}

/*ch04.ex.04.home.Calculator를  refactoring한다
 * 예외처리를한다 ,
 * - a, b,는 한 자리 자연수이다 ( 조건이 맞아야 참)
 * -연산자는 +, -, *, / 이다. ( 네개를 벗어나면 거짓) 다시 입력하라고 안내해야함
 * 예외처리 에러메시지 띄우기 
*/