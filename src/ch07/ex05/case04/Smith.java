package ch07.ex05.case04;

public class Smith {
	public Gun makeGun() {		//총을만들거라 리턴값이 Gun
		return () -> System.out.println("드르륵");
	}
}	
