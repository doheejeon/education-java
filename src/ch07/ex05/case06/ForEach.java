package ch07.ex05.case06;

import java.util.ArrayList;
import java.util.List;

//foreach 메소드 사용법.
public class ForEach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) list.add(i);
		
		list.forEach((x) -> System.out.print(x + " ")); //cousumer타입의 값을 써줘야하는데 = functionalinterface임. x에는 암거나와도된다.
		System.out.println();
		
		for(int i : list) System.out.print(i + " "); //13번을 간단하게 이렇게 쓸수있다.
	}
}
