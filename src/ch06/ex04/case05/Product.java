package ch06.ex04.case05;

public class Product {
	private int price;
	
	public Product(int price) {
		this.price = price * 2;		//2배로 판다고 가정.
		
	}

	public int getPrice() {
		return price;
	}

}
