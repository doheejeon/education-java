package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		//byte c = a + b;//타입 미스매치에러 : IO단위가 int여서 에러가 남. 타입불일치 뒤에가 int 값인데 앞은byte라 타입불일치.
		byte c = (byte) (a + b); //바이트값을 다시 올려주면됨! 
		System.out.println(c); //이때 출력되는 5는 int아닌 byte의5임
		
		// c = c + 1; //c + 1 는 리턴값이 int고 c는 바이트라 타입불일치로 컴파일에러
		c++; // 11번줄과 같은 의미지만, 컴파일에러가 발생하지않는다. VM내에서 계산하는 방식이 다르다. 1씩증가할땐 12번줄커맨드를 쓰자.  6출력
		System.out.println(c);
		
		double d = a / b; //a나누기b를 d에 담음<선언>
		System.out.println(d); //1.0출력 1.5가나와야하는데 버그발생 해결책은 아래에~
		
		//good! 
		d = (double)a / b; //내가 쓴 코드 (double)(a/b);로 써서 안나옴<사용>
		System.out.println(d); //1.5출력
		d = 1.0 * a /b; // 이렇게 간단하게 쓸 수도 있음. 하나라도 더블로 만들어야하니까, 1.0곱하기a를 해줘서 하나를 더블로만들어줌.
		System.out.println(d);
		
		// bad!
		d = (double)(a / b); //a/b의 가로가 먼저 실행돼서 값이 1.0으로 나올수밖에없음. 
		System.out.println(d); //1.0출력. 
		d = a / b * 1.0;  //a/b를 먼저 산술하니까, 뒤에 1.0를 곱해도 똑같음 ㅋ..
		System.out.println(d); //1.0출력
		
}
}
/*printf로 출력할땐, 출력은 내가 원하는대로 되지만 데이터자체는 피지컬하게 다르다. f로 .2 이런식으로 소숫점 출력해도 실제 데이터값은 더 많은 값. */