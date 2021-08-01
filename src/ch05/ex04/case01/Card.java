package ch05.ex04.case01;
//여기서는 캡슐화를 하지 않아서 프라이빗 안씀
public class Card {
	public String kind;
	public int number;
	public static int width;			//4-5번줄과 다르게 딱 한번만 생성된다(물리적).스태틱변수도 인스턴스로 구성하는 멤버변수가된다(논리적) 
	public static int height;

}
