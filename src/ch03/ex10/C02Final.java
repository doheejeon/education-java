package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3; //파이널때문에 변수였던 max는 상수가 됨. MAX로바꿔서 일반변수가 아닌 상수야!라고 강력하게 알려줌.'이름있는상수'
		//max = 1; 오류발생 
		
		double area = 3.14 * 3 * 3; //원의 넓이를 구한다. 
		
		final double PI = 3.14; //대문자를 써서 이름을 제대로 붙여줌,불변하는 값에 대해 이름을 붙이고싶을땐 파이널코드를 쓴다.(대문자)
		int r = 3;
		area = PI * r * r; //r은 값이 바뀔수 있다는 것을 알려줌. 
		
	}

}
//이름있는 상수는 가독성을 높인다. 
//코드를 이용하여 왜곡의 확률을 낮춘다.