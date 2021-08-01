package ch06.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Goose goose = new Goose();
		
		elephant.eat();		//입으로 먹다.
		goose.eat();		//입으로 먹다.
		
		elephant.move();	//걸어가다.
		goose.move();		//날아가다.
	}
}