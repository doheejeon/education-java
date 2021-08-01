package ch07.home.ex02.work01T;

public class Slot {
	private Ball[] balls;			//여러개의 공을 갖고있을땐 배열을 이용해서 표현한다.
	
	public Slot() {
		balls = new Ball[45];		//DI 작업을 생성자로 해준다, 45개의 볼을 담을 수 있는 변수그릇이 생긴것. 
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1);	 		//숫자가 적힌 공을 하나씩 집어넣는다. 9번에서 0부터시작했으니 10에서 1을 더해줌 
	}
	
	public Ball chuck() {
		int i = 0;
		Ball ball = null;			//토해낸 볼을 담아낼 '볼'변수
		
		do {
			i = (int)(Math.random() * 45); 	//0이상 44이하의 숫자가 존재하게됨.
			ball = balls[i]; 		//뽑은 볼을 담아낸다. 
			balls[i] = null;		//담아낸 볼은 아예 빼야한다. 중복이 존재하지 않게하는 핵심 알고리즘.  "19에서 한번꺼내면 그 볼스의 i를 없애버린다"
		} while(ball == null);		//ball의 값ㅇ ㅣnull이면 볼을 뽑아내는 작업을 반복하는 조건을써준다. 
		
		return ball;				//그리고 뽑아낸것을 리턴한다. 
	}
		}

/*
4> 1:N을 컬렉션으로 표현한다. 
13> 공을 하나 토해내다. 
17> 내가한번빼낸공은 머리에 존재하지않아야한다. 

*/