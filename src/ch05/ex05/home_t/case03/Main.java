package ch05.ex05.home_t.case03;
//앱의 시작과 끝은 메인에 표현해야한다.
public class Main {
	public static void main(String[] args) {
		Dice dice = new Dice();
		String isRepeat = "";
		
		
		do {
			System.out.println(dice.roll()); //주사위굴림표시
			isRepeat = Console.inYn("주사위를 굴릴까요?");
		} while(isRepeat.equals("y"));
		
		System.out.println("끝.");
	}

}
