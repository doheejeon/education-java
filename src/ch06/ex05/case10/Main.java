package ch06.ex05.case10;

public class Main {
	public static void main(String[] args) {
		BusCard card = new BusCard() {
			@Override
			public void tagOn() {
				System.out.println("tag on.");
			}
			
			@Override
			public void tagOff() {
				System.out.println("tag off.");
			}
		};
		
		card.tagOn();
		card.tagOff();
	}

}
/*
"무명 클래스" 유령 클래스 
클래스 이름 대신 인터페이스를 대신 쓰고 잇는것. 
클래스를 여기서 정의해서 에러가안남. 
= 이름이 없으니까 이 객체는 1번만 실행된다. 

이러한 코드기법은 안드로이드에서 많이 볼 수 있다.
꼭 쓰지 않아도 된다. 
*/