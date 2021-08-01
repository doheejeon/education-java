package ch05.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pajamas pajamas = new Pajamas();
		Man man = new Man();
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		man.sleep(pajamas);
	}

}

/*
10> "(파자마)를 입어라.

오늘만 자는게 아니라 매일매일 자야하니까 8-11이 계속 반복되면 카피앤페이스트 더럽게됨. (호출만으로도 중복이 생김)
메소드의 생성이유가 코드의 중복을 줄이기 위해서인데 이렇게 되면 중복이 계속 일어나게됨. 
13>해결책-> Man클래스 참고 / 한줄만으로 4가지 행동이 다 포함되어있음. ->간단해지고 중복이 줄어듬

*/