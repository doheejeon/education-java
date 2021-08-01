package ch09.ex01;

public class C03Sleep {
	public static void main(String[] args)  {
		for(int i = 0; i < 10; i++) {
			System.out.print(i +  " ");
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	}
}
/*
8> sleep은 
	public static void sleep(long millis)
                  throws InterruptedException
      ->Exception 있어서 try, catch로 예외처리해줘야한다. 
*/