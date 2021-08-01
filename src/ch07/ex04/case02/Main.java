package ch07.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();		//Box는 제너릭클래스가 아니여서 뉴할때 제너릭으로 선언하지 않았다. 
		Integer[] arr1 = {1, 2, 3};
		String[] arr2 = {"a", "b", "c"};
		
		int i = box.getLastVal(arr1); 		//getLastVal이 실행되는 시점에 Integer로 결정됐다.
		String s = box.getLastVal(arr2);	//여긴 String으로 결정됐다. 리턴값이 스트링이니까 스트링타입 변수에 리턴값을 담음.(String s)
		
		System.out.printf("%d, %s", i, s);		//3, c 
	}
}

/*
generic 메소드의 type은 generic메서드를 호출할때 결정된다.
generic type을 쓰는 이유 : 확장성을 위해서 쓴다.

*/