package ch06.ex04.case05;

public class Shoes extends Product {
	private int price;
	
	//내가 아무것도 적지않으면 컴파일러는 아래와같은 코드를 자동으로생성해서 super에 오류생김 
	 //public Shoes() {
	 //	super();
	 //}
	 
	Shoes (int price) {
		super(price);
		this.price = price;
		
	}
	
	public int getPrice() {
		return price;
	}

}


/*
상속의 가치 
1.코드중복최소화 2.논리적으로 is a 관계여야한다. 3.객체에 의미를 부여함(신발이 상품이라는 의미를 부여한다)
12> product에서 정의된 price는 여기서 정의
13> shoes의 price는 여기서 정의

*/