package ch05.ex05.home.case04;

import java.util.Scanner;

public class Console {
	public static String inLine(String msg) {
		Scanner sc = new Scanner(System.in);
		
		boolean isGood = false;
		String line = "";
		
		do {
			System.out.print(msg + ": ");
			line = sc.nextLine();
			
			if(line.length() > 0) isGood = true;
			else System.out.println("ERROR] 한 글자 이상 입력하세요.");
		}while(!isGood);
		
		return line;
	}

}
