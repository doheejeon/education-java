package ch04.ex03;
//뽑기를 해보자  3의 배수를 뽑으면 이기는 게임 
public class C02DrawingLots {
	public static void main(String[] args) {
		int random = 1;	//버그방지를 위해 1을 초기값으로 
		int cnt = 0; 	//뽑은 횟수, 초기값 0으로 저장
		
		while (!(random % 3 == 0)) { //3의배수, 3으로 나눴을때 나머지가 0으로 되는 것, 조건문이 아니면!실행해야하니까, 논리부정연산자인 !를 앞에 붙여준다.
			cnt++;
			random = (int)(Math.random() * 100) + 1; // 1-100사이의 값을 랜덤으로 도출.
		}
	
		System.out.printf("%d번 뽑아서, %d를 찾았습니다.", cnt, random);

	}
}