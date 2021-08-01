package ch07.ex02.case07;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];		//interface를 써서 동물을 다 들어가게, 확장성 확보.= 컬렉션관리용이하다 
		
		animals[0] = new Cat("헤롱이");
		animals[1] = new Dog("왈알이");			
		animals[2] = new Dog("성큼이");
		
		for(Animal animal: animals)
			System.out.println(animal);
		
		Object[] objects = new Object[3];		//object에 담아본다.
		objects[0] = new Cat("헤롱이");			//cat이 object타입으로 프로모션돼서 들어감.
		objects[1] = new Dog("왈왈이");
		objects[2] = new Dog("성큼이");
		
		for(Object obj: objects)			//동물이나 개, 고양이가아닌 그냥 객체로 꺼내면된다.
			System.out.println(obj);
	}
}
