package ch05.ex01.case05;
//도메인을 디자인하는 방법. 하지만 backdoor가 존재한다.
public class Main {
	public static void main(String[] args) {
		User user = new User();		//객체생성
		
		user.setName("최한석");
		user.setAge(25);
		System.out.printf("%s, %d\n", user.getName(7), user.getAge(7));
		System.out.printf("%s, %d\n\n", user.getName(3), user.getAge(3));
		 
		
		user.setName("한아름");
		user.setAge(35);
		System.out.printf("%s, %d\n", user.getName(7), user.getAge(7)); //reject, -1
		System.out.printf("%s, %d\n\n", user.getName(3), user.getAge(3));	//비밀, 0
	
		//backdoor 
		user.name = "양승일";
		user.age = 43;
		System.out.printf("%s, %d", user.name, user.age);			//조건에 부합하지 않는데 데이터가 읽혀질 수 있음. 
	}

}
