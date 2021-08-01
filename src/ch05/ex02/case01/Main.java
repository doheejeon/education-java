package ch05.ex02.case01;

public class Main {
	public static void main(String[] args) {
		MyNumber number = new MyNumber();
		number.setA(1);				//1과 2를 담을 바구니 역할 
		number.setB(2);	
		
		int result = number.getA() + number.getB();
		result = number.getA() - number.getB();
	}

}
