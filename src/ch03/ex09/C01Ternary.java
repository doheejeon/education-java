package ch03.ex09;
//삼항연산자-절대값 구하기 쉬움
public class C01Ternary {
	public static void main(String[] args) {
		int x = 1;
		int y = -1;
		
		int absX = (x >= 0) ? x : -x; //절대값을 출력해내는 식
		int absY = (y >= 0) ? y : -y; //y가 트루면, 뒤에있는 것 바로 출력하고 :아니면 뒤에 식출력 라는 뜻 
		System.out.println(absX); //
		System.out.println(absY);
	}

}
