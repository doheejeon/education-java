package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) { //메인쓰레드를 실행하는 것은 메인임 
		System.out.println("main start");
		
		Thread thread1 = new Thread(() ->  {	//메인쓰레드외에 다른 쓰레디를 만들고 싶을떄 
			for(int i = 0; i < 10; i++) //run()메서드의 바디를 채우는것임.
				System.out.print(i +  " ");
		});
		
		Thread thread2 = new Thread(() -> { //이 값의 데이터타입은 Runnable이다. runnable CLS참조, F2/ runnable값은 function
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
		
		thread1.start();
		thread2.start();
		
		System.out.println("main end.");
	}
}

/*
펑셔널 인터페이스를 이용해서 쓰는 문법 : lamda 
	 ->파라미터를 람다로 표현(=펑션도 객체다)
	 
thread1 은 자신이 파라미터로 전달받은 (run메서드를)를 작동시킨다
	8번줄이 어떤행동을 할지 정해주는 곳.업무메뉴얼을 정해줌 
	
timesharing 시간을 쪼개서 업무를 나눠서 진행.  
쓰레드가 2개이상 있는 현상 = multi Thread 
*/