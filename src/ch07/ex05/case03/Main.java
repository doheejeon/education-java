package ch07.ex05.case03;

public class Main {
	public static void main(String[] args) {
		Computer computer = (a, b) -> {  //(a,b)로 아무거나 파라미터개수의 맞춰서 그냥 써주면됨. 데이터타입무관. 명령문이 2개니까 블럭기호써줘야한다.
			int result = a + b; 
			return result;
		}; //명령문하나 끝났으니 세미콜론 잊지말고 붙이기. 
		
		int outcome = computer.calc(1, 2);
		System.out.println(outcome);
		
		computer = (a, b) -> { 		//위의 메소드를 다시 덮어씌워줄수도있다.
			int result = a - b;
			return result;
		};	
		
		outcome = computer.calc(1, 2);
		System.out.println(outcome);
	}
}


/*
자바에서 다루는 값의 종류는 : 리터럴, 객체, 펑션(메소드)
*/