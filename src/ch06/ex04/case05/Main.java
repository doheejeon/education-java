package ch06.ex04.case05;

public class Main {
	public static void main(String[] args) {
		Shoes shoes = new Shoes(1000);
		
		System.out.println(shoes.getPrice()); 
	}
}

/*
Shoes클래스에 getprice를 추가해주면 7번의 출력결과는 1000이다. 
	 없으면 2000출력 
	
	= 멤버변수,멤버메소드는 결국 멤버가 정의된 클래스의 것이 사용된다. 
	= 멤버는 해당멤버가 정의된 클래스 것이 사용된다. 
*/