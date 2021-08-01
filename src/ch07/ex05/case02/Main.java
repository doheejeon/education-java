package ch07.ex05.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say."); //화살표 오른쪽은 메소드자리 왼쪽은 파라미터 / 무명클래스로 취급됐다.human타입의 값이야.
		human.say();
		//human.walk();
		human.sleep(); //-> 이게 되는 이유: 자바는 5번줄을 무명클래스로취급돼서, 객체가생성된 것으로 봄. ->자식으로 보고 default 메소드가 상속됨. (static은 원래안됨)
		
		Human.walk(); //static메소드는 늘 클래스. 하고 호출해야한다. human.walk();하면안됨.
		
		human = new Student(); //여긴 생성해줘서 13번가능 .
		human.say();
		
	}
}
