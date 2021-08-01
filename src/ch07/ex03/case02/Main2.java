package ch07.ex03.case02;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<Life> list = new ArrayList<>();
		
		list.add(new Alien());
		list.add(new Cat());
		
		for(Life life: list) life.shout(); //오버라이드된 메서드는 자식것이 실행된다.
	}
}
