package ch07.ex01.case09;

public class TeslaCar implements SmartCar{
	private SmartCar software;		//dependency
	
	public TeslaCar(SmartCar software) {
		this.software = software;
	}
	
	@Override
	public void start() {
		this.software.start();
	}
	
	@Override
	public void stop() {
		this.software.stop();
	}
	
	@Override
	public void klaxon() {
		this.software.klaxon();
	}
	
	public void setSoftware(SmartCar software) {
		this.software = software;
	}
}
/*
teslaCar는 애플카와 구글카에 의존해야한다. = 디펜던시 = 멤버변수로 디자인한다. 
4> 구글카, 애플카가 아닌 스마트카로 멤버변수를 디자인하면 확장성 확보가능 
6> 생성자에서는 파라미터로 스마트카 소프트웨어를 받을것이다. 
10-20> override 를 통해 몸체구현 , 각각의 소프트웨어로 기능이 나도록 12,17,22처럼 써준다. 

25> 만약 손님이 software를 바꾸게하고싶다면 setter를 둔다.
	
*/