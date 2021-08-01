package ch07.ex02.case20;

public class Bumblebee implements Autobot {
	@Override
	public void run() {
		System.out.println("범블비 달리다.");
	}
	
	@Override
	public void fight() {
		System.out.println("범블비 싸우다.");
	}
	
	public void guard() {		//주인을 보호한다 , 알고리즘확장= extends한다.
		System.out.println("범블비 보호하다.");
	}
}
