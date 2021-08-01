package ch06.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog(1);		//dog에 기본생성자가없어서 파라미터값을 비워두면오류가 나니까, 맞는 데이터타입을 넣어준다.
		
		dog.shout();
		System.out.println(dog.getAge());
	}
}
