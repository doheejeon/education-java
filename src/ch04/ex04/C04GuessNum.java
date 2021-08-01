package ch04.ex04;

import java.util.Scanner;
//업다운 게임을 해보자. 
public class C04GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int target = (int)(Math.random() * 1000) + 1; //범위는 1부터 1000
		int guess = 0;
		int tries = 0;//내가 몇 번 시도했는지 카운트를 담는다.
		
		do {
			System.out.print("찍어봐: ");
			guess = sc.nextInt();
			tries++; 				
			
			if(guess > target) System.out.println("Down.");
			else if(guess < target) System.out.println("Up.");
		} while(guess != target);	//target과 guess가 일치하지 않으면 반복한다
		
		System.out.printf("%d번 만에 %d를 맞췄습니다.", tries, target);
	}

}
