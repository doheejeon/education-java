package ch07.ex05.case05;

public class Main {
	public static void main(String[] args) {
		Janitor<Building> janitor1 
			= a -> System.out.println(a + "을 청소합니다."); //파라미터가 하나일땐 가로생략가능 (a) -> a 
			
		Janitor<Car> janitor2 
			= (b) -> System.out.println(b + "를 청소합니다.");
			
		janitor1.clean(new Building());
		janitor2.clean(new Car());
		
		//janitor1.clean(new Car()); 빌딩을 파라미터로 받았으니까 car는 못함.
		
	}
}
