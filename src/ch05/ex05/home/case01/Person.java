package ch05.ex05.home.case01;

public class Person {
	private String name;
	private Ball ball;
	
	public void throwUp() {
		ball.throwUp();
	}

	public String getName() {
		return name;
	}

	public Ball getBall() {
		return ball;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}
}
