package ch08.ex03.case02; //exception을 상속받는다. 나만의 exception만들기

public class LengthException extends Exception {
	public LengthException(String msg) {
		super(msg); 	//상속받은 exception에서 에러메시지 출력을 가져온다. super로 . 
	}
}
/*
개념객체: 지식, 사랑, 돈, 앱, 약속 , 앱 = 개념객체는 즉 정보체 

*/