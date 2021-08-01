package ch04.ex03.home;

public class Money_t {
	public static void main(String[] args) {
		int hand = 0; //손에 쥔 돈
		int price = 30_000; //하드코딩 
		int tmp = 0; //쌓이는 돈의 임시저장소
		//천,오천,만원 구분할 필요가 없다.
		while(hand < price) {
			tmp = (int)((Math.random() * 30) + 1) * 1000;//천원-3만원사이경우의수
			System.out.println(tmp);
			hand += tmp; //계속 쌓아둠
			
		}
	System.out.println(hand + "원을 꺼냈습니다.");
	}
}