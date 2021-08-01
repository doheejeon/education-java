package ch04.ex05.home;

public class H02Three69 {
	public static void main(String[] args) {
		int tens = 0; 		// 십의 자리
		int ones = 0;		// 일의 자리
		
		for(int i = 1; i <= 99; i++) {
			tens = i / 10;	
			ones = i % 10;
			
			System.out.print(" " + i);
			if(tens != 0 && tens % 3 == 0) System.out.print("짝");
			if(ones != 0 && ones % 3 == 0) System.out.print("짝");
			
			if(i % 10 == 0) System.out.println(); //십의 단위로 끊어서 출력. 줄바꿈용도
		}
		
		}
	}

/*
369 게임을 진행하라. 숫자는 1이상 99이하를 사용한다. 
--
1 2 3짝 4 5 6짝 7 8 9짝  10
11 12 13짝 ...
...
61짝 62짝 63짝짝 64짝 65짝 66짝짝 67짝 68짝 69짝짝 70
...
..99짝짝 


*/