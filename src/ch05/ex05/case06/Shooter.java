package ch05.ex05.case06;

public class Shooter {
	private Gun gun;			// Shooter <has a> gun. //dependency
	
	public void fire() {
		gun.fire();
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
/*
*4>"shooter가 gun을 갖고다닌다." /이러한 총과 슈터의 관계를 has a 관계라고 한다. A has a B // B는 dependency 라고 한다. 
* dependency를 멤버변수로 설정하면 has a 관계가 설정된다. 
* 7>shooter가 총을 FIRE하려면 gun의 fire가 있어야하기떄문에 함께 불러준다. 
* shooter는 gun의 fire의 유무에 따라 좌지우지됨.
*/