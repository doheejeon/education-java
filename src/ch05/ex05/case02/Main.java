package ch05.ex05.case02;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		double result = calculator.add(1, 2);
		System.out.println(result);
		result = calculator.add(1, 2, 3);
		System.out.println(result);
		
	}

}
