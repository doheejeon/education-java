package ch07.ex01.case08;

public class Main {
	public static void main(String[] args) {
		Pistol pistol = new Pistol();
		Rifle rifle = new Rifle();
		Shooter shooter = new Shooter();
		
		shooter.setGun(pistol);
		shooter.fire();		//탕탕
		
		shooter.setGun(rifle);
		shooter.fire();		//빵빵
	}
}
