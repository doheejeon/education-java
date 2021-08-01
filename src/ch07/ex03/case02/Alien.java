package ch07.ex03.case02;

public class Alien extends Life {
	//@Override
	public static void eat() {	//override하기위해 선언부는 life와 똑같이 간다.
		System.out.println("Alien 먹다.");			//사실 override가 아니다. 메서드이름이 같을 뿐.
	}
	
	@Override
	public void shout() {
		System.out.println("Alien 소리치다.");
	}
}


/*
5> static 메서드는 상속되지않는다. 

15> alien1의 데이터타입은 Life 
	16번의 데이터타입은 Alien이다.
	
24-25> 오버라이드된 메서드는 자식것이 실행된다. 
*/