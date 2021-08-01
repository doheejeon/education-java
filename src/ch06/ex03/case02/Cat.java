package ch06.ex03.case02;

public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age) {
		//super();	 부모클래스에 기본생성자가있으면 자동으로 여기서도 생성됨.(보이지않을뿐)
		super(name);
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}
/*
7>메인멤버변수를 초기화하는방법 !! 
super는 부모라는 뜻. 즉 Animal(name) 이렇게 부른것.  

생성자를 호출하는 문법 1.new(남들이 생성자호출) 2.this(내가 내꺼호출) 3.super(부모것을 생성자호출)
*/