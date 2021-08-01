package ch07.ex02.case13;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<>();
		
		cats.add(new Cat("새코미"));
		cats.add(new Cat("새롬이"));
		cats.add(new Cat("새로미"));
		
		for(Cat cat: cats) cat.eat();
		
	}
}
