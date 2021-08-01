package ch06.home.ex03.work01;

public class Circle extends Point{ 	//is a 관계가 아니라 이 코드는 나쁜코드다. has a 관계가 적당한 디자인임 
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
}