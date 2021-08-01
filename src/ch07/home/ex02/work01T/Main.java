package ch07.home.ex02.work01T;

public class Main {
	public static void main(String[] args) {
		Slot slot = new Slot();		//기계안에 볼을 넣어놨으니 볼은 안가져와도된다. 
		Ball[] balls = new Ball[6];	//기계에서 뽑아낸 볼을 담을 그릇준비. 
		
		for(int i = 0; i < 6; i++)		//6개 뽑아야하니까 6번 한다.
			balls[i] = slot.chuck();	//slot에서 뽑아낸 족족 담아낸다.
		
		for(Ball ball: balls)
			System.out.print(ball.getNum()+ " ");
}
}
/*	
기계에 로또공 45개가 담겨있다.
위 공에는 1이상 45 이하의 숫자가 1개 적혀있다. 
위 숫자는 공별로 유일하다.

기계에서 공 6개를 뽑는다.

*/