package ch07.ex02.case12;

import java.util.ArrayList;
import java.util.List;

public class ScoreList {
	public static void main(String[] args) {
		List<Integer> score1 = new ArrayList<>();		//arraylist는 부모로 list를 두고있어서 확장성을 위해 여기선 list를 썼다.
		List<Integer> score2 = new ArrayList<>(); 
		List<List<Integer>> scores = new ArrayList<>(); //위의 score1,2의 데이터타입이list여서 여기서 generic type으로 씀.
		
		for(int i = 0; i < 3; i++) score1.add(80 + i);	//80점대의 점수를 만들어준다고 가정.	
		for(int i = 0; i < 3; i++) score2.add(90 + i);
		System.out.println(score1);
		System.out.println(score2);
			
		scores.add(score1);							//scores에 score1,2를 넣어줌.
		scores.add(score2);
		System.out.println(scores);					//list로  표를 만드는 방법. 배열보다 간단하다.
	}
}