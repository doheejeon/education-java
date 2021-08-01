package ch05.ex08.case03;

public class Main {
	public static void main(String[] args) {
		Citrus citrus = new Citrus();
		//citrus.setName("천혜향");
		System.out.println(citrus.getName());		
		
		citrus = new Citrus("레드향"); //마트에가서 레드향사야지!하고 이미알고감.
		
		Citrus citrus1 = new Citrus();	//기본 생성자도 가능
		Citrus citrus2 = new Citrus("천혜향"); //파라미터가있는생성자호출가능
		Citrus citrus3 = new Citrus("레드향");
		
		System.out.printf("%s, %s, %s", citrus1.getName(), citrus2.getName(), citrus3.getName());
				
	}
}
/*
7> 1. null 나오는 이유, 여기서의 뉴시트러스는 메인의 뉴시트러스여서 .. 
   2. citrus에서 this생성자호출문을 참고.
11,12> this 생성자호출문을 통해 다양한 생성자를 만들 수 있다.

*/