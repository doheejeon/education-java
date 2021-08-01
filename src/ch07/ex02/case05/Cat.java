package ch07.ex02.case05;

public class Cat {
	private String name;
	
	public Cat(String name) {
		this.name = name;			//생성자생성 
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
