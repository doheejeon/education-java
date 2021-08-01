package ch02.ex01;

public class C01Variable {
	public static void main(String[] args) {
		boolean bl = false;  //변수를 초기화한다. 초기값. 각 데이터 타입별로 기본값을 초기값으로 정해줌. 업무상기본값있을땐 제외. 
		byte b = 0; 
		short s = 0;
		char c = 0; //2byte인 이유, 유니코드값을 저장해서이고, 유니코드값이 2byte이기 때문이다. 
		int i = 0; 
		long l = 0L;
		float f = 0.0f;
		double d = 0.0;
		//이 위는 다 기본 타입 문법
		
		String str = ""; //String은 문법이아니라, 하나의 클래스이다.
		/*String을 클래스로 만든 이유, 기본타입에선 문자를 다루는 문법이 없다. 
		 * 스트링 타입의 상수는 ""로 표현한다. 대부분 상수의 데이터값은 리터럴값에 따라 결정된다. 
		 * Char타입은 ''로 표현한다. 
		 */
		
		int a;
		a = 0;
		//int a = 0; 이상적인 변수의 선언 형태. 
		
		//int x;
		//int y;
		int x, y;
		int x2 = 0, y2 = 0;
	}
}
