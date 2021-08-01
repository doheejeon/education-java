package ch07.ex02.case09;

public class Main {
	public static void main (String[] args) {
		Basket<Apple> basket = new Basket<Apple>();		//여기서 generic type을 apple로 결정해줬다. 이 객체 scope내에서만 유효한다.
		basket.set(new Apple());
		System.out.println(basket.get()); 		//사과 출력
		
		Basket<Grape> basket2 = new Basket<Grape>();
		basket2.set(new Grape());
		System.out.println(basket2.get());		//포도 출력 
	}		
}

/*
확장성확보 1.interface 2.generic type 
*/