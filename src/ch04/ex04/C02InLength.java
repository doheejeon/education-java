package ch04.ex04;

import java.util.Scanner;
//데이터의 길이가 내가 원하는 길이가 아니면 거짓된 데이터로 인식, 차단후 재입력안내 
public class C02InLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int len = 0;
		
		do {
			System.out.print("한 글자를 입력하세요: ");
			input = sc.nextLine();
			len = input.length();
			System.out.println(len + "글자 입력했습니다.");
		} while(len != 1);	//데이터를 입력하지 않았을경우? 과제:1글자를 입력하지않았을경우 do반복하기 
		
		System.out.println("끝.");
	}

}
