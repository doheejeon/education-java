package ch05.ex01.home;

import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private LocalDate regDate;
	
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
