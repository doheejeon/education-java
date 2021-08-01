package ch02.ex02;
//문자열 편집 연습기 민번에서 생년월일만떼어내는기능, 주소에서 특정문구만 뗴어내는 기능도 구현가능 
public class C04Str {
	public static void main(String []args) {
		String src = "우리 개는 "; //src(변수), ""안에는 (상수) 두 개 모두 데이터타입은 String 
		String s1 = "";
		String s2 = "";
		String s3 = "";
		char c = 0; 
		
		int len = src.length(); //length 문자의 갯수를 리턴한다. 
		System.out.println("length: " + len); // length: 6 으로 출력됨
		
		s1 = src.concat("짖는다."); //붙이기 연산자와 기능이 동일한 concat. concat(붙이다)
		s2 = src.replace("개", "고양이" ); //src의 개를 고양이로 바꾸겠다 .replace
		s3 = src.substring(0, 4); // substring은 일부의 글자를 떼어낸다. 커서가 깜빡거리는 부분부터 카운터를 시작해서0번째, 4번째가 제외됨
		c = src.charAt(3); //src의 '개'만 따오고 싶을때 특정글자를 따오는 메소드인 charAt(Index)를 쓰면됨. *Index개념 보충공부
		System.out.printf("%s\n%s\n%s\n%s\n", s1, s2, s3, c); //우리 개는 짖는다. 로 출력됨 , 우리 고양이는 으로 바뀜
		//이러한 커맨드는 메모리를 엄청 잡아먹음. 한방에 많은 공간을쓰니까, 그래서 만들어진 메소드가 있음! C05SB 예제로
		
		
		
		
		
		
		
		
	}

}
