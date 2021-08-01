package ch05.ex05.case05;

public class Main {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Basket basket = new Basket();
		
		basket.setApple(apple);
		basket.getApple();
		
	}

}
/*
*이 객체의 바이트크기는 4byte다. 
*8>basket.setApple(apple);"바구니에 사과를 담다." 여기서 바구니가 담고있는 사과는 main것이다. 
*9>"바구니에서 사과를 꺼내다."
*/