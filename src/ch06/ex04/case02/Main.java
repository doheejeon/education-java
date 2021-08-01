package ch06.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.shout();			//여길 실행할때 메소드영역엔 4개의 클래스가 생성된다. 3번,5번,6번,그리고 애니멀클래스
		dog.shout();
	}

}
/*
shout의 알고리즘이 마음에 안들때  오버라이드를 한다. 
 모든객체가 갖고있는 메소드. 
hashcode = 객체 주소값을 바탕으로 만든 해쉬코드값을 리턴해준다. 
toString() : println메소드 실행시 자동으로 객체를 표현하는 스트링 문자열을 리턴한다.
wait() : Thread sleep 과 유사한 기능. 
finalize() : 죽기직전에 할일 정의하기 
*/