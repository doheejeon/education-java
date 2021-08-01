package ch05.ex07.case01;

public class Main {
	public static void main(String[] args) {
		System.out.println("main 시작.");
		
		try {
			Thread.sleep(1000);				
		} catch(Exception e) {}			
		
		Stack.first();					//"메인에서 first를 호출해요"
		
		try {
			Thread.sleep(1000);				
		} catch(Exception e) {}			
		
		System.out.println("main 끝.");
	}

}
/*
main 시작.
first 시작.
second 시작.
second 끝.
first 끝.
main 끝.

try블럭 Thread를 사용하면 1초주기로 일이 진행되는 것을 볼 수있다. 
*/