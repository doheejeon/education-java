package ch07.ex02.case05;

public class Main {
	public static void main(String[] args) {
		Cat[] cats = new Cat[3];//고양이만 들어갈 수 있느 ㄴ고양이 아파트를 만들었다. 방이 3개있는 고양이아파트를 만들었따.
				
		cats[0] = new Cat("해롱이");
		cats[1] = new Cat("야코미");
		cats[2] = new Cat("새롬이");
		
		//cats[2] = new Dog();  원소타입이 달라서 컴파일에러
		
		for(Cat cat: cats)
			System.out.println(cat);  		//toString 으로 override해놔서 각 고양이들이 바로 출력된다.
	}
}
/*
7-9> 각 0,1,2번째방에 각각의 고양이를 둔다. 

*/