package ch06.ex04.case04;

public class Main {
	public static void main(String[] args) {
		Tablet tablet1 = new Tablet();
		Tablet tablet2 = new Tablet();
		
		System.out.println(tablet1.equals(tablet1)); //true 주소값이 같아서. 
		System.out.println(tablet1.equals(tablet2)); //false 
		
		Phone phone1 = new Phone("AW-1001");
		Phone phone2 = new Phone("AW-1001");
		
		System.out.println(phone1.equals(phone1)); //true 주소값이 같아서. 
		System.out.println(phone1.equals(phone2)); //true  
		
	}
}
/*
이퀄스는 객체의 주소값이 같은지 비교해주는 메소드이다. 
11,12> 모델명이 같을 뿐 서로 다른 객체이다. 

14,15>여기서 사용하는 equals는 phone 클래스에 있는 override된 메소드이고 (내가 설정한 것모델명이 같으면 트루 출력하라고 바꿔둠)
8,9> 는 object 에 있는 equals의 메소드가 실행됨.
*/