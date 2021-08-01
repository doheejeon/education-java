package ch07.ex01.case07;

public class Main {
	public static void main(String[] args) {
		Human human = new Human();
		Kimchi kimchi = new Kimchi();
		Ramen ramen = new Ramen();
		
		human.eat(kimchi);
		human.eat(ramen);
		human.eat(new Apple());		//한번만 쓸 객체는 변수에 담지말고 이렇게쓰자.
		
		
	}
}
