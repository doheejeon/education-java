package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		Card.width = 10;		
		Card.height = 20;
		
		//Card.kind;
		//Card.number;
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("%d, %d\n", Card.width, Card.height);	   //10, 20
		System.out.printf("%d, %d\n", card1.width, card1.height); //10, 20
		System.out.printf("%d, %d\n", card2.width, card2.height); //10, 20
		
		card1.width = 100;
		System.out.printf("%d, %d", card1.width, card2.width);	//100, 100
		
	}

}
/* 5>Card클래스에서 width가 public으로 공개됐기때문에 여기서 쓸 수 있다.(캡슐화하면 안보여서 못 씀)width는 객체의 구성요소가아님.
 * 8,9>인스턴스변수인 kind,number는 접근이 안된다. new를 통해 객체가 생성되지않았기때문에 존재하지않음.
 * 19> 5,6에서 쓰기된 데이터를 19에서 읽기 하고있다.  static변수라는 것을 한번에  알 수가 있음. 
 * 20> '객체.'로접근해서 이렇게 쓸수도있지만 노란줄이 떠서 컴파일러가 경고를 준다. 이유:card1객체안에 width,height가있다고 착각할 수있는소지가있어서.즉 스태틱변수임을 모를수있어서.
 * System클래스에 있는 static멤버변수인 out 을 우리는 개강부터 써왔다. out의 타입은 PrintStream.
 * 레퍼런스 =지역변수가 객체 주소값을 갖고있다. 
 * 24> 23에서 카드1에 100을 줘도 공유한값이니까 카드2에도 영향을 받아 똑같은 값인 100을 출력하게 된다.
 * 
*/