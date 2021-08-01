package ch07.ex02.case14;

import java.util.ArrayList;
import java.util.List;

import ch07.ex02.case13.Cat;

public class Main {
	public static void main(String[] args) {
		List<Cat> house1 = new ArrayList<>();
		List<Cat> house2 = new ArrayList<>();
		List<List<Cat>> house = new ArrayList<>();
		house.add(house1);
		house.add(house2);
		
		for(int i = 0; i < 3; i++)
			house1.add(new Cat("고양이" + i));		//1층에 고양이 세마리를 넣는다. 고양이0,고양이1 ,고양이2
		
		for(int i = 0; i < 3; i++)
			house2.add(new Cat("야옹이" + i));		//2층에 야옹이 세마리 넣는다.
		
		System.out.println(house1);					//[고양이0, 고양이1, 고양이2]
		System.out.println(house2);					//[야옹이0, 야옹이1, 야옹이2]
		System.out.println(house);					//[[고양이0, 고양이1, 고양이2], [야옹이0, 야옹이1, 야옹이2]]
		
		for(List<Cat> cats: house)		
			for(Cat cat: cats) cat.eat();

			
	}
}