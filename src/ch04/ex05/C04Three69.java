package ch04.ex05;
//3,6,9에 박수를 치는 게임 1-10까지 알고리즘을 먼저 마디로 만든다.
public class C04Three69 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			System.out.print(" " + i);
			if(i % 3 == 0) System.out.println("짝");
		}
	}

}
