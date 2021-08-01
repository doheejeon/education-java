package ch04.ex03.home;

public class Money {
	public static void main(String[] args) {
		int myMoney = 0;
		int money = 0;
	
		while(myMoney < 30000) {
			money = (int)(Math.random()*3) + 1;
			
			switch(money) {
			case 1: money = 1000; break;
			case 2: money = 5000; break;
			case 3: money = 10000;
			System.out.println(myMoney + "원");
			
			if(myMoney >= 30000) {
				System.out.println(myMoney + "원을 꺼냈습니다.");break;
				}		
			}
			myMoney += money;
			System.out.println(myMoney + "원을 꺼냈습니다.");
		
		}
	}	
}
/*3만원짜리 물건을 산다. 
*지갑에서 지폐를 여러차례 꺼냅니다. 
지갑 안에 5만원지폐는 없습니다. 

손에 3만원 이상이 쥐어지면 지갑을 닫습니다. 
--

6,000원 (랜덤) 
10,000원 
8,000원 
10,000원 (3만원 이상이 됐으니 멈춘다.
34000원을 꺼냇습니다.
*/ 