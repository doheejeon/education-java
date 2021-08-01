package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		byte b = 126;
		System.out.println(b);
		b++; // 더하기 1를 간단하게 표현함. 127을 나오게함. read,write를 같이함. [쁠쁠]이라고 말함.
		System.out.println(b);
		b++;
		System.out.println(b);// -128이 출력되는 버그발생 원인은 오버플로우 , 최대값을 넘어버려서.
		b++;
		System.out.println(b);// -127이 출력됨 -128에서 다시 1을 더하니까.
	}

}
