package ch02.ex02;

public class C01Char {
	public static void main(String[] args) {
		char c = 'A'; //캐릭터 리터럴은 ''로 표기한다.
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c)); //2진수로 번역돼서 1000001로 나옴. 
		
		c = 65; //A의 값.
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c)); //코드의 리턴값을 받아서 투바이너리스트링을 씀
																	//유니코드의 값은 16진수로 써져있습니다.
		c = 0x0041; //'A'의  16진수인 0041로만 쓰면 !가 출력되니까 hexadecimal 16진수 0x로 시작해서 16진수로 인식하게 만들어줘야함.
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = '\u0041'; // 역슬래쉬+u 유니코드 값을쓰겠다.
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		

	}

}
