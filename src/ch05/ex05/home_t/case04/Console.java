package ch05.ex05.home_t.case04;

import java.util.Scanner;
//UI를 담당 과거 presentation logic부분을 따로 클래스로 만들어준것. 
public class Console {
	public static String inLine(String msg) {
		Scanner sc = new Scanner(System.in);
		
		boolean isGood = false;
		String line = "";
		
		do {
			System.out.print(msg + ": ");
			line = sc.nextLine();
			
			if(line.length() > 0) isGood = true;
			else System.out.println("ERROR] 한글자 이상 입력하세요.");
		}while(!isGood);
		
		return line;	
	}	
}

/*
4>입력받은 내용을 리턴한다.
10>입력값을 저장할 곳을 만든다. 
16> "뭐라도 입력하면 참인 데이터이다. "
18> 반복의 조건은 참이 아닐경우. 
13>사용자가 메인에서 입력한 값을 리턴한다. 

*/