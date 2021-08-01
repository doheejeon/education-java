package ch07.ex04.case03;
//generic type이지만 A타입이여야해. 라고 A라는Scope으로 정해둠. 
public class Cabinet<T extends A> {		//generic type의 scope을 정할 수 있다. 아무거나이긴한데 조건에 리밋을 거는 것 extends를 건다.
	public T getLastVal(T[] arr) {
		return arr[arr.length -1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) {	//또다른 generic type을 만들어줄수있다. 
		return arr[arr.length -1];
	}
}
