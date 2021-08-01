package ch07.home.ex01.work01;

public class Clerk {
	public Flower sell(String flowerName) { 
		Flower flower = null;
		
		switch(flowerName) {
		case "백합": flower = new Lily(); break;
		case "장미": flower = new Rose();
		}
		
		return flower;
	}
}
	
//public void sell(Flower flower) {  파라미터로 꽃을 전달받는게 아니라, 꽃의 이름을 받는거다. 


/*
4> 파라미터로 꽃이름을 받아야, 리턴으로 Flower가 나옴  리턴타입이나 파라미터에 인터페이스를 넣으면 확장성이 생긴다. 


*/