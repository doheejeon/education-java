package ch04.ex01;
//경품줄건데 냉장고고르면 제조사를 고르는 알고리즘 만들어보기 1.
import java.util.Scanner;

public class C06Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mainChoice = 0;
		String prize = "";
		
		
		System.out.print("1.냉장고, 2.세탁기\n> ");
		mainChoice = sc.nextInt();
		if(mainChoice == 1) prize = "냉장고";//냉장고를 골랐으면~,UI를 위해 고민한 알고리즘
		else if(mainChoice == 2) prize = "세탁기";
		//else prize = "화장지"; 엉뚱한 값을 입력했을때 업무적으로 바꾸는법
		
		String msg = ""; //과제
		if(!(1 <= mainChoice && mainChoice <= 2)) 
			msg = "잘못 입력했습니다.";
		else msg = prize + "를 드립니다.";
		System.out.println(msg);
		
		//System.out.println(prize + "를 드립니다.");
		
		
	}
}
