package ch07.ex01.case05;

public class Main {
	public static void main(String[] args) {
		Car car = new FireEngine(); 		//차고에 소방차를 넣었다. 이 객체는 소방차오 ㅏ차 두개 타입을 갖고있는데 현재는 '차'로 취급한다.
		car.drive();
		//car.water();  water메소드는 car에 없어서 컴파일오류.
		
		FireEngine fireEngine = (FireEngine)car;		//소방차로 바꾼다.
		fireEngine.water();
		fireEngine.drive();
		
		((Car)fireEngine).drive(); 					//물뿌리기가 끝나면 다시 차로 돌아가서 운전한다.
		
	}

}
