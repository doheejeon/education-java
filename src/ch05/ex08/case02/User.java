package ch05.ex08.case02;

import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private LocalDate regDate;
	
	public User() {} //기본생성자, 사람을먼저알고 그 사람의 정보를 알게되는 경우.
	
	public User(String name, int age, LocalDate regDate) {	//생성자을 만나기전에 이미 정보를 다 갖고있는 경우 내가알고있는 정보를 파라미터로 넣어준다
		this.name = name;
		this.age = age;
		this.regDate = regDate;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public LocalDate getRegDate() {
		return regDate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
}
