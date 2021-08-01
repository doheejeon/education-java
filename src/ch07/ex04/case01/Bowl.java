package ch07.ex04.case01;

public class Bowl<T> {		//generic type선언. Bowl클래스안에서 T를 데이터타입으로 쓰겠다. //generic class
	private T val;
	
	public void setVal(T val) {		//파라미터로도 쓰인다. 
		this.val = val;
	}

	public T getVal() {			//T는 메소드의 리턴타입으로도 쓰인다. 
		return this.val;
	}
}
