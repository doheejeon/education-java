package ch05.ex04.case03;

public class Main {
	public static void main(String[] args) {
		Ship ship1 = new Ship();
		Ship ship2 = new Ship();
		
		ship1.sail(100);
		ship2.sail(200);
		
		System.out.printf("터미널 이용객 수는 %d명입니다.", Ship.getTotalPassengerCnt()); 	//터미널 이용객 수는 300명입니다.
	}
}
/*
*8> ship1에 100명을 태우고 항해를 떠난다. 
*11>static변수를 이용해 토탈 이용객수를 알 수 있다. 300명 출력됨.
*/	