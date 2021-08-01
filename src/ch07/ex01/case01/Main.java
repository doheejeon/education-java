package ch07.ex01.case01;
//객체는 다양한 타입으로 변신할 수 있다. (단 내가 가지고있는 타입중에 하나)
public class Main {
	public static void main(String[] args) {
		C c = new C();		//C타입으로 존재
		B b = c;			//여기가 실행되면 B타입으로 존재
		A a = c;			//yiyang 
		
		c = (C)a;			//c = a; 오류나는것을 C타입으로 (C)바꿔줘서 해결. 클래스에서도 캐스팅을 할 수 있는 것. (자동캐스팅이니까 프로모션)
		c = (C)b;
		
		b = (B)a;
		
		//String str = (String)c;	C변수에는 String 타입을 갖고있지않아서 오류가난다.
	}

}
