package ch05.ex05.home_t.case01;

public class Main {
	public static void main(String[] args) {
		Ball ball = new Ball();
		Player player1 = new Player();
		Player player2 = new Player();
		
		player1.setName("최한석");
		player2.setName("한아름");
		
		player1.receive(ball);
		player2.receive(player1.draw());		
		player1.receive(player2.draw());
		
	}
}
/*
*최한석과 한 아름이 캐치볼게임을 합니다.
*
*/