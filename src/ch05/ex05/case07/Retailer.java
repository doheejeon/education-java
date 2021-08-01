package ch05.ex05.case07;
//객체not 도메인 . apple은 도메인, farmer,retailer는 객체여서 멤버변수가 없고 행동을 나타내는 메소드만 있을 뿐이다.
public class Retailer {
	public Apple sell(Apple apple) {
		apple.setPrice(apple.getPrice() * 2);
		return apple;
	}

}
/*
*4> 유통업자는 sell을 하기위해 파라미터로 apple을 둔다.
*5> "유통업자의 사과는 농부에게서 받은 가격의 2배를 받겠다. "
*/