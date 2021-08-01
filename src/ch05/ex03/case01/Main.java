package ch05.ex03.case01;
//하나의 클래스로 여러개의 객체를 만들 수 있다.
public class Main {
	public static void main(String[] args) {
		Tv tv1 = new Tv();		//클래스 변수명 = new 클래스();  왼쪽은 변수를 만드는 것 new 클래스하면 객체를 만드는 것. "Tv1객체"라고 부른다.
		Tv tv2 = new Tv();		//6번째줄까지는 윤곽만 그리는 작업이다. 
		
		tv1.setColor("red");	//8번줄부터 업무적인관점에서 초기화가된다. 버그발생시 피지컬한 VM관점에서 분석하면된다.
		tv1.setPower(true);  	//전원이 켜져있다를 true로 표현
		tv1.setChannel(7);
		
		tv1.channelUp();		//tv를 주어로 봤을때 객체지향으로 본 것이다 "tv가 채널을 올린다." 
		System.out.println(tv1.getChannel());	//8
		System.out.println(tv2.getChannel());	//0 int타입의 기본값이 0이기때문에 =초기화된 기본값이 0이기때문입니다. 
		
		System.out.printf("tv1: %s\ntv2: %s\n", tv1, tv2);
		tv2 = tv1;		
		System.out.printf("tv1: %s\ntv2: %s\n", tv1, tv2);
		
		tv1.channelDown(); 	
		System.out.printf("tv1: %d\ntv2: %d", tv1.getChannel(),tv2.getChannel()); //tv1: 7, tv2: 7 
	}

}
/*tv1와 tv2는 독립된 객체이다.tv라는 class만 공유할뻔 각각 독립된 공간이다. 
 * 16번 실행결과 tv1: ch05.ex03.case01.Tv@1b6d3586
			tv2: ch05.ex03.case01.Tv@4554617c
			주소값이 서로 다르다. 
	17번 실행후에는 주소값이 서로 같아지기때문에 주소값으로 서로 구분할 수 없다. 하나의 객체에 tv1, tv2이름 총 두개가 붙어버리는 것. 
	업무적인 관점에서 속성(멤버변수값)으로 각 객체를 구분한다. 
 */
