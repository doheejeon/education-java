package ch05.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Card.setWidth(10);
		Card.setHeight(20);
		
		//Card.setKind("spade");
		//Card.setNumber(10);
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.setKind("heart");
		card1.setNumber(7);
		card2.setKind("spade");
		card2.setNumber(4);
		
		System.out.printf("%d, %d\n", Card.getWidth(), Card.getHeight());	//10, 20
		System.out.printf("%d, %d\n", card1.getWidth(), card1.getHeight()); //10, 20
		System.out.printf("%d, %d\n", card2.getWidth(), card2.getHeight());	//10, 20
		
		card1.setWidth(100);
		System.out.printf("%d, %d", card1.getWidth(), card2.getWidth());	//100, 100
	}
}

/*
 * 5>스태틱은 멤버메소드앞에도 붙기도한다 -> 클래스. 하고 호출하는게 가능. 'Card.'/주어없이 서술어만있는 문법이지만 (card.은 setWidth가 어디있는지알려줄뿐) 오류가없다.
 *   때로는 객체에 관심없고 서술어에만 관심있는 경우이다. println처럼 서술어에만 관심있는 예시. 
 * 		스태틱 메서드가 만들어지면 객체없이 set.width만 즉 서술어만 콜해서 사용할 수 있다. 
 * 8,9> 인스턴스메소드는 인스턴스 변수가 생성돼야 쓸 수 있다.  호출불가.
 * 11,12>card1,2는 domain이다. 도메인(데이터를 표현하는객체) / "카드 한 장을 손에 쥔 상태"
 * 14-17> "카드 모양을 관찰하는 상태 "
 * 20,21> 19번을 이렇게 쓸 수 있다. 스태틱메소드도 카드클래스의 멤버 메소드이긴하니까! 
 * 23>card1이 100으로 바꿨으니 card2도 영향을 받아 같은 값이 출력된다. 
 */
