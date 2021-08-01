package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		int i = 0; //여기서 초기화 : 변수에 값을 할당
		++i; //++은 read와 write 둘다 한다.
		System.out.println(i);
		i++;
		System.out.println(i); //++이 앞 뒤에 있어도 값에 영향을 미치지 않음. 
		
		i = 0; //여기서 초기화는 i 값을 깨끗하게 청소하는 의미.
		int j = ++i; //++이 먼저 실행되고 할당이 그 뒤에 실행 보통 할당연산자는 마지막에 된다.
		System.out.printf("i:%d, j:%d\n", i, j); //i=1, j=1 출력
		
		i = 0; //i 값 청소
		j = i++; //i값이 할당 먼저됨 j에 저장이 되고 그 다음에 연산이 됨 
		System.out.printf("i:%d, j:%d\n", i, j); // i=1 , j=0 출력.
		
	}

}
