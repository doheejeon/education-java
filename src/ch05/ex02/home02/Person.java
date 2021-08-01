package ch05.ex02.home02;

public class Person { //나를 디자인한다고해서 Jeondohee로 클래스명을  전도희는 스트링값이다. 만드는게 아니라, '사람'으로 디자인
	//클래스는 집합. 멤버변수로 쓸 것을 클래스명으로 쓰면 안되고, 원소들을 집합시킬수 있는 '집합명'을 추상화하여 클래스이름으로 지어야한다. 
	private String name;
	private int age;
	private String gender;
	private String bloodtype;
	private int height;
	private int weight;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getBloodtype() {
		return bloodtype;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void exercise(int weight) {
		
	}
	

}
