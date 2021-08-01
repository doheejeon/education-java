package ch07.home.ex01.work01;

public class Main {
	public static void main(String[] args) {
		Clerk clerk = new Clerk();
		
		clerk.sell(("백합"));
		clerk.sell(("장미"));
		
		//System.out.println(clerk.sell("백합"));
		//System.out.println(clerk.sell("장미"));
		
	}
}

/*
저는 꽃집 직원입니다. 
꽃을 팔아요. 
손님이 꽃 이름을 말해주면, 그 꽃을 건네줍니다. 
꽃은 백합과 장미 두 가지가 있습니다. 


10-11> println은 확인용 

인터페이스를 쓰는 이유 :확장성을 확보하기위하여 
*/