package ch07.ex01.case10.domain;

public class User {
	private String name;		//user는 객체 username은 속성. 
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
/*
1.도메인부터 만든다.

*/