package ch02.ex01;

import java.util.Scanner; //2.스캐너 클래스를 여기에 포함시킬거야! 를 알려주는 커맨드, 모를때 자동으로 불러오는 단축키ctrl+shift+O 

public interface C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //1. 에러이유: 스캐너 클래스가 어디있는지 이클립스가 자동으로 모르기때문에 내가 알려줘야함 lang은 자동으로 가져옴.sc안에는 입력장치가 있구나..
		/*
		System.out.print("문자열을 입력하세요: ");
		String s = sc.nextLine(); //sc라는 입력장치를 통해 nextLine( )의 값을 받겠다.문장을 입력하기위한 기능)
		System.out.println(s + "를 입력했습니다.");
		*/
		/*
		System.out.print("숫자를 입력하세요.\n> "); //>는 보기 깔끔한 알고리즘을 위해, 숫자입력하는창을 알려주기위해. 줄바꿈,prompt로 띄워주고 
		int a = sc.nextInt(); // 숫자를 입력하기 위한 기능  
		System.out.println(a + "를 입력했습니다");
		
		
		sc.nextLine(); //위의 \n을 없애야 밑에서 정상적으로 출력이 됨 이게 정답임.
		
		System.out.print("문자열을 입력하세요.\n> ");
		String s = sc.nextLine(); 
		System.out.println(s + "를 입력했습니다.");
		*/
		
		System.out.print("문자를 입력하세요.\n> ");
		char c = sc.nextLine().charAt(0); // c중에서 특정 글자를 입력하고싶을때 , 0번째문자만 출력하겠다. 하고 0을 넣음. 메소드참고
		System.out.println(c+ "를 입력했습니다.");
	
	}

}
