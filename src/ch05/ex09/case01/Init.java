package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	static {
		Init.s = 1;
		//this.i = 1;
		System.out.println("static{}");
	}
	
	{
		Init.s = 1;
		this.i = 1;
		System.out.println("{}");
	}
	
	public Init() {
		Init.s = 1;
		this.i = 1;
		System.out.println("Init()");
	}
	
	public Init(int i) {		
		Init.s = i;		//파라미터로 받은 값으로 다 초기화 해준다 .
		this.i = i;
		System.out.println("Init(int)");
	}
	
}

/*
4> static 변수 s를 둡니다. 
7> static블럭안의 메소드는 바이트코드가 로딩될때 생성된다. 
8> static블럭안에서 스태틱변수 초기화해줍니다. 
9> this.i = 1; ->스태틱메소드 실행시 i변수는 없기떄문에 이렇게쓰면 오류입니다. this안에는 init타입의 객체가 들어오는 것이라 new가 실행되지않아서 인스턴수변수사용불가 = 문법상오류
13> 블럭앞에 아무것도 안써놓으면 '인스턴스초기화블럭' 이것은 인스턴스가 생성되면 실행된다. 
14> 인스턴스가 생성됐으니 15처럼 this안에 객체가 들어갈 수 있음. 
19 > 클래스 이름과 같은 "생성자" 다. 
25> 파라미터가 있는 생성자
*/