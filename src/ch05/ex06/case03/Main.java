package ch05.ex06.case03;

public class Main {
	public static void main(String[] args) {
		Console.info("start main method.");		//star main mehtod. 출력됨  "알림메시지구나" 
		
		Console.error("value must be less tnan 1."); //ERROR]value must be less tnat 1. 에러구나? 하고 바로바로 알 수 있음. 

		Console.inMsg("input number.");				//input number. > 이 자동으로 뜸 . 숫자를 입력받을 수 있음.
		int num = Console.inNum();					//입력받은 숫자를 num에 저장한다.
		
		Console.inMsg("input string");				//문자를 입력받을 수 있음. 
		String str = Console.inStr();
	}
}
