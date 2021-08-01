package ch07.ex02.case03;
//최고값, 최소값을 뽑아내자
public class MaxMin {
	public static void main(String[] args) {
		int[] scores = {77, 88, 91, 33, 100, 55, 95};
		
		int max = scores[0];			//멍청하니까 2개씩만 비교한다.
		int min = scores[0];			//우선 최고,최소가 다 77이라고 하고 시작한다.
		
		for(int score: scores) {
			if(score > max) max = score;
			if(score < min) min = score;
		}
		
		System.out.printf("%d %d", max, min);		//100 33
	}

}
/*
11>스코어랑 맥스값을 비교해서 스코어가 크면 스코어를 맥스값으로 바꿔줘야지. 
12> if() 가로안이 맞으면 넘어간다. min값이 스코어보다 작으면? 그 스코어를 min으로 교체해줘야지.

이 클래스처럼 데이터가 정해지지않고 개수가 많거나, 다른곳에서 데이터를 줄 경우를 대비해서 인공지능이 필요하다.
알고리즘테스트에서는 컬레션이 기본, 성공의 여부는 작업에 걸리는 시간까지 측정한다. 
*/