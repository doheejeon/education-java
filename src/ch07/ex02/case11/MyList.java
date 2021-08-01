package ch07.ex02.case11;

import java.util.ArrayList;

public class MyList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list);  //[1, 2, 3, 1]  중복값을 그대로 유지.
		
		for(int i: list) System.out.print(i + " ");	//for each를 통해 원소값을 읽어보면 1 2 3 1 나온다.
		System.out.println();
		
		System.out.println(list.get(0));			//특정한 자리의 값을 읽고싶을때, "0번째값을 보고싶다." 1출력 
		System.out.println(list);					//[1, 2, 3, 1]
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) +  " ");	//1 2 3 1 get은 읽기만한다.
		System.out.println();
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.remove(i) + " ");	
		
		for(int i = list.size() - 1; i >= 0; i--)		//25번줄보다 성능을올리고 모든값을 꺼내올 수 있게 하는 방법.
			System.out.print(list.remove(i) +  " ");
		
	}	
}

/*
7>ArrayList라는 API이용해서 만들었음. 원소값의 타입이 INteger가 되고, 이 데이터의 타입은 ArrayList이다. 
	ArrayList를 통해 만든 데이터는 데이터타입이 ArrayList타입이다. 
	ArrayList<Integer> list = new ArrayList<Integer>(); ->코드 중복발생해서 
	새로운 7번줄처럼씀. 이러한 형태를 '다이아몬드타입'이라고한다. 

8> 리스트배열에 값을 추가한다.-> add 메서드를 쓴다. 여기서는 int가 Integer로 캐스팅함 (autsoboxing이용)
13> arraylist는 tostring이 이미 오버라이디되어있어서 객체를 출력하면 값이 나온다. 
	list는 자동으로 알고리즘을 관리해서 중복값을 다른 곳에 집어넣는다.list는 배열로 데이터를 관리한다.

21> length처럼 list의 크기르 ㄹ알수있는 메서드가 size이다.

25> get과 읽으면서 데이터를 꺼내고싶을땐 'remove' 메서드를 사용한다. 
	remove하면 빼낸 자리를 채우기위해 모두가 자리이동하기떄문에 작업량이 늘어난다. 

list의 장점은 size에 제한이 없다. 계속 집어넣을 수 있다.


*/