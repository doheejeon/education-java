package ch04.ex02;

public class C01Switch {
	public static void main(String[] args) {
		int grade = 3;
		String coupon = "";
		
		switch(grade) {//숫자가 클 수록 좋은 쿠폰이라고 가정할때, 등급이 높을수록 더 많은 쿠폰을 준다.
		case 3: coupon = "10,000원 ";
		case 2: coupon = "5,000원 ";
		case 1: coupon = "1,000원 ";
		}
		
		System.out.println(coupon);
	}

}
////이렇게 하면 결과값이 천원만 나옴 스택에 덧씌워져서