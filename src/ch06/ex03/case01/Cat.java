package ch06.ex03.case01;

public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age) {		//생성자
		//this.name = name; private으로돼서 자식도 접근불가.
		this.age = age;
	}
}
/*
지금 Cat 클래스에는 기본생성자가 없다. 


*/