package ch08.ex04;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class C03FileLogger {
	private Logger logger; //로거의 기본 핸들러가 콘솔.  
	
	public C03FileLogger() { 	//생성자에서 인젝션을 함.
		logger = Logger.getLogger(this.getClass().getName()); //클래스 이름이 바뀌어도 자동으로 패키지 정보 전달.확장성확보, 유지보수용이 
	}
	
	public void log() throws Exception {
		Handler handler = new FileHandler("c:/DEV/log.xml"); //핸들러는 출력장치이다. 
		logger.addHandler(handler);
		
		logger.info("로깅 시작합니다."); //18-20 메세지들은 메모리상에 있다. 
		logger.severe("에러가 발생합니다.");
		logger.info("로깅 마칩니다.");
		
		handler.flush(); //메모리(객체)에 있는 메세지를 파일로 쏟아내는 메서드 flush -> 하면 log.xml로 감.
		handler.close(); //hanlder도 close메서드를 갖고있음. 
	}
	
	public static void main(String[] args) throws Exception{
		new C03FileLogger().log(); //log라는 메서드를 호출. 
	}
}
/*
Thread는 앱을 2개이상 병행처리하고싶을때 쓴다.

*/