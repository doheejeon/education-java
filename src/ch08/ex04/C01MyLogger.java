package ch08.ex04;

import java.util.logging.Logger;

public class C01MyLogger {
	public static void main(String[] args) {
		Logger.getGlobal().info("hello");//로그인 기록을 갖고있는 객체가얻어지는 메소드. 
	}
}
/*
7> 실행결과 --------
6월 10, 2021 11:38:47 오전 ch08.ex04.C01MyLogger main
정보: hello
----------------------------------
-> info메서드를 통해 정보수준으로 나타남. 
로거객체 이용시 로그 기록이 쉬워진다.  
	but, 보관이 안된다. ->보관하려면 파일에 기록해야함. 

*/