package ch05.ex09.case02;

public class Phone {
	private static int cnt;
	private int serial;
	
	{	
		serial = ++cnt * 100;			//카운터값에 100을 곱한다. 초기값은 100이됨.
	}

	public Phone() {}					//기본생상자를 직접 입력해줘야 파라미터입력생성자도 쓸 수 있다.
	
	public Phone(int serial) {
		this.serial = serial;			//serial값을 수동으로 할당하고싶을때. 
	}
	
	public int getSerial() {
		return serial;					//return this.serial; 멤버변수가 어디객체, 클래스에 있는지 알려줘야한다. 생략해도 컴파일이앞에자동으로 this.를 붙임
	}
}
