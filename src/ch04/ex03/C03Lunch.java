package ch04.ex03;
//밥을 먹는다를 숫자로 표현한다면 kcal로 표현할 수 있다. 
public class C03Lunch {
	public static void main(String[] args) {
		int calorie = 0;
		int food = 0;
		
		
		while(calorie < 30) {		//배고프면? 30칼로리미만이면 배고프다
			food = (int)(Math.random() * 10) + 1;//1-10칼로리의 음식중 랜덤으로 음식을 집음
			
			if(food % 5 ==0) {			//5의 배수는 상한 음식으로 가정할때, 
				System.out.println("상한 음식을 뱉다.");
				break; 					//상한 음식을 먹으면 브레이크로 빠져나온다. break는 if블럭을 무시하고 while블럭만 본다.
			}
			calorie += food; 		//음식을 먹는다, 칼로리가 증가함을 표현
	}

			System.out.println(calorie + "cal. 만큼 먹었습니다.");

	}
}