package ch03.ex05;
//버그에서 보이는 오버플로우 
public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000; //a * b 의값은 int에 못담으니까 long에 담아보자!
		long c = a * b;
		System.out.println(c); //-727379968 값은 그때그때마다 다르게 출력된다. 오버플로우가 발생했다는 버그라는 것만 알아두자.
		//int에 계산되니까, int끼리 계산안되게 먼저 long으로 계산하게끔 가로를 쎃어 넣어주자.오버플로우 방지
		c = (long) a * b; //과제 9번줄 출력의 버그를 제대로 된 값이 나오게 수정해보자.
		System.out.println(c); //1000000000000
		
		int x = a * b / a; //곱셈에서 먼저 오버플로우가 발생했음. 버그발생 
		int y = a / b * a;  //순서만 바꿔서 버그 방지, 나누기를 먼저하면 오버플로우방지됨 캐스팅연산자를 쓰는것보다 아주 훌륭한 방법이다.
		System.out.println(x); //-727 버그 
		System.out.println(y); //1000000
		
		
		 
	
	}

}
/*
 * int y =a * (b / a); //가로 연산자 들어갔으니까 이건 추가에 해당됨, 18번코드처럼 바꾸기
 * System.out.println(y); //1000000
 */