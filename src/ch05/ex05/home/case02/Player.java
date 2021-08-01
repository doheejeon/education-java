package ch05.ex05.home.case02;

public class Player {
	private Ball ball;
	private String name;
	
	public Ball pass() {
		return ball;
	}
	
	public void receive(Ball ball) {
		this.ball = ball;
	}
	
	public Ball shoot() {
		return ball;
	}

	public void setName(String name) {
		this.name = name;
	}
}