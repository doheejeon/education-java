package ch05.ex05.home_t.case03;

import java.util.Scanner;
//주사위와 독립적으로 작동돼야한다. "확장성' 생각해야한다.비슷한 모든 곳에 갖다쓸수있음.
public class Console {
	public static String inYn(String msg) {		//질문을 물어본다 라고 가정
		Scanner sc = new Scanner(System.in);
		
		boolean isGood = false;			//플래그변수, 토글 
		String answer = "";
		
		do {
			System.out.print(msg + "(y/n)? ");
			String line = sc.nextLine();
			
			if(line.length() == 1) answer = line.toLowerCase();  
			isGood = answer.equals("y") || answer.equals("n");
			
			if(!isGood) System.out.println("ERROR] y나 n을 입력하세요.");
		}while(!isGood);		//반복의 조건을 쓰는것.(업무상의 참이아님) 참인 데이터가아니면 반복한다.
		
		return answer;
	}

}
/*
14> line 에는 정제되지 않는 답변을 우선 버퍼로 담아두고 
16> answer로 정제해준다. 
17,18> 입력데이터가 참,거짓을 거르는 곳임. 게임의 논리를 설정하는 곳이 아님.
*/