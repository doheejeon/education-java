package ch05.ex06.case03;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	public static String inStr() {				//inStr= inputString  "문자열을 입력받는다"
		return sc.nextLine().trim();			//"입력받은 값을 리턴하고 스페이스문자열을 삭제합니다."
	}
	
	public static int inNum() {
		int num = sc.nextInt(); sc.nextLine();	//엔터값 지워주기위해 넥스트라인한번더 
		return num;
	}
	
	public static void inMsg(String msg) {			//msg안내 메시지를 파라미터로 받는다.
		System.out.print(msg + "\n> " );
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void error(String msg) {
		System.out.println("ERROR] " + msg);
	}
}

/*
8>스태틱변수 초기화는 스태틱 초기화 블럭에서 따로한다. 8번줄~
	그동안 9번같은 명령문은 메소드블럭안에 써왔지만 8번블럭은 메소드블럭이 아니라 그냥 스태틱블럭임.  이것은 바이트 코드가 로딩이될때 실행된다.
	스태틱 멤버변수는 바이트코드가 로딩될때 실행. 
	메소드블럭안에있는 명령문은 메소드가 호출될때 실행된다. 

6번을 통해 sc객체가 생성됐다.  -> 입출력을 나타내는 메소드는 스태틱메소드가 적절하다. 
사용자가 입력한 값에서 머리부분, 꼬리부분의 스페이스문자를 다 없애는 기능을한다. trim();
	입력단계에서 참,거짓 데이터가 걸러질 수 있도록 한다. 


*/