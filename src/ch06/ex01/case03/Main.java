package ch06.ex01.case03;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		lion.run();
		
		leopard.eat();
		
		//lion.eat();   ->Lion에는 eat이 없어서 쓰지못한다.
		lion.shout();
		
		//leopard.shout();	->->leopard에는 shout이 없어서 쓰지못한다.
	}
}