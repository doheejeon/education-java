package ch06.ex01.case02;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run(); 			//표범클래스안에beast 클래스 상속해서 run이 존재하기때문에 정상작동 
		lion.run();
	}
}
