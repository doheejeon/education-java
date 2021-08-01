package ch04.ex02.home;

import java.util.Scanner;

//가위바위보를하자
public class H04Kawibawibo {
	public static void main(String[] args) {
		int myChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.가위, 2.바위, 3.보\n> ");
		myChoice = sc.nextInt();
		
		if(1 <= myChoice && myChoice <=3) {
			appChoice = (int)(Math.random()*3) + 1;//1부터3까지 랜덤.
			
			switch(myChoice - appChoice) {//이기는경우 숫자로생각해서 빼서 그 값을 입력
			case -2: case 1:
				result = "You Win."; break;
			case -1: case 2: //내가 질 경우
				result = "You Lose."; break;
			case 0: //비기는경우
				result = "Fair.";
			}
			
			switch(myChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보"; 
			}
		
			System.out.println("You: " + choice);
			/*if로 바꾸면 이렇게 int a = myChoice - appChoice; 
			if( a == -2 || a ==1) result = "You win.";*/
			switch(appChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			
			}
			System.out.println("Me: " + choice);	
		} else {
			result = "입력오류] 메뉴의 번호를 입력하세요.";
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
	}
}
/*
 * 앱과 가위바위보를 한다. 
 * --
 * 1.가위, 2.바위, 3.보 //엉뚱한값을 입력하는 것을 방지하자 '잘못입력했습니다'번호가코드의 역할을함
 * >1
 *You: 가위
 *Me: 보
 *You win.(You lose. You fair)
 */
