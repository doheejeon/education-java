package ch08.ex04;

import java.util.logging.Level;
import java.util.logging.Logger;

public class C02MyLogger {
	private Logger logger; //마이로거입장에서는 로거가 디펜던시임. 
	
	public C02MyLogger() {
		logger = Logger.getLogger("ch08.ex04"); //getLogger는 패키지 정보를 가로안에 넣어준다. 가로안 패키지에만 포커스를 두는사용법.
	}
	
	public void log() {
		logger.info("로깅 시작합니다.");
		
		try {
			throw new Exception("고의적인 exception"); //내가 직접 exception을 발생시켜 줄 수도 있다. 
		}catch(Exception e) {
			logger.log(Level.SEVERE, e.getMessage()); //익셉션안의 겟메세지 메소드는 위에 메시지를 불러오는 역할 한다. 
		}
		
		logger.log(Level.INFO, "로깅 완료합니다."); //log(메세지수준, 메세지)  하면 어떤 종류의 로깅이든 가능.
	}
	
	public static void main(String[] args) {
		new C02MyLogger().log();
	}
}