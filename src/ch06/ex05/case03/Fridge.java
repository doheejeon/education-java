package ch06.ex05.case03;

public class Fridge implements Appliance{			//인터페이스를 부모로 두고싶다고 implements를 쓴다. 
	@Override
	public void on() {
		System.out.println("냉장고를 켜다.");
	}
	
	@Override
	public void off() {
		System.out.println("냉장고를 끄다.");
	}
}

/*
3> "appliance 껍데기를 내가 상속받은 appliance의 바디를 implements 구현 하겠다. " 
	abstract을 붙이면 에러가 사라진다. (단 해당클래스는 그럼 추상클래스가된다.-> 해당 클래스 바디를 구현해줘야한다. 4-9문단 )
	추상메소드를 하나이상갖고있는 클래스는 추상클래스가 돼야한다. +astract 
	-> 에러 해결 1. 자식인 내가 추상클래스가 되던지 +abstract  2. 부모인터페이스에 바디를 만들어주던지. 
*/