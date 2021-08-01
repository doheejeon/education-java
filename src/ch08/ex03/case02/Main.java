package ch08.ex03.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "Hello"; 
		
		try {
			if(userId.length() > 3) //유저아이디의 랭쓰가 3을 초과하면 틀리다(기준에 부합하지않는다)
				throw new LengthException("길이 초과입니다.");
		} catch (LengthException e) {
			e.printStackTrace();
		}
		
		throw new MemberException("회원이 아닙니다."); //runtimeexception이라서 try블럭으로 묶어도되고, 안묶어도된다. 
	}
}


/*
thorws 는 선언부에 throw는 메서드 바디안에. 
1.은 떠넘기는역할
2는 일을한다. throw + exception객체 ->throw new Length
	-> throw옆에 내가 안써주면 VM이 자동으로 함. 

catch블럭에서 하는 일은 log남기는 일이다. 

실행결과 -------
ch08.ex03.case02.LengthException: 길이 초과입니다.
	at ch08.ex03.case02.Main.main(Main.java:9)
------------------------> printStackTrace가 실행된 결과임. 

나만의 exception 만들 기회가 생기면 RuntimeException을 상속받자. 
*/