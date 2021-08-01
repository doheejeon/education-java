package ch07.ex02.case02;

public class Score {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		int[] scores = {100, 57, 75, 90};		//실제로는 입력을받아내겠지만 지금은 점수를 하드코딩한다.
		
		for(int score: scores) sum += score; 			//위의 숫자가 담기고 담기는 족족 sum에 누적시킨다.
		
		avg = 1.0 * sum / scores.length;				// length라고 한 이유: 4라고쓰면 확장성을 확보할 수 없다. 
		
		System.out.printf("%d %.1f", sum, avg);			//322 80.5
	}
}
