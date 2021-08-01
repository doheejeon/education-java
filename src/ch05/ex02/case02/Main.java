package ch05.ex02.case02;

public class Main {
	public static void main(String[] args) {
		MyNumber number = new MyNumber();
		number.setA(1);
		number.setB(2);
		
		int result = number.add(); //더하기하고싶을때 
		result = number.minus();
	}

}
