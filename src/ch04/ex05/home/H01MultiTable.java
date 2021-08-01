package ch04.ex05.home;

public class H01MultiTable {
	public static void main(String[] args) {
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println(); 		//단 사이에 문단이 넣어져서 보기 깔끔해짐.
		}
	}

}
/*
구구단을 출력하라.
--

2*1 =2 
....
9 * 9 = 81
*/