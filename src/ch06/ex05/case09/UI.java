package ch06.ex05.case09;

public interface UI {
	static void in() {		
		System.out.println("키보드로 입력하다.");
	}
	
	void out();			//출력이 어떻게 될지 모르는것을 전제
}
/*
UI의  출력이 브라우저일지 스피커일지 어떤거인지 정해지지않았다는 것을 전제로한다.
4> UI가 뭔지 모르지만 입력은 키보드로 받는다는거을 전제 

*/