package ch07.ex01.case10.presentation;
//주어보다 서술어에 관심있는 콘솔클래스. 즉 스태틱메소드로 집합시켜야한다.
public interface Console {
	static void info(String msg) {
		System.out.println(msg);
	}
	
	static void info(Object obj) {			//파라미터로 object받는경우.
		System.out.println(obj);
	}
	
}
/*
console은 user와 전혀 관련없는 메소드로만 구성됐다.
인터페이스에 바디를 추가할 수 있는 매서드가 두가지 있다. (static 매서드와 default매서드), 문법이 새로 바뀌면서 가능하게 되었음.
*/