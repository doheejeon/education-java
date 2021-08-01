package ch04.ex05;
//아파트를 만들어보자 내림차순구현
public class C06Apartment {
	public static void main(String[] args) {
		for(int i =5; i > 0; i--) {
			for(int j = 1; j < 6; j++)		//각 층에 5세대가 있음.
				System.out.printf("[%d0%d]", i, j);
			System.out.println();
		}
	}

}
/*
 * 
[501][502][503][504][505]
[401][402][403][404][405]
[301][302][303][304][305]
[201][202][203][204][205]
[101][102][103][104][105]

*/

