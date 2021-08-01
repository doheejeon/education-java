package ch08.ex02.case02;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("최한석", Level.BASIC); //enum을 써서 바로 베이직이라는게 보인다.
		User user2 = new User("한아름", Level.valueOf(2)); //silver를 valueOf(2)로도 호출해본다.
		User user3 = new User("양승일", Level.GOLD);
		
		List<User> users = Arrays.asList(user1, user2, user3); //araays.asList 메서드를 써본다. 
		
		for(User user: users) {
			try {								//시도하다가~
				user.upgradeLevel();
			} catch(IllegalStateException e) {		//stateEx~이 타입의 에러가 발생하면? 
				e.printStackTrace();				//에러에 저장해둔 에러메시지를 내보내겠다. 
			}
		}
		
		for(User user: users)
			System.out.println(user);
	}
}
