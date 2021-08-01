package ch08.ex03.case01; //Notry문법 배우기.

public class C01NoTry {
	public static void main(String[] args) {
		int[] arr = new int[10]; //존재하지않는 인덱스에 접근하면 runtime error발생
		int result = arr[10];
		
		System.out.println("끝.");
	}
}

/*
에러객체의 최고 부모는 exception임. 
try 문법이용이유: 앱을 살리기위해서다. 
*/