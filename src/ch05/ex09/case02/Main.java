package ch05.ex09.case02;

public class Main {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();				//기본생상자를 호출하여 2대의 폰을 만들었다.
		Phone phone3 = new Phone(1000);			//시리얼값을 천번을 주겠다라고 가정하면? 
		Phone phone4 = new Phone();
		
		System.out.printf("%d, %d, %d, %d" ,
				phone1.getSerial(),phone2.getSerial(), phone3.getSerial(), phone4.getSerial());	//100, 200, 1000, 400출력
	}
}
/*
7> 300이 나올값에 덮어씌어져서 1000이 출력되지만 8에서는 다시 돌아가서 400이 출력된다. 

*/