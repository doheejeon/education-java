package ch09.ex02; //클래스를 Thread로 쓰고싶을때.runnable 타입을 상속받으면됨. run메서드의 바디를 준비해주면된다.

public class Counter implements Runnable{
	@Override
	public void run() { //해당바디에 Thread가 할 행동을 기술해주면된다. 
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		for(char c = 'a'; c < 'f'; c++) {
			System.out.println(Thread.currentThread().getName() + ": " + c);
			try {
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				Thread.sleep(1000);
			} catch(InterruptedException e) {		//InterruptedException는 방해받았을때, sleep은 중단된다. 
				System.out.println(Thread.currentThread().getName() + ": interrupted."); //방해했다는 메세지를 출력. 슬립이꺠지면 VM에 나올 스케쥴에 대기하게됨
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}


/*
6>System.out.println(Thread.currentThread()) 이후에 특정쓰레드가 이 부분을 호출하여 호출한 현재 쓰레드의 객체를 리턴해준다. 
	그리고 그 이름을 얻는다 -> .getName(); 

sleep은 독립적으로 기다리지만 join은 상대가있어야 기다림.

*/