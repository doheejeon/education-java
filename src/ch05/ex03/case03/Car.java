package ch05.ex03.case03;
//우선 문자,숫자,날짜로 표현하기
public class Car {
	private int price;
	private String makerName;
	
	public void startUp() {}
	public void run() {}
	public void stop() {}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}
}

/*
*5> maker는 객체 makerName은 리터럴 
*/