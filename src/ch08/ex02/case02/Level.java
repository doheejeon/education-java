package ch08.ex02.case02;
//쇼핑몰 회원등급을 나눈다.
public enum Level { 
	GOLD(3, null), SILVER(2, GOLD), BASIC(1, SILVER); //생성자를 레벨클래스내부에서생성. 
	
	private final int value; //골드3 실버2 베이직1 로 하고싶다.
	private final Level next; 
	
	private Level(int value, Level next) { //내부에서만 생성자를 쓸것이라 (enum은 '코드'라서 외부에서 못바꾸게) 생성자에 private 씀.남이 객체생성못하게 막음 
		this.value = value;
		this.next = next;
	}
	
	public int intValue() { //코드를 숫자로 표현할때 intValue쓴다.
		return this.value;
	}
	
	public Level next() {
		return this.next;			//베이직이 호출되면 자신의 넥스트값인 실버가 리턴된다. 
	}
	
	public static Level valueOf(int value) { //레벨을 나타내는 코드(골드실버베이직)이 필요하면 이 메서드를 호출하면된다.
		Level level = null;
		switch(value) {
		case 3: level = GOLD; break;
		case 2: level = SILVER; break;
		case 1: level = BASIC;
		}
		
		return level;
	}
	
}
/*
enum은 도메인이다.


*/