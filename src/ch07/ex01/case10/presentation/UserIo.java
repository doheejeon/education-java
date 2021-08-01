package ch07.ex01.case10.presentation;

import ch07.ex01.case10.service.UserService;
//출력을위해서는 프레젠테이션이 user에 종속되어있기때문에 그와 관련된 클래스를 이렇게 따로 만들어준다.
public class UserIo {
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {	
		Console.info(userService.getUser());
	}

}
/*
해당클래스의 디펜던시는 userservice이다.= 유저서비스에 의존한다. 
8> 생성자가 있어야 사용가능하니 생성자를 만들어준다. 
13> 각 계층에 속하는 객체들은 인접계층의 객체들과 대화가 가능하다. (유지보수 편리함을 위해) 
	즉 유저IO는 유저데이터가 필요하다. 규칙상 서비스에만 의존한다.	

*/