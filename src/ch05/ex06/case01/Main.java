package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java.");		//static메소드는 클래스. 하고 불러내는 것이 가능하다
		//Man.tell("");					인스턴스메소드 이건 불가. 
		
		Man man = new Man(); 			//객체를만들고나면 스태틱이든, 객체를 통해서든 메소드를 다 호출 할 수 있다.
		man.say("I love java.");		//유지보수를 위해 스테틱메소드 앞에는 스테틱을 붙여주자.
		man.tell("I love java.");
	}

}
