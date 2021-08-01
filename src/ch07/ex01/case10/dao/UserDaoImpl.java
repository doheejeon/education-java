package ch07.ex01.case10.dao;

import ch07.ex01.case10.domain.User;

public class UserDaoImpl implements UserDao {	//기능을 수행하는 곳
	@Override
	public User selectUser() {
		return new User("최한석");			//여기서 selectUser가 리턴하는 것은 최한석이 아니라 User객체이다. 
	}
}
/*
자식클래스이름 명명규칙 : 부모이름옆에 Impl를 붙여서 유지보수를 위해 알려준다. 
service입장에서 dao가 dependency이다. 데이터읽기쓰기를 dao가 갖고있어서 .. 
확장성하면 부품덩어리를 생각하면 좋다 .	
*/