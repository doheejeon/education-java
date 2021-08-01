package ch07.ex02.case16;

public class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}


/*
맵은 key를 수동배열한다. 


*/