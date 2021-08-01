package ch06.ex05.case05;

import ch06.ex05.case03.Appliance;

public class Fridge implements Appliance, Electronic { 
	@Override public void on() {}
	@Override public void off() {}				
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() {return 0;}
	@Override public String getModelName() {return null;}

}
/*
5> extends 와 다르게 implements는 하나 이상을 상속받을 수 있다. //냉장고는 가전이다 를 표현위해 어플라이언스, 일렉트로닉스 다 가져옴.
추상클래스는 일반메소드를 갖지만 인터페이스는 일반메소드(바디를)를 갖지못한다. 
6,7 > appliance에서 받은 메소드를 ovverride함. 
*/