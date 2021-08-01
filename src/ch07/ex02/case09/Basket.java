package ch07.ex02.case09;
//<>다이아몬드타입 이 안에 아무거나 담겠다는 의미. E는 아무의미없다. -> generic type이 됨. 아무거나타입
public class Basket <E> {
	E e;
	
	E get() {
		return this.e;
	}
	
	void set(E e) {
		this.e = e;
	}
}
/*
basket안에서 E라는 generic type을 쓴다.
e는 이 클래스안에서만 유효한다.

*/