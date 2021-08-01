package ch06.home.ex03.work02;

public class Circle { 	//is a 관계가 아니라 이 코드는 나쁜코드다. has a 관계가 적당한 디자인임 
	private Point point; //circle has a Point가 됨.
	private int r;
	
	public Circle(Point point, int r) {
		this.point = point;		//x,y를 포장한 point를 직접다룬다
		this.r = r;
	}
}