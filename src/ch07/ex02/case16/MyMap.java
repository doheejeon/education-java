package ch07.ex02.case16;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>();	//map클래스에 정의된 map 메소드만을 쓰겠다라는 의미
		
		map.put(1, new User("최한석"));			//map은 put으로 데이터넣는다.
		map.put(2, new User("한아름"));	
		map.put(3, new User("양승일"));	
		System.out.println(map);			//{1=최한석, 2=한아름, 3=양승일}
		
		User user = map.get(1);				//데이터를 가져오는것은 동일하게 get으로한다.
		System.out.println(user);  			//최한석
		System.out.println(map); 			//get으로 조회해도, map안에 데이터는 남아있다.
		
		user = map.remove(1);
		System.out.println(user);
		System.out.println(map);  			//{2=한아름, 3=양승일}
	}
}

/*
8> haspMap이 오든 뭐가오든, 나는 Map에 정의된 메소드를 쓰겠다. 
	즉 여기서 왼편이 핸드폰  = 삼성or애플폰 으로 보면된다. 	
	
19> map도 remove라는 메서드를 갖고있다. 
	get은 읽은 데이터가 남아있고 remove는 읽은 데이터가 사라진다.
	
key보다 value를 관리하겟다 = list 사용 
Key 까지 관리하겠다 = map 을 사용 (key를 지정할때)

*/