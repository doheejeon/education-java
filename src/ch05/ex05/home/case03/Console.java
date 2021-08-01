package ch05.ex05.home.case03;

import java.util.Scanner;

//입출력메소드 콘솔클래스에는 입출력수행하는 기능을 여기서 한다. UI를 담당하는 객체 / static 메소드로 써야한다. 입력하다 ,출력하다 
public class Console {
	Scanner sc = new Scanner(System.in);
	public static int Number;
	String isRepeat = "";
	boolean isGood = false;
	String answer = "";
	
	public static Dice roll(Dice dice) {
		int Number = (int)(Math.random() * 6) + 1;
		return dice;
	}
	
	public void respond(String isRepeat) {
		do {
			do {
				System.out.print("주사위를 굴릴까요(y/n)?");
				isRepeat = sc.nextLine();
				if(isRepeat.length() == 1 &&
						(isRepeat.equalsIgnoreCase("y") || isRepeat.equalsIgnoreCase("n") )) {
					isGood = true;
				} else System.out.println("ERROR] y 혹은 n을 입력하세요.");
				if(isGood == true) System.out.println(Console.getNumber());
			}while(!isGood);
			
		}while(isRepeat.equalsIgnoreCase("y"));
		System.out.println("끝.");
	}
	
	@Override
	public String toString() {
		return Number + " ";
	}
//
	public static int getNumber() {
		return Number;
	}

	public static void setNumber(int number) {
		Number = number;
	}
	
	
	
	
	
	
}
