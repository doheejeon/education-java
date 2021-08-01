package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby();				//"new를 통해 베이비타입(맨앞의Baby)의 베이비 객체를 생성합니다." new+생성자(호출문);/ 객체생성직후에는 베이비메소드가 실행된다. 
		//System.out.println(baby.getName()); //'null' ->아기랑 처음 대면한 상태
		baby.setName("초롱이");
		baby = new Baby("튼튼이");			//아기를 만나기전에 이미 튼튼이라는이름을 알고있었고 아기를 보자마자 얘가 튼튼이구나 하고부르기시작한것.태어나기전부터 튼튼이였음
		
		
	}
}

/*
참조형변수의 기본값은 null이다. 

*/