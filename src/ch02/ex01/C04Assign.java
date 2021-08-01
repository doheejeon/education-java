package ch02.ex01;

public class C04Assign {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		a = b; //이미 존재하는 a변수르 ㄹ사용
		System.out.printf("%d, %d\n", a, b );
		
		a = b + 1;
		System.out.printf("%d, %d\n", a, b ); //할당연산자는 값을 바꾸는게 아닌, 복사만 하는 것.
		
		double d = Math.random(); //random은 더블값을 리턴값으로 가져서 앞에 더블을 선언해줌.
		System.out.printf("%.2f", d);
		
		
		
	}

}
