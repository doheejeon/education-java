package ch05.ex05.case11;

public class Cooker {
	public void wash(Noodle noodle) {}
	
	public void wash(Cucumber cucumber) {}
	
	public void boil(Noodle noodle) {}
	
	public SpicyNoodle mix(Noodle noodle, Cucumber cucumber, Gochujang gochujang) {
		return new SpicyNoodle();
	}
	//과제
	public SpicyNoodle cook(Noodle noodle, Cucumber cucumber, Gochujang gochujang) {
		this.wash(noodle);
		this.wash(cucumber);
		this.boil(noodle);
		this.mix(noodle, cucumber, gochujang);
	
		return new SpicyNoodle();
	}
	
	
	
	
}
/*
4> cooker주어  ,( )안의 파라미터인 누들이 목적어. wash가 서술어. 
6>요리시가 오이를 씻다.
10> 씻고 삶은 재료들을 가지고 요리할거예요. (버무린다)
11> mix하고나면 새로운 비빔면이 탄생 하니까 new SpciyNoodle
*/