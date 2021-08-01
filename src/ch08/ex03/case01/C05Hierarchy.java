package ch08.ex03.case01;//상속관계에 주의하여 연습하자.

public class C05Hierarchy {
	public void first() {
		try {
			int i = 3 / 0; //해당 수식은 실패하는 수식임. 
		} catch(ArithmeticException e) {		//exception은 자식에서 부모순으로 나열한다. 
			System.err.println("ArithmeticException");
		} catch(RuntimeException e) {
			System.err.println("RuntimeException");
		} catch(Exception e) {
			System.err.println("Exception");
		}
	}
	
	public static void main(String[] args) {
		C05Hierarchy hierarchy = new C05Hierarchy();
		hierarchy.first();
	}
}


/*
java.lang.ArithmeticException: / by zero ->3나누기 0 하면 오류나고 그걸 해결하는 타입의 객체는 arith~
실행결과는 첫번째 캐치 블럭에서 처리가 됨. -> ArithmeticException

*/