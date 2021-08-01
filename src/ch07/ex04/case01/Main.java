package ch07.ex04.case01;

public class Main {
	public static void main(String[] args) {
		Bowl<Integer> bowl1 = new Bowl<>();		//bowl은 숫자를 담는 그릇으로 만들어줬다.
		Bowl<String> bowl2 = new Bowl<>();		//문자를 담는 그릇도 준비했다.
		
		bowl1.setVal(1);			//이 1은 Integer로 오토박싱됨.
		bowl2.setVal("hello");
		
		int i = bowl1.getVal();			//bowl1의 getval의 리턴값을 담을 변수 i를 설정
		String s = bowl2.getVal();	
	}
}
