package ch07.ex02.case10;

public class AutoBoxing {		//기본값을 객체로 자동 포장해준다. 
	public static void main(String[] args) {
		int a1 = 1;		
		Integer a2 = new Integer(1);		//1이라는 리터럴이 객체로 포장됨. 현재 수동으로 boxing됐다. 
		int a3 = new Integer(1);  //-> auto 언박싱. 결국 캐스팅이다. 
		Integer a4 = 1;		// -> 이 현상을 auto boxing이라고 한다. 
		
		double b1 = 1.0;
		Double b2 = new Double(1.0);
		double b3 = new Double(1.0);
		Double b4 = 1.0;	
		
		boolean c1 = true;
		Boolean c2 = new Boolean(true); //15,16 평범
		boolean c3 = new Boolean(true);
		Boolean c4 = true;
		
	}
}
/*
기본타입과 객체간의 자동으로 형변환이 이뤄지는 것을 autoboxing이라고 한다. 
ㅁ1,ㅁ2,ㅁ3는 stack에 생성 new로 만든것은 heap에 생성 
5번의 1은 상수영역에 생성.
12,13,17,18> 여기서 나타나는 현상이 바로 auto boxing이다. 

ArrayList 는 generic type이다. 
*/