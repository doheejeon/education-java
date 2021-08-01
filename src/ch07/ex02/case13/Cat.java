package ch07.ex02.case13;

public class Cat {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name + ", 먹다.");
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
