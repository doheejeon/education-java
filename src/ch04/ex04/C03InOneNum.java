package ch04.ex04;

import java.util.Scanner;
//한 자리의 숫자를 입력받자. 
public class C03InOneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";//인풋값을 저장할 곳
		boolean isOne = false;//한자리 숫자가 아니면 false
		String errMsg = "ERROR] 한자리 자연수를 입력하세요.";
		
		do {
			System.out.print("입력: ");
			input = sc.nextLine();	//과제: 한자리 자연수가 아니면 계속 반복하도록 하시오.
			if(input.length() == 1 && input.charAt(0) > '0' && input.charAt(0) <= '9')
				isOne = true;
			else System.out.println(errMsg);
		} while(!isOne); 
		
		System.out.println("끝.");
	}

}
