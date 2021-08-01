package ch07.ex01.case10.service;

import ch07.ex01.case10.domain.User;

public interface UserService {
	public User getUser();
}
/*
프레젠테이션의 디펜던시
서비스쪽은 업무적인 용어를 쓴다. dao에서 select가 여기선 '조회'니까 getUser.
*/