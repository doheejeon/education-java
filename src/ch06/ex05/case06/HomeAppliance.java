package ch06.ex05.case06;

import ch06.ex05.case03.Appliance;
import ch06.ex05.case05.Electronic;

public interface HomeAppliance extends Appliance, Electronic { //electroincs & appliance를 추상화시킴 

}

/*
6> extends로 상속받을땐 상속받는 것들이 전부 인터페이스여야한다.
 implements 로 받을 수 없는 이유는 해당 클래스가 interface 여서 바디를 구현할 수 없기 때문이다. 
 implements = 상속받은 메소드의 바디를 구현하는 것. 
 여기서는 상속받은 메소드들을 구현할 의도가 없기떄문에 implements를 쓰지않는다. 
 
 class extends class
 class implements interface
 interface extends interface
 
 인터페이스는 코드르 ㄹ모아놓는 용도로 쓸 수도 있다 case07 참고 
*/