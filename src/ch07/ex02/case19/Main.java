package ch07.ex02.case19;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		
		String msg = "";
		if(c instanceof C) msg += "C ";		//c객체가 C클래스의 인스턴스라면true, 아니라면 false. /맞으면 C라는 문구를 붙인다.
		if(c instanceof B) msg += "B ";		//c객체가 B클래스의 인스턴스이냐? -> true리턴
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object"; 	
		System.out.println(msg); 			//C B A Object 모든 객체를 갖고있다는 것이 보여진다.
		
		msg = ""; 					//msg변수 초기화
		B b = new B();
		if(b instanceof C) msg += "C ";  	// false. "b는 C클래스의 인스턴스가아니다.
		if(b instanceof B) msg += "B ";		//true.
		if(b instanceof A) msg += "A ";		//false면 A는 붙지않는다.
		if(b instanceof Object) msg += "Object"; 	//true.
		System.out.println(msg); 		//B Object
		
		//if(b instanceof F)// -> 컴파일오류. 18번과 다르게A는 오류가 나지않는이유는 컴파일러는 문맥을 본다. C클래스가 B,A와 관련있는게 보이기때문.
		//if(c instanceof F) 
	}
}


/*
22,23> instanceof 쓸때 오른편에 있는 클래스는 어디서든 상속이나 관계가 있어야 한다.
instanceof옆에 쓰는 클래스는 해당객체가 갖고있는 데이터타입(클래스)이거나 인터페이스이다.
*/