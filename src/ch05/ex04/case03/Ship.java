package ch05.ex04.case03;
//공유를 배워보자. 
public class Ship {
	private int passengerCnt;
	private static int totalPassengerCnt;
	
	public void sail(int passengerCnt) {
		this.passengerCnt = passengerCnt;
		Ship.totalPassengerCnt += passengerCnt;
	}
	
	public static int getTotalPassengerCnt() {
		return Ship.totalPassengerCnt;
	}
}
/*
*4> 인스턴수변수라서 개별로 따로따로 가져간다.
*5> 터미널관점에서 승선인원수를 표현하기위해 스태틱변수선언 
*7> sail을 할땐 승선인원수가 얼마인지 파악돼야 쓸 수있어서 파라미터로 int passenger넣어줌 (파라미터가 전제조건으로 데이터가 실행됨)
*9> 패신저 카운트를 누적시킨다.  스태틱변수앞에는 무조건 클래스. (Ship.) 붙여준다. 스태틱변수라는 것을 알려주기위해.
*12> static을 없애도 문제는 없지만, 사용할때는 무조건 클래스. 하고 객체를 생성해줘야 쓸 수 있다. best는 static메소드를 쓰지 않는것. 
*
*/