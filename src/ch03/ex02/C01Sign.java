package ch03.ex02;

public class C01Sign {
	public static void main(String[] args) {
		int i = -10;
		i = +i; //양수연산자가 먼저 계산-> 할당
		System.out.println(i);//-10출력 (1x-10)
		
		i = -10;
		i = -i;
		System.out.println(i);//10출력.
	}

}
