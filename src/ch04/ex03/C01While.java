package ch04.ex03;
//목표몸무게까지 줄넘기를 반복하는 while연습 
public class C01While {
	public static void main(String[] args) {
		int weight = 88;
		int jumpCnt = 0;
		
		while (weight > 60) { 	//몸무게가 60초과면 줄넘기를 계속한다.(반복문)
			jumpCnt++; 			//'줄넘기를 하다'를 표현함.
			weight--;			//'1번을 뛰면 몸무게가 1키로씩 줄어든다.'	
		}
		
		System.out.printf("줄넘기 %d번으로, 몸무게 %dkg을 달성했습니다.",
				jumpCnt, weight);//줄넘기 28번으로, 몸무게 60kg을 달성했습니다.
	}
}
