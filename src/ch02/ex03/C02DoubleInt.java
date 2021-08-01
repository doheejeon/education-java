package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d = 1.52;
		int i = (int)d; //overflow돼서 1.92가 1로 바뀌어서 출력됨. casting, overflow 둘 다 발생.
		System.out.println(i);
		
		double f = Math.floor(d); //1.92바닥의 값 1.00 출력
		double r = Math.round(d); //1.92의 머리 값 2.00 출력 반올림됨
		
		System.out.printf("%.2f, %.2f\n", f, r ); 
		
		int f2 = (int)f;//i값과 f2의 값이 같아짐. 9번 플로어의 값을 int로 캐스팅  1로출력
		int r2 = (int)r; //10번 라운드 값2.00을 int로 캐스팅 , 2로 출력 
		System.out.printf("%d, %d ", f2 ,r2);
		
		
	}

}
