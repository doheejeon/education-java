package ch07.ex03.case02;

public class Main {
	public static void main(String[] args) {
		Life alien1 = new Alien();
		Alien alien2 = new Alien();
		
		alien1.eat();		//먹다. -> Life 클래스의 eat실행 
		alien2.eat();		//Alien 먹다. ->Alien 클래스의 eat실행 
		
		Life.eat();			//static method는 class. 하고 호출하기로 약속했었다. 18-19는 21-22로 쓰면 복잡한 분석을 하지 않아도된다.
		Alien.eat();
		
		alien1.shout();		//Alien 소리치다.
		alien2.shout();		//Alien 소리치다.
	}
}
/*
 static 메서드는 상속되지않는다. 

8> alien1의 데이터타입은 Life 
	9번의 데이터타입은 Alien이다.
	
14-15> 오버라이드된 메서드는 자식것이 실행된다. 
*/