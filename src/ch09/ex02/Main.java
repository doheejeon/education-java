package ch09.ex02;
//현재 메인과 쓰레드 논리 2개가 존재한다. 
public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		Thread counter = new Thread(new Counter()); //이 객체는 카운터타입과 러너블타입 두개를 갖고있다. 러너블 타입의 값을 객체로 표현해봄.
		counter.start();
		
		int tries = 1; //작업횟수를 1씩 증가하면서 파악하기위해 변수만들어줌.
		while(counter.isAlive()) { //"counter가 살아있으면? "
			if(tries <= 2) { //tries값)2번까지만 기다리겠다.
				counter.join(1000);		//카운터를 보느라 1초동안 메인쓰레드는 곧장 죽지않을거다. 
				System.out.println(Thread.currentThread().getName()
					+ " has been waited for " + (tries++) + " times."); //콘솔창으로 메인이 조인한것을 확인하기위한 코드. 메인이 몇번 기다렸는지 확인가능
			} else {  //"tries 값이 3이되면? "
				System.out.println(Thread.currentThread().getName()
						+ ": irritated. ");		//짜증난다고 얘기할거야.
				counter.interrupt(); //오래기다리게하면 차버릴거야.->counter의 interruptException을 발생하게함
				counter.join(); //죽는순간까지 본다. (시간을 정해놓지않음)
				
			}
		}
		
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}
/*
7>Thread counter = new Thread(new Counter()); 카운터를 쓰레드로 랩핑해서 카운터에 쓰레드기능이 랩핑됨.
*wrapping과 캐스팅은 다르다.
*
*12> 계속 카운터의 조건이끝날때까지 살아있으니까, while조건에 부합하여 메인은 계속 안죽음.
*	메인이 죽기만을 바랄때 join을 쓰면된다. (계속 지켜보는것) 
*
*19>  (이메서드가 호출됐을때 카운터가 자고잇을수도깬 상태일수도있지만, 자고있는 상태라면 해당 메소드는실행돼서 sleep을 깬다.
*/