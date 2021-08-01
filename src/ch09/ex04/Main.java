package ch09.ex04;

public class Main {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		new Thread(new Producer("P1", buffer)).start(); //러너블타입이라 얼마든지 랩핑가능
		new Thread(new Producer("P2", buffer)).start();
		
		new Thread(new Consumer("C1", buffer)).start();
		new Thread(new Consumer("C2", buffer)).start();
	}
}
