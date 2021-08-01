package ch07.ex02.case08;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat();
		animals[1] = new Snake();		
		animals[2] = new Snake();
		
		for(Animal animal: animals)		//animal로만 cat과 snake를 본다고 가정한다.
			animal.eat();				//animal이 cat과 snake를 다 가지고있어서, animal에 해당 메소드 바디가 없어도 그 다음 객체의 메소드를 찾아간다 .
		
	}
}
