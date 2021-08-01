package ch06.ex05.case08;

public interface Animal {
	default void eat() {
		System.out.println("입으로 먹다.");
	}
	
	void move();
}

/*
interface에서도 바디를 가질 수 있게 된다. (추가내용)즉 메소드를 갖고있는것
 그 메소드는 두가지다. 1.default 메소드와 2.static 메소드 
 
4>default 메소드 : 인터페이스만들당시에 메소드의 알고리즘을 정할 수 있다면 디폴트 메소드를 쓴다. 
8> 알고리즘을 정할 수가 없을땐  move는 추상메소드로 둔다.

default 메소드는 메인에서 객체. 하고 불러올 수 있다. 즉 상속이 가능
static 메소드는 상속이 불가하다.
*/