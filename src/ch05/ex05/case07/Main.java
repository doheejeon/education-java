package ch05.ex05.case07;

public class Main {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		Apple apple = retailer.sell(farmer.sell(1000));
		System.out.println(apple.getPrice()); 			//2000
	}

}
/*
*apple은 농부가 만든거라서 new apple을 하면 안된다. 
*8> "리테일러가 sell한 사과는 (농부가 파는 사과) 이다 " -> 그걸을 apple의 리턴값으로 받는다.
*8> (오른쪽부터읽는다)
*	sell을 마치면 apple이 생성되고 그 새로 생성된 객체를 리턴해준다(farmer.sell(1000)) -> 그 사과객체를 리테일러에게 전달하고 
*		그 받은 사과를 그대로 리턴한다. (retailer.sell)->그 리테일러의 사과는 메인에게 던져짐 (Apple apple) 
*객체는 데이터이다. 즉 주소값 하나를 여기저기 복사해가면서 기능을 실행하고 최종적으로 메인의 애플에 주소값을 저장.
*/
