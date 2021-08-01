package ch07.ex03.case03;

public class Cosmos {
	public static Animal getAnimal(String animalName) {	//우주는 동물을 창조하는 행위를해서 리턴을 Animal "factory method" /animal이 필요할때 1.new로 직접생성한다. 
		Animal animal = null;					//리턴할 animal을 저장할 변수를 만든다.
		
		switch(animalName) {
		case "호랑이": animal = new Tiger(); break;
		case "매" : animal = new Falcon(); 		//이름이 '매'라면 매를 창조한다. 
		}
		
		return animal;			//창조한 animal을 리턴하고 마무리한다.
	}
}
