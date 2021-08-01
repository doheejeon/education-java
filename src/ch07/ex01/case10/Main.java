package ch07.ex01.case10;

import ch05.ex06.case03.Console;
import ch07.ex01.case10.dao.UserDao;
import ch07.ex01.case10.dao.UserDaoImpl;
import ch07.ex01.case10.presentation.UserIo;
import ch07.ex01.case10.service.UserService;
import ch07.ex01.case10.service.UserServiceImpl;
//main은 루트 바로 아래만든다.
public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao); 	//위에서 미리 만들어둔 9번에서. 가져온것을 가져온다(userdao)
		UserIo userIo = new UserIo(userService);
		
		Console.info("앱을 시작합니다.");
		userIo.play();
		Console.info("앱을 종료합니다.");
	}
}

/*
만들어놓은 부품덩어리(userdao,userservice등등 객체)를 완제품으로 만들어줄 main이 필요하다

*/