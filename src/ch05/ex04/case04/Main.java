package ch05.ex04.case04;

public class Main {
	public static void main(String[] args) {
		Sequence.setCurrentNum(1);
		
		for(int i = 0; i <3; i++)
			System.out.println(Sequence.nextNum());
	}
}
/*
*7> 3번반복하겟다. 
*8> 1 2 3 이 차례대로 호출된다. 
*/