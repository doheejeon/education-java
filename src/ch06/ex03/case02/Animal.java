package ch06.ex03.case02;

public class Animal {
	private String name;
	
	public Animal() {}  //->기본생성자  
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}
/*
6> 기본생성자가 있어야 자식클래스에서 컴파일러가 내가쓰지않아도 자동으로 기본생성자를 생성해준다.

*/