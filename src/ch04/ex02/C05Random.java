package ch04.ex02;

public class C05Random {
	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1; //0.0이상 1.0미만의 값이 리턴됨. 인트로 캐스팅돼서 소수점은 떨어진다.2.10을곱하면0이상10미만값 ,+1하면 1-10사이값얻기가능
		System.out.println(a);
	}

}
