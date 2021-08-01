package ch07.home.ex02.work03T;

public class Main {
	public static void main(String[] args) {
		//List<Stationery> bag = new ArrayList<>(); -> 6번처럼해도되나, 5번처럼 변수명을 bag처럼 디자인하면되니, 이 코드를 지향하자
		Bag<Stationery> bag = new Bag<Stationery>();
		
		bag.add(new Pencil());
		bag.add(new Eraser());
		
		for(Stationery stationery: bag) {
			if(stationery instanceof Eraser) ((Eraser)stationery).erase();
			if(stationery instanceof Pencil) ((Pencil)stationery).write();
		}
	}
}

/*
가방에 지우개와 연필을 담는다.
가방에서 물건을 꺼낸다. 
이 물건이 지우개면 지우고, 연필이면 쓴다. 
*/