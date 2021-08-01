package ch05.ex05.home.case02;

public class Main {
	public static void main(String[] args) {
		Ball ball = new Ball();
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		
		player1.setName("최한석");
		player2.setName("한아름");
		player3.setName("양승일");
		
		player1.receive(ball);
		player2.receive(player1.pass());
		player3.receive(player2.pass());
		player3.shoot();
	}
}
/*
최한석, 한아름, 양승일이 축구를 한다.
한석이가 아름이한테 공을 패스한다.  
아름이는 승일이한테 공을 패스한다. 
승일이는 골을 넣는다. 
*/