package ch05.ex02.case02;

public class MyNumber {
	private int a;
	private int b;
	
	public int add() {			//선언만했지 사용은 아직 안한 메소드
		return  a + b;
	}

	public int minus() {
		return  a - b;
	}
	
	public void setA(int a) {			//데이터를 쓸 setter만 준비
		this.a = a;
	
	}
	
	public void setB(int b) {
		this.b = b;
	}
}

