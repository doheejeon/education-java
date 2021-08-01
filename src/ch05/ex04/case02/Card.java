package ch05.ex04.case02;
//이번엔 캡슐화를 합니다. = getter와setter를 동반한다. 
public class Card {
	private String kind;
	private int number;
	private static int width;
	private static int height;
	
	public String getKind() {
		return kind;
	}
	
	public int getNumber() {
		return number;
	}
	
	public static int getWidth() {
		return width;
	}
	
	public static int getHeight() {
		return height;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public static void setWidth(int width) {
		Card.width = width;
	}
	
	public static void setHeight(int height) {
		Card.height = height;
	}
}
