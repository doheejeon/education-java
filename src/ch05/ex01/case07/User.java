package ch05.ex01.case07;
//encapsulation	도메인객체를 디자인하는 기법 (캡슐화) 이 캡슐안에는 name, age가 담긴다.  
public class User {
	private String name;		//객체를 구성하는 변수는 4,5번의 변수뿐이다. 밑에 멤버변수는 객체를 구성하는 메소드가 아님.
	private int age;	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {		//파라미터가 데이터타입과 일치해야한다.
		this.name = name;					//this 변수안에 객체가 들어간다. 
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
