package ch09.ex03;

public class Counter {
	private int val;
	
	public synchronized void increase() { // synchronized를 붙여서 순서대로 데이터를 줄세운다. 
		val++; //"increase가 호출되면 val횟수가 늘어난다."
	}
	
	public synchronized void decrease() {
		val--;
	}
	
	public synchronized void print() {
		System.out.print(val + " ");  //"위의 메소드를 눈으로 확인하기 위하여 출력메소드 추가했음."
	}
}


/*
synchronized lock que 는 한 세트로 기억하자. 
	synchronized를 통해 한 쓰레드가 먼저 실행되면 다른 쓰레드는 lock, que된다. 

*/