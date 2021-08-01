package ch02.ex02;
//다양한 리터럴의 표현
public class C02Int {
		public static void main(String[] args) {
			int x = 10; //10진수 decimal
			System.out.println(Integer.toBinaryString(x)); //2진수로 표현시 1010이나오니까 출력1010나와야함
				
			x = 012; //위의 10을 8진수로 표현 'Octal' 0으로 시작해서 8진수로 인식함 
			System.out.println(Integer.toBinaryString(x));  //5번줄에서 x변수가 태어났고(선언) 8번에서 x를 사용함.
			
			x = 0xA; //hexadecimal 16진수 0x로 시작해서 16진수로 인식함
			System.out.println(Integer.toBinaryString(x));
			
			x = 0b1010; //0b로 쓰면 2진수로 인식함 binary
			System.out.println(Integer.toBinaryString(x));
			
			x = 1_234_567; //1000단위에 _를 적어줘서 가독성을 높여준다.8버전에서부터 생긴 것. 
			System.out.println(x);
			
			double y = 1e1; // 1 x 10의 1승 = 10
			System.out.println(y);
			
			
			
			
		}

}
