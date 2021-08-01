package ch07.ex02.case07;

public class Cat extends Object implements Animal{
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
