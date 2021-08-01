package ch06.ex04.case07;

public class Main {
	public static void main(String[] args) {
		ShinhanBank shinhan = new ShinhanBank(0.01);			//지금 한국은행에서 금리를 1퍼센트로한다.
		
		System.out.printf("%.1f %%", shinhan.getRate() * 100);
	}

}
/*
7> %를 일반문자로 쓰고싶을땐 나란히 %% 쓴다. 

*/