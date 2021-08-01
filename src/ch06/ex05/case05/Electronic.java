package ch06.ex05.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200;
	static final String MAKERNAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCEED_DATE = LocalDate.now();
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
	
}
/*
인퍼테이스에서는 선언과 동시에 초기화한다.  인터페이스는 일반메소드가 아니다. 
인터페이스의 멤버들은 모두 public으로 공개된다. = 인터페이스는 '표준'이기때문 , 공개하려고 만든 것이다. 
4>인터페이승세 선언하는 메소드는 내가 하지않아도 컴파일러가 알아서 public을 붙인다. 
인터페이스에 들어가는 멤버변수는 private할 수 없다. 
또한 static으로 선언해야된다 = 1.공유해서 쓸 수 있어야하기 떄문이다. 2.객체를 생성하지 못하기때문이다. 
inferface로는 new를 할 수 없어서 인터페이스에서 멤버변수를 선언한다면 그건 static 뿐이다. 
	내가쓰지않아도 컴파일러가 자동으로 추가시켜줌.
+ final을 적어준다. final 변수명은 대문자로 쓰는것이 관례다.

6>final만 써도 앞에 문구들은 컴파일러가 알아서 써준다.
9> 바로 데이터타입만써도 앞에 문구를 컴파일러가 써준다.
11> public abstract도 알아서 컴파일러가 써줌. 추상메소드는 늘 abstract이 들어간다. 

=멤버변수에는 컴파일러가 자동으로 기본으로 퍼블릭 스태틱 파이널이 붙는다. 
ㅁ멤버메소드앞에는 ㄷ기본으로 public abstract 이붙는다. 
*/