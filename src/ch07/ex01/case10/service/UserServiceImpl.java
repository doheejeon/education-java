package ch07.ex01.case10.service;

import ch07.ex01.case10.dao.UserDao;
import ch07.ex01.case10.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {		//확장성위해 파라미터를 인터페이스로둔다. 
		this.userDao = userDao;
	}
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
}


/*
업무진행을위해 데이터가있어ㅑ하는데 이 데이터는 DAO가 하니 
dao는 서비스의 dependency이다. 
프레젠테이션의 디펜던시는 service이고
프레젠테이션은 누구의 디펜던시도 아니다. 
8> 생성자로 받아야한다. 
*/