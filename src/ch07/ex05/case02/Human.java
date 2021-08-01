package ch07.ex05.case02;

@FunctionalInterface
public interface Human {
	void say();
	
	static void walk() {
		System.out.println("Human walk.");
	}
	
	default void sleep() {
		System.out.println("Human sleep.");
	}
}

/*
static,default 메소드는 functional method여도 얼마든지 가질 수 있다. 
*/