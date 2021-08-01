package ch07.ex03.case03;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Animal> zoo = new ArrayList<>();
		zoo.add(new Tiger());
		zoo.add(new Falcon());
		
		for(Animal animal: zoo) {		//동물원에서 동물을 꺼낸다.
			animal.eat();
			animal.move(); 				//Animal안에 eat, move가 다 있어서 오류가 안남.
		}
		System.out.println();
		
		zoo.clear(); 			//리스트안의 메소드를 다 지워준다. 리스트를 청소한다.
		zoo.add(Cosmos.getAnimal("호랑이"));	//팩토리 메서드를 이용하여 생성했다.
		zoo.add(Cosmos.getAnimal("매"));		//spring에서는 이런 factory method를 이용한다.
		
		for(Animal animal: zoo) {
			animal.eat();
			animal.move(); 			//12-14와 마찬가지로 먹고달리고 먹고날다. 
		}
	}
}
