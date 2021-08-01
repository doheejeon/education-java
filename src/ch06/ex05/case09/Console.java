package ch06.ex05.case09;

public class Console implements UI {			//콘솔은 UI이다
	@Override
	public void out() {
		System.out.println("println() 으로 출력하다.");
	}
}
