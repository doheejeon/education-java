package ch07.ex02.case20;

public class Prime implements Autobot{
	@Override
	public void run() {
		System.out.println("프라임 달리다.");
	}
	
	@Override
	public void fight() {
		System.out.println("프라임 싸우다.");
	}
	
	public void command() {		//프라임은 명령한다.
		System.out.println("프라임 지휘하다.");
	}
}
