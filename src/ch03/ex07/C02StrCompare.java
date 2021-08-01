package ch03.ex07;
//문자 비교 문자와 문자를 비교하는 경우 : 비밀번호입력 
public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a"; //문자열을 만드는 방법
		b = s == "a"; //변수, 상수가 둘 다 문자열, = true
		
		s = new String("a"); 
		System.out.println(s);
		b = s == "a"; //false 이유는 5장에서 공개됩니다.  
		//문자열을 비교하기위해서는 equals를 씁니다. 5장에서 공개.
		System.out.println(b);
	}

}
