package ch05.ex01.case07;

public class Main {
	public static void main(String[] args) {
		User user = new User(); 		//new user로 도메인을 하나 만들었다. domain = data + object 
		
		user.setName("최한석");			//25살 최한석 유저가 만들어졌다.
		user.setAge(25);
		
		System.out.println(user.getName() + ", " + user.getAge());	//최한석, 25
		
		
	}
}
