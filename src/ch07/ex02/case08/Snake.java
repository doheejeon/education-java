package ch07.ex02.case08;

public class Snake implements Animal{
	@Override
	public void eat() {
		System.out.println("삼키다.");
	}
	
	public void move() {
		System.out.println("기어가다.");
	}
}
