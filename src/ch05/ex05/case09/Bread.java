package ch05.ex05.case09;

public class Bread {
	private int price;

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return price + " ";
	}

}
/*
* 4> "빵을 가격으로구분하다" 
* 기능을 수행하는게 없으니까 이 빵클래스도 도메인이다.
* 
*/