package ch03.ex02;
 //논리부정연산자는 피연산자가 boolean임 , int로 연산못합니다. 
public class C02Not {
	public static void main(String[] args) {
		boolean power = false; //전원이 꺼져있다! 로 생각하면 되겠다.
		power = !power; //파워에서 폴즈를 읽고 트루를 만들어내서 파워에 넣는다.논리부정은 단독으로 쓰지 못한다.
		System.out.println(power); //true 출력
		
		power = !power;
		System.out.println(power); //false
		
		
		
		
		
	}

}
//두가지 변수만 가지는 경우는 flag 변수라고 말한다. 두 값사이에서 전환되는, 전원의 on/off 플래그변수를 다루는 알고리즘을 toggle이라고 한다.