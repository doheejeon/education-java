package ch07.ex02.case20;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bumblebee bumblebee = new Bumblebee();
		Prime prime = new Prime();
		List<Autobot> corps = new ArrayList<>();
		
		corps.add(bumblebee);			//"군단에 범블비와 프라임을 가입시킨다." 
		corps.add(prime);
		
		for(Autobot autobot: corps) {		//오토봇에있는 run,fight만 쓰겠다
			autobot.run();
			autobot.fight();
			//autobot.guard(); -> 객체는 guard가 있지만 클래스에는 없어서 오류난다. 
			
			if(autobot instanceof Bumblebee) ((Bumblebee)autobot).guard();		//autobot이 범블비타입을 갖고있으면? -> 오토봇을 범블비로 캐스팅해서 guard를 호출한다.
			if(autobot instanceof Prime) ((Prime)autobot).command();
		}
	}
}
