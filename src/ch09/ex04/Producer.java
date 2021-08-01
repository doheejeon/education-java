package ch09.ex04;

public class Producer implements Runnable{
	private String name;
	private Buffer buffer;
	
	public Producer(String name, Buffer buffer) { //생성자만들기.
		this.name = name;
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			buffer.add(i); //"buffer에 i값을 add한다."
			System.out.println(name + ": " + i); //얼마 add했는지 콘솔에출력.
			
			try {
				Thread.sleep((int)(Math.random() * 100 ));
			} catch(InterruptedException e) {}
		}
	}
}
