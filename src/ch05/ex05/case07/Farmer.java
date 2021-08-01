package ch05.ex05.case07;
//기능을 표현하고 멤버변수가 없는 이 객체는 도메인이라 부르지 않는다. 
public class Farmer {
	public Apple sell(int price) {
		Apple apple = new Apple();
		apple.setPrice(price);
		
		return apple;
	}

}
/*
*5> 농부가 사과를 만들었다
*6> 사과를 팔려면 가격이 파라미터로 와야함 
*/