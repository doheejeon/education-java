package ch05.ex01.case04;
//도메인 디자인 
public class User {
	String name;
	int age;
	
	//데이터쓰기기능을 갖고있는 메소드 "setter"
	void setName(String myName) {	 		 //리턴값이 없으니까 void. / 이 void를 '멤버메소드'라고한다. 클래스를 구성하는 멤버 void는 데어터타입을 알려주는부분	 
		name = myName;
	}
	
	void setAge(int myAge) {
		age = myAge;
	}
	
	//데이터읽기기능 갖고있는 메소드 "getter"
	String getName() {						//읽기니까 파라미터값은 비워둔다. /위에서 던져주는게 string이라 여기는 string으로 
		return name;
	}
	
	int getAge() {
		return age;
	}
}
