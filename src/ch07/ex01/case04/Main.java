package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Platanus platanus = new Platanus();
		
		Tree tree = new Platanus();		//여기가 실행될땐 프로모션이 일어난다.
		platanus = (Platanus)tree; 	
		
		tree = platanus;			//프로모션 발생.캐스팅이라 부를수도있다.
		tree = (Tree)platanus; 		//사족이지만 자동으로 일어나는 캐스팅을 11번처럼 내가 수동으로 적어줄수도있다. 
	}
}

/*
7> 프로모션은 할당연산자 '전'에 된다. 

*/