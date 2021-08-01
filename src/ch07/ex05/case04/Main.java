package ch07.ex05.case04;

public class Main {
	public static void main(String[] args) {
		Shooter shooter = new Shooter();
		Smith smith = new Smith();
		
		shooter.fire(()-> System.out.println("탕탕"));		//내가 직접 만든 총
		shooter.fire(smith.makeGun());						//smith가 만든 총  ->makegun()같은 메소드를 factory method라고 한다. 
		shooter.fire(()-> System.out.println("드르륵"));
	}
}
