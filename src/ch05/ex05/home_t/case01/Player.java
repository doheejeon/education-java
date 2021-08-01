package ch05.ex05.home_t.case01;

public class Player {
	private String name;
	private Ball ball;					//has a 관계가됨
	
	public Ball draw() {				//던지다, 볼이 튀어나오야하니가 리턴타입은 볼 
		return ball;					//내가 갖고있던 볼을 던지는 거니까 만약 야구선수라면 7번 draw()안에 파라미터로 ball이 들어가야함 
	}
	
	public void receive(Ball ball) {	//받다, 우선외부에서  공을 받아야하니까 파라미터로 ball을 넣는다.
		this.ball = ball;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

}
/*
* ball에 대한 get set을 하지 않았지만 draw와 receive를 통해 행동을 표현하고있음 
*/