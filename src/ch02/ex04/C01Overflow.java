package ch02.ex04;

public class C01Overflow {
	public static void main(String[] args) {
		byte b = 10; // 바이트 비를 선언하고 초기값 10줌
		int i = b; // byte를 int로 프로모션함
		// i=(int)b; 내가 수동으로 int를 byte로 캐스팅할 수도 있음.
		System.out.println(i); // 10출력 작은수에서 큰수로 가니까 오버플로우 없음

		int i2 = 300;
		byte b2 = (byte) i2; // 오버플로우 발생
		System.out.println(b2);// 넘쳐흘려서 남아있는 비트만을 출력 44

	}

}
