package ch05.ex07.case01;

public class Stack {
	public static void first() {
		System.out.println("first 시작."); 	//first가 실행되는걸 보기위해.. 
		
		try {
			Thread.sleep(1000);				//1초동안 잠재운다.
		} catch(Exception e) {}				//1초동안 그냥 일을 하고있다. 
		
		Stack.second();						//"first가 second를 호출합니다"<-과제  
		
		try {
			Thread.sleep(1000);				//세컨드 시작전후로 잠재워본다. 
		} catch(Exception e) {}				//
		
		System.out.println("first 끝.");
	}
	
	public static void second() {
		System.out.println("second 시작."); 	//first가 실행되는걸 보기위해.. 
		
		try {
			Thread.sleep(1000);				
		} catch(Exception e) {}			
		
		System.out.println("second 끝.");
	}
}
