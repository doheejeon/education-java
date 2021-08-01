package ch07.ex04.case03;

public class Main {
	public static void main(String[] args) {
		Cabinet<A> cabinet1 = new Cabinet<>();	//cabinet1은 여기서 A로 결정됨.
		Cabinet<B> cabinet2 = new Cabinet<>(); 	//generic type을 B로 설정.B는 A를 상속받아서 조건을 걸어놨지만 사용이 가능해짐.
		//Cabinet<C> cabinet3 = new Cabinet<>();	//C는 extends A가 아니여서 거부됨.
		
		A[] arr1 = {new A(), new A()};			//geneirc method 테스트 
		B[] arr2 = {new B(), new B()};
		C[] arr3 = {new C(), new C()};
		D[] arr4 = {new D(), new D()};
		
		cabinet1.getLastVal(arr1);
		cabinet1.getLastVal(arr2);
		//cabinet1.getLastVal(arr3); arr3과 4는 A타입을 갖고있지않아서 오류난다. 
		//cabinet1.getLastVal(arr4);
		
		//cabinet2.getLastVal(arr1);
		cabinet2.getLastVal(arr2);		//B타입으로 돼서 B만 사용가능. *이부분 복습해서 이해하기
		//cabinet2.getLastVal(arr3);
		//cabinet2.getLastVal(arr4);
		
		//cabinet1.getFinalVal(arr1);		//A는 C타입을 갖고있지않아서 오류가생김.
		//cabinet1.getFinalVal(arr2);
		cabinet1.getFinalVal(arr3);
		cabinet1.getFinalVal(arr4);		//D extends C ->true 여서 사용가능. 
		
		}
	}

