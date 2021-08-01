package ch05.ex01.case05;

public class User {
	String name;
	int age;
	
	void setName(String myName) { 		//String myname은 지역변수 아래도 동일
		if(myName.charAt(0)== '최') 		//최씨면 마이네임값을 네임값에 저장한다.
			name = myName;
		else name = "reject"; 			//최씨가 아니면 reject를 네임에 넣는다.
	}
	
	void setAge(int myAge) {			//20대만 들어올 수 있게 설정한다면? 
		if(20 <= myAge && myAge < 30)	//20대라면 마이에이지값을 에이지에 저장한다.
			age = myAge;
		else age = -1; 					//0,-1같은 음수는 부정의 뜻을 담는다. 
	}

	String getName(int level) {			//친함을 레벨로 표현하다면? 친하면 이름을 알려준다./리턴값이  설정돼서 바디를 비워두면 설정할 리턴값이 없어서 컴파일 에러가 뜸 
		String myName = "";
		
		if(level > 5) myName = name;	
		else myName = "비밀";				//안친하면 비밀
		
		return myName;					//myName값을 리턴하면 업무가 끝난다. 
	}
	
	int getAge(int level) {						//친하면 나이도알려준다.
		int myAge = 0;
		
		if(level > 5) myAge = age;
		
		return myAge;
	}
}
