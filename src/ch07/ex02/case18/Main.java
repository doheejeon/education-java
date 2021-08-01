package ch07.ex02.case18;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Dove dove = new Dove();
		Duck duck = new Duck();
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		List<Mammal> pen = new ArrayList<>();		//mammal타입을 갖고있는 객체만 pen에 담겠다.
		pen.add(lion);
		pen.add(leopard);
		//pen.add(dove);
		
		List<Bird> cage = new ArrayList<>();
		cage.add(dove);
		cage.add(duck);
		//cage.add(lion);
		
		for(Mammal mammal: pen)	mammal.walk();			//pen에서 포유류를 한 마리씩 꺼낸다.
		System.out.println();							//빈줄추가
		
		for(Bird bird: cage) bird.fly();
		
	}
}
