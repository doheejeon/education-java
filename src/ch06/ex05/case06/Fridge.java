package ch06.ex05.case06;

public class Fridge implements HomeAppliance { //case05와 비교해서 하나로 상속받아서 코드가 훨씬 깔끔해질수있다. = 코드중복최소화
	@Override public void on() {}
	@Override public void off() {}				
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() {return 0;}
	@Override public String getModelName() {return null;}
	

}
