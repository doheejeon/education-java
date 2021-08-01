package ch07.ex02.case06;
//배열을 표로 생각해보자.
public class DoubleArray {
	public static void main(String[] args) {
		int[][] scores = {
				{90, 90, 90},			//scores[0] 에 저장되어있음. 이 값이 또 배열일때 그 안에서 첫 값을 지칭하고싶다면 scores[0][0]
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}			//마지막 50을 지칭하고싶을땐 scores[4][2] 라고 한다. 
			};
		
		System.out.println("번호 국어 영어 수학 합계 평균");			//제목출력은 고정되어있으니 하드코딩. 
		System.out.println("---------------------");
	
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			
			System.out.print(" " + (i + 1) + " ");			//실제인덱스는 0부터시작하니, 보일땐 1부터 보이도록 프레젠테이션로직을짠다.
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j]; 						//읽은값을 sum에 저장한다.  sum은 레코드가 이동할때마다 초기화됨 (17번)=학생별로 sum값을따로 구할수있음.
				System.out.printf("%5d", scores[i][j]);		//d앞에 5는 숫자사이의 간격조정 
			}
			System.out.printf("%5d %4d\n", sum, sum/scores[i].length);
		}
	}
}
/*
컬렉션안의 원소가 컬렉션일때 '표'가된다.
4> 2차원배열은 []를 2개써준다. 원소값을 알면 4-6바디안에 써주면된다. 
17> raw data를 이용해서 합계 평균등을 만들어줘야한다. 
+이중for문을 이용해서 cursor알고리즘을 구현해줬다.

디버깅하면서 흐름을 추적하자. 

*/