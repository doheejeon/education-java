package ch04.ex01;

public class C01If {
	public static void main(String[] args) {
		int visitCnt = 0; //visit count
	
		/*
		if(visitCnt < 1) { //방문횟수가 1보다 작으면 블럭안의 명령문 실행 ,명령문두줄이상이면 {}를 써주기
			System.out.println("첫방문입니다.");
			visitCnt++; //방문횟수 추가(지금들어왔으니까)
		}
		
		System.out.println(visitCnt);
		*/
		if(visitCnt < 1) System.out.println("첫방문입니다."); //한 줄이면 이렇게 간단하게 쓸 수도 있음.
		
	}
}
