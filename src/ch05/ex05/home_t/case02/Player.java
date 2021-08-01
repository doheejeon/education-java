package ch05.ex05.home_t.case02;

public class Player {
	private String name;
	
	public Ball pass(Ball ball) {
		return ball;
	}
	
	public Ball kick(Ball ball) {
		return ball;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	

}
/*
4> 선수구별하는 속성으로 이름만 넣음. 
6>패스를 하려면 공이 필요 하니까 파라미터로 Ball ball을 넣는다. 
10> 차는행위도 마찬가지다 
공을 찼으니 공이 튀어나와야하니까 리턴타입은 public 'Ball'로 해준다. 
7>내가 공을 갖고있을 새가 없는 걸 과정하에  내가 받은 볼을 그대로 찬다 return ball
	그 볼을 다시 돌려줌(리턴해주는것) = 내가 받는게 아님. 
*/