package ch07.ex02.case01;

public class Array {
	public static void main(String[] args) {
		String[] strs = new String[3]; 
		System.out.println(strs);		
		
		Integer[] integers = new Integer[3];
		System.out.println(integers);
		
		int[] ints = new int[3];
		System.out.println(ints);
		
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]); //0 0 0 
		System.out.printf("%d %d %d\n", integers[0], integers[1], integers[2]); //null null null
		System.out.printf("%d %d %d\n", strs[0], strs[1], strs[2]);		//null null null
		
		ints[0] = 0;
		ints[1] = 1;
		ints[2] = 2;
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]); //0 1 2
		
		for(int i = 0; i < ints.length; i++) ints[i] = i;		//i의 마지막값은 여기서 3이다.  쓰고
		
		for(int i = 0; i < ints.length; i++)					//읽고 
			System.out.print(ints[i] + " ");
		
		System.out.println("\n");
		for(int i: ints) System.out.print(i + " ");			//새문법, "ints컬렉션에있는 원소를 i에 담는다." - for each 문법 
		
		int[] array = {0, 1, 2};						//내가 원소의 값을 알고있을때는 이렇게 나열시켜 놓기도한다. 31-32
		array = new int[] {0, 1, 2};				
	}
}


/*
데이터타입[] 변수이름  = new 데이터타입[변수갯수(length라고한다)];
6> [Ljava.lang.String;@7852e922 출력
strs처럼 주머니역할을 하는 객체들을 "collection"이라고 한다. 
9> [Ljava.lang.Integer;@4e25154f
12> [I@70dea4e
11> 여기서 int는 컬렉션의 타입이아닌 컬렉션이 담고있는 원소값의 타입. 
integers에 들어간 객체의 타입이 아니라 원소의 타입이다!
11> 힙에 생기는 new 라서 자동초기화돼서 int의 자동 초기화값인 0이 출력된다.  

18> ints라는 collection은 여러변수들의 집합이다. 
	만약 변수의 개수가 훨씬 많아진다면..? 알고리즘을 짠다.
	23> for을 이용하자 

collection 안에 있는 데이터를 한 번에 조회하는 업무 ex> 통장정리, 게시판, 쇼핑몰물건목록, 
29>컬렉션의 데이터를 읽을때는 for each문법을 쓴다 
 	컬렉션의 데이터가 소진될때까지 실행된다. 

31-32> 다양한 방법으로 배열을 쓸 수 있지만 이 방법들은 잘 쓰이지않는다. 
	선언과 동시에 초기화를 해준 방법이다. 
*/