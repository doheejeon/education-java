package ch05.ex01.home;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//뒤에 가로 여길입력해야함.
		String name = "";
		int age= 0;
		LocalDate regDate = null;				//string이 아닌 클래스타입의 기본값은 null을 주면된다.
				
		System.out.print("이름: ");				//수동
		name = sc.nextLine();	
		System.out.print("나이: ");				//수동 
		age = sc.nextInt();
		regDate = LocalDate.now();				//자동
			
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setRegDate(regDate);
		
		System.out.println("\n다음 사람을 입력했습니다.");
		System.out.printf("이름: %s\n나이: %d\n등록일: %s", 
				user.getName(), user.getAge(), user.getRegDate());
	}

}
/*
이름, 나이를 수동 입력한다. 
등록일은 자동 입력한다. (앱이 등록일을 입력)
위 입력값 세 개를 이용해서, 사람 한 명을 생성한다. 
--

이름: abel (내가 입력한다) 
나이: 25

다음 사람을 입력했습니다. 
이름: abel
나이: 25
등록일 : 2021-05-26

*/
