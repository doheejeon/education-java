package ch05.ex02.home02;

public class Dog {
	private String name;
	private int age;
	private String breed;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void eat() {				//음식을 먹지만 뭘 먹든 관심없으니 파라미터를 비워준다.
		
	}
	
	public void sleep() {			//자는 시간이 얼마든 관심없으니 파라미터를 비워둔다. 
		
	}

}
/*
*32>메소드명은 순수동사로만 쓴다. 동명사, 현재진행형등으로 쓰지않음 
*/