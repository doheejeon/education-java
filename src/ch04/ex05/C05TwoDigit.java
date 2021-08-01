package ch04.ex05;
//for안에 for를 써보자 , 십의 자리와 일의 자리를 구분해서 for 중첩
public class C05TwoDigit {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) { 		//십의자리
			for(int j = 0; j <= 9; j++) {					//일의자리의 최소값은 0부터 시작
				System.out.printf("%d%d\n", i, j);
			}
	}

}
}