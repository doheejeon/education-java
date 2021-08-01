package ch07.ex01.case09;

public class AppleCar implements SmartCar{
	@Override
	public void start() {
		System.out.println("AppleCar start.");
	}
	
	@Override
	public void stop() {
		System.out.println("AppleCar stop.");
	}
	
	@Override
	public void klaxon() {
		System.out.println("AppleCar klaxon.");
	}
}
/*
 * 5-15 실제 알고리즘을 구현안해도 바디만 만들어주면 오류해결가능. 
 * 
 * 
 */
	
