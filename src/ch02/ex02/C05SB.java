package ch02.ex02;
//String과 비교 StringBuffer는 임시적으로 데이터를 담고 있는 것. 
public class C05SB {
	public static void main(String []args) {
		StringBuffer src = new StringBuffer("우리 개는 "); //C04Str의 간단하고 메모리를 절약하는 버전.
		
		int len = src.length();
		System.out.println("length: " + len); //length라는 메소드는 String과 StringBuffer에서도 동일함.
		
		src.append("짓는다."); //스트링의 컨캣과 같은 기능이지만 어펜드하면 따로 저장하진 않는다.공간을 쓰지 않음.[우리개는 짓는다]
		src.replace(3, 4, "고양이");//스트링과 메소드 이름은 같지만, start, end index를 넣어줘야함. 우리개의 3과4사의는 '개'를드래그가되는느낌?대체됨.[우리 고양이는 짓는다]
		
		System.out.printf("%s", src);
		
		String str = src.toString(); //String은 보존용도니까, 버퍼를 스트링으로 변환하는 방법임 
		
		
		
	}

}
