package ch03.ex07;

public class C01Compare {
	public static void main(String[] args) {
		boolean b = 'A' < 'B';//논리 부정연은, boolean로 표현 
		b = '0' == 0; //문자 0은 48, 숫자0은 0 false
		b = 'A' != 65; //문자A와 65는 다르다 false
		
		b = 10.0 == 10.0f;
		b = 0.1 == 0.1f; //false
		b = (float)0.1 == 0.1f; //실수는 소수점이하자리를 정해놓은 뒤 처리한다. true가 출력되지만 어떤때는false가 출력되기도한다. 오버플로우현상 실수자체는 불안하다
		System.out.println(b); //true출력  
	}

}
