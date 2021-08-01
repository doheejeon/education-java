package ch02.ex02;//int를 String타입으로 변환하는 기법 ,

public class C03Str {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
			
		//String numStr = sum;  이건 에러 
		//String numStr = "sum"; 이렇게 하면 콘솔에 6이 아니라 sum이  출력됨. 
		
		String numStr = "" + sum; //붙이기, 피연산자. C02Output클래스 참조. 
		System.out.println(numStr); //6
		
		String concat = "" + a + b;
		System.out.println(concat); //String이 하나라도 있으면 변환돼서 붙이기 연산자로 더하기연산이 아닌, 1과2가 합쳐진 '12'가 출력됨. 문자값+숫자가됨.
		
		concat = a + b + "" + c; //concat은 붙이기 연산자. 
		System.out.println(concat); //왼쪽부터 시작됨, a+b더해서연산  3으로 리턴, 그 다음 ""과 붙이기연산, 그 뒤에도 C는 붙이기 = '33'이 출력됨. 두번쨰 +연산자가 문자를 만들어냄
		//삼삼 으로 읽어야함. 마치 전화번호처럼
		
		String dialog = "John said," + " \"Hello.\"";  //특수문자를 일반문자 \역슬래쉬를 붙임, 반대는 \*
		System.out.println(dialog);
		
		
	}

}
