package ch05.ex05.case09;

public class Baker {
	public Bread bake() {
		return new Bread();
	}
	
	public void stickPrice(Bread bread, int price) {
		bread.setPrice(price);
	}
	
}
/* 
 * 5> baker가 빵을 구우면 빵이 나와야해서 리턴타입이 bread여야한다.  
 * 만약 빵을 먹어버려서 나올 빵이 없다면 리턴타입은 public Bread bake~가 아니라 
 * 			public void bake () 가 됨 
 * 객체는 데이터이다 잊지말자.  나중에 리턴타입을 string이나 int로 쓰고 리턴타입에 빵이름 넣는다고 빵이 생선된것이 아니니 조심하자 
 * 8> 가격을쓸때 따로 나오는건 없어서 void로 리턴타입지정, 가격을붙일땐 빵과 가격이 있어야해서 파라미터로 bread, price를 넣는다.
 */
