package ch06.ex04.case06;

public class Animal {
	private int age;
	
	public Animal(int age) {
		this.age = 1000 + age;		//파라미터값에 1000을 더한 값을 멤버변수로 둔다.
	}
	
	public void shout() {
		System.out.println("으르릉");
	}
	
	public int getAge() {
		return this.age;
	}
}
