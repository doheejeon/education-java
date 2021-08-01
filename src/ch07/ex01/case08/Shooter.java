package ch07.ex01.case08;

public class Shooter {			//확장성확보위해 dependency타입을 둠
	private Gun gun;			//has a 관계 
	
	public void fire() {
		this.gun.fire(); 		//gun의 행동에 의존함. 
	}
	
	public void setGun(Gun gun) {		//확장성을위해 파라미터로 인터페이스를 둔다.
		this.gun = gun;
	}
}


/*
is a 관계는 '상속'으로 디자인한다.
has a 관계는 '멤버변수'로 디자인 한다 

*/