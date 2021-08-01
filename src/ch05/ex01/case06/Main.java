package ch05.ex01.case06;
//도메인을 디자인하는 방법. private 설정으로 backdoor부분이 컴파일러에러난다. 
public class Main {
	public static void main(String[] args) {
		User user = new User();		//객체생성
		
		//user.hello();
		//user.setName("최한석");
		user.setAge(25);
		System.out.printf("%s, %d\n", user.getName(7), user.getAge(7));
		System.out.printf("%s, %d\n\n", user.getName(3), user.getAge(3));
		 
		System.out.println();
		//user.setName("한아름");
		user.setAge(35);
		System.out.printf("%s, %d\n", user.getName(7), user.getAge(7)); //reject, -1
		System.out.printf("%s, %d\n\n", user.getName(3), user.getAge(3));	//비밀, 0
	
		//backdoor 
		//user.name = "양승일";
		//user.age = 43;
		//System.out.printf("%s, %d", user.name, user.age);			//조건에 부합하지 않는데 데이터가 읽혀질 수 있음. 
	}

}
