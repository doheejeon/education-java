package ch07.ex01.case10.dao;

import ch07.ex01.case10.domain.User;

public interface UserDao {
	public User selectUser();		//유저데이터를 읽을땐 "select"시작한다.
}
