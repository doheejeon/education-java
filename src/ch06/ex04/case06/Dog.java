package ch06.ex04.case06;

public class Dog extends Animal {
	private int age;			//자식의 age는 자식에게 맡기단ㄷ.
	
	public Dog(int age) {
		super(age);				//부모가갖고잇는 age소환해서 내가 초기화
		this.age = age;
	}
}
