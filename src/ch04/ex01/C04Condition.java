package ch04.ex01;
//두 가지 조건 다 만족했을때 실행하게 하는 법, 논리연산자를 쓴다.&&||
public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4) System.out.println("0 < a < 4");//4미만의 양의정수
		
		char c = 'b';
		if('a' < c  && c < 'c') System.out.println("'a < b < c'"); //&&연산자로 값의 범위를 나타낼 수 있음. 
		
		int x = 0;
		int y = 0;
		if ((x = 1 + 2) > 0 || (y = 1 -2) > 0); // 왼쪽편에서 이미 트루값이 나와서 오른쪽 식은 계산하지 않는다.
			System.out.printf("x: %d, y: %d\n", x, y); //x: 3, y: 0
	//문자열이 같은지 비교할땐 equals를 써주자 
		String s = "hE";
		// he는 he와 같다. 알고리즘을 아래와 같이 쓴다.  과제: 고객이 He라고 말해도 he가 출력되도록하자. refactoring
		if(s.equals("he")|| s.equals("He")|| s.equals("HE")|| s.equals("hE")) //여기에 ; 찍으면 16,18,19가 다 따로된명령문이다. 18-19이어주기위해 18은 ;찍지말자
			System.out.println("he"); //he ,문자의 갯수가 많아지면 해당 알고리즘은 쓰기어렵다. 
	//잘못된 경우 경험하자.
		s = ""; // string의 ""은 empty string 빈 문자열이라고 부른다. 빈 문자열안덴 \0이 생략되어있는 것임. 단어의 끊는 지점에서 \0이 스트링이 자동으로 붙여서 작동
		if(s == null || s.equals("")) System.out.println("값이 없다.");//s에 아무것도 입력되지않았다.를 표현, 데이터값이 클래스면 기본값은 null이다.,' null이아니고 문자열값이 빈칸아니면~'
	//값이 있으면 있다. 없으면 없다라고 뜨게하려면?	
		s = "hello"; 
		if(s != null && !s.equals("")) System.out.println("값이 있다."); 
		
		boolean power = false;
		if(!power) System.out.println("전원을 켜다."); //toggle 두가지 상태를 왔다갔다하는 것. true로 만들어야 전원을 켜다가 출력되니까 '!'를 추가해줌
		System.out.println(power); //false 출력 
		
				
	}
	
	}


