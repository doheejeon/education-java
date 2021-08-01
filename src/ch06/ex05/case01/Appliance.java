package ch06.ex05.case01;

public abstract class  Appliance {
	public void on() {}
	public void off() {}

}
/*
추상클래스 
클래스와 클래스를 비교했을때 
actor가 일반 클래스가 된다. 
entertainer는  추상클래스 = 이걸가지고 객체 생성하지 않을거야. 
->기술적으로는 가능하다.하지만 아예 
new 연산자로 못쓰게 막아버리는 방법이있다.
추상클래스는 객체를 생성하지않는다.

4> {} 를 안쓰니까 이걸 아예 없애는 문법을만들자해서 나온것이 더 추상화 시킨 interface이다. 
인터페이스는 추상메소드, 디폴트메소드, 스태틱메소드만 가질 수 있다.

*/