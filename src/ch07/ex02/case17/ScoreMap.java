package ch07.ex02.case17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ScoreMap {
	public static void main(String[] args) {
		Map<String, List<Integer>> map = new HashMap<>();
		
		String[] userNames = {"최한석", "한아름", "양승일"}; //key 생성 
		List<Integer> score = null;		//클래스타입의 지역변수 초기값은 null 둔다.
		int idx = 0;			
		
		for(int i = 9; i >= 7; i--) {		//점수생성 90~70점대 (10의 자리를 만든다) / value생성 
			score = new ArrayList<Integer>();	//score하나가 한 학생의 점수가 된다. 최초로 한석이의 점수가 생성->아름->승일
			for(int j = 0; j < 3; j++) score.add(i * 10 + j); //만들어진 점수를 map에 넣어준다. 
			map.put(userNames[idx++], score);
		}
		System.out.println(map);
		
		Set<String> keys = map.keySet();		//key는 유일하고 중복값이 없으니 이럴때 set을 쓴다.
		System.out.println(keys);				//[최한석, 한아름, 양승일]
		
		for(String key: keys)
			System.out.println(key +  ": " + map.get(key));			//get이 value리턴 
	}
}

/*
 * Map<String, List<Integer>> 
 *		 학생이름, 학생들의 점수(국영수를 리스트로관리)
 * 19>userNames[idx++] 최초에 0 유저데이터가 실행 ++을 앞에 두면 유저네임스1을 최초로읽는다. 
 * 
 *21> {최한석=[90, 91, 92], 한아름=[80, 81, 82], 양승일=[70, 71, 72]}
 *23> map에는 key만 따로 모아두는 메서드가 있다. 그 메서드의 리턴타입은 set이다. 
 *
 *28>	최한석: [90, 91, 92]
		한아름: [80, 81, 82]
		양승일: [70, 71, 72]


 * */
