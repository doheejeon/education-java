package ch07.ex04.case04;

import java.util.List;

public class Pocket {
	{
		int i = 1 + 2;
		double d = 1.0 + 2.0;
		i = new Integer(1) + new Integer(2);
		d = new Double(1.0) + new Double(2.0);
		
		//new Number(1) + new Number(2); ->추상클래스로 계산하는 것은 불가하다.
	}
	
	public double add(List<? extends Number> list) { //wildcard '?' 해주고 조건을 걸어 number. (숫자만 더할고싶은게 내 의도니까, 넘버안엔 integer, double)
		double sum = 0; 							//int가 아닌 최대의 double로 해줘서 overflow방지 
		for(Number n: list) sum += n.doubleValue(); //double로(최고값이니까) 변환시켜주는 메소드. 리턴타입이 double 
		
		return sum;
	}
		
	public void printList(List<?> list) {						//unbounded wildcard
		for(Object obj: list) System.out.print(obj + " ");		//어떤타입이든 Object를 갖고있어서 object로 설정.
		System.out.println(); //줄바꿈
	}
	
	//lower bounded wildcard
	public List<? super Integer> add2(List<? super Integer> list){		//super->integer'이상' 리턴타입으로 받을수있다.더블과 오브젝까지 받음.
		for(int i = 0; i < 10; i++) list.add(i);
		return list;
	}
}


/*
Integer, Double은 Number클래스의 자식 클래스이다. (Number 클래스는 추상클래스이다.)
15> 파라미터로 List를 받았지만 list는 generic Class라서 제너릭타입을 결정해줘야한다. 
	그래서 나온 것이 '와일드카드'
	add(List<Number> list) -> <Number>타입 가진 녀석들을 쓸거야 = 확장성확보돼서 int , double다 더할 수있다. 하지만 넘버끼리 더할수가없어서 막힘
	-> 와일드카드쓰기. 
	15번처럼 범위가 정해져있는 와일드카드는 : upper bounded wildcard 
		number이하니까 number가 상한선이 됨 = upper

이미 선언된 제너릭타입 사용(결정)할때 28번줄의 파라미터처럼 또 제너릭타입으로 쓰고싶다면  와일드카드써준다. , 선언은 T,S등 써주면됨. 

*/