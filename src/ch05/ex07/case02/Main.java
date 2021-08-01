package ch05.ex07.case02;
//스태틱안에서 지역변수르 ㄹ생성하는 ,스택에 지역변수가 모두 동일한 이름 a로 붙여놔도, 모두 실행이된다. = 메소드별로 따로따로 관리돼서.
public class Main {
	public static void main(String[] args) {
		System.out.println("main 시작.");
		
		int a = 0;
		Stack.first();
		
		System.out.println("main 끝.");
	}

}
