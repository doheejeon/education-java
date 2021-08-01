package ch07.ex04.case04;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pocket pocket = new Pocket();
		List<Number> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Double> list3  = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		
		pocket.add(list1);
		pocket.add(list2);
		pocket.add(list3);
		//pocket.add(list4);
		
		pocket.printList(list1);
		pocket.printList(list2);
		pocket.printList(list3);
		pocket.printList(list4);
		
		pocket.add2(list1);
		pocket.add2(list2);
		//pocket.add2(list3); double을 받긴하지만 Integer와 Double은 동급이라 오류난다.
		//pocket.add2(list4);
	}
}
/*
9-12> 선언부터데이터타입을 명확하게 해서 리스트의 데이터타입을 선택하는 방법. 

*/