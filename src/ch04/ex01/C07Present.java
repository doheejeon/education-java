package ch04.ex01;
//경품줄건데 냉장고고르면 제조사를 고르는 알고리즘 만들어보기 2.
import java.util.Scanner;

public class C07Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mainChoice = 0;
		int subChoice = 0;
		String prize = "";
		String maker = "";
		
		System.out.print("1.냉장고, 2.세탁기\n> ");
		mainChoice = sc.nextInt();
		if(mainChoice == 1) prize = "냉장고";//냉장고를 골랐으면~,UI를 위해 고민한 알고리즘
		else if(mainChoice == 2) prize = "세탁기";
		else prize = "화장지"; //엉뚱한 값을 입력했을때 화장지를 드립니다. 
		
		if(mainChoice < 3) { //위에서 엉뚱한 값을 입력했을경우 20번메소드는 실행되지 않는다.
			System.out.print("1.삼성, 2.LG\n> ");
			subChoice = sc.nextInt();
			if(subChoice == 1) maker = "삼성";
			else maker = "LG";	
		}
		
		prize = maker + " " + prize; // ""를 넣어줌으로써 스페이스작용 삼성/세탁기 띄어서 가독성을 높여줌.
		System.out.println(prize + "를 드립니다.");
		}
}
