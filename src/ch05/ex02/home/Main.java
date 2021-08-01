package ch05.ex02.home;

public class Main {
	public static void main(String[] args) {
		Memo message = new Memo();
	
		System.out.println("메세지: " + message.getMessage());
		System.out.println("발신자명: " + message.getFrom());
		
		String result = message.getMessage( ) + "from" + " "+ message.getFrom();
		System.out.println(result);
		
	}

}

/*전화 받은 메세지를 메모한다.  메모: 메시지, 발신자명 2개임 
발신자명을 메모한다. 
메모를 읽는다. (화면에 출력한다) 
--

메세지: hello 원하는대로쓰기
발신자명: terry

hello from terry. 
*/


