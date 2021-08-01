package ch09.ex04;

public class Consumer implements Runnable { //remove만 호출한다(즉 데이터를 읽어가기만 할 것임
	private String name;
	private Buffer buffer;
	
	public Consumer(String name, Buffer buffer) {
		this.name = name;
		this.buffer = buffer;
	}

	@Override 
	public void run() {
		for(int i = 0; i < 5; i++) {		//remove작업을 5번 반복한다. /1초만에 완료될지, 30초만에 완료될지는 모름. 
			int value = buffer.remove(); //buffer에서 값을 가져온다./ 1. remove실행하다가 값이 없으면wait한다.
			System.out.println(name + ": " + value);	//가져온 값을 콘솔에 출력한다. 
			
			try { //5번작업을 일정시간을두고 작업하기위해 try블럭 생성
				Thread.sleep((int)(Math.random() * 100)); //0이상 100미만의 값이 들어간다. 
			} catch(InterruptedException e) {}
		}
	}
}
