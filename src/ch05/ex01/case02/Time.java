package ch05.ex01.case02;
//객체를 디자인한 결과물인 이 클래스 , 이 클래스는 데이터 표현목적인 객체 "domain"
public class Time { //클래스명은 명사. 
	int hour;
	int minute;
	int second;
	
	@Override 		//덮어쓰기합니다 = annotation , 평소쓰는 주석은 comment/ 컴파일러에게 덮어쓰기할거라고 알려주는 대목. 
					//toString의 알고리즘을 바꾸기 위해 덮어쓰기한다. 도메인을 나타내는 곳에 쓰는 것이 좋다. 
	public String toString() { 		//블럭안의 집합의 이름을'메소드' toString으로 함.이름은 블럭안 알고리즘을 뜻하는 단어로 한다. 명령문의 집합:메소드는동사/메소드명(파라미터)
		return String.format("%d시 %d분 %d초", hour, minute, second); //format의 기능원하는 형식으로 return하도록 한다. 
	}

}
