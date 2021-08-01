package ch07.home.ex02.work03;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Eraser eraser = new Eraser();
		Pencil pencil = new Pencil();
		List<Stuff> bag = new ArrayList<>();
		
		bag.add(eraser);
		bag.add(pencil);
		
		for(Stuff stuff: bag) {
			if(stuff instanceof Eraser) ((Eraser)stuff).erase();
			if(stuff instanceof Pencil) ((Pencil)stuff).write();
		}
	}
}

/*
가방에 지우개와 연필을 담는다.
가방에서 물건을 꺼낸다. 
이 물건이 지우개면 지우고, 연필이면 쓴다. 
*/