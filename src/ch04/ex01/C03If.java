package ch04.ex01;
//로직을 나누고, 중복을 최소화 하는 것이 잊지말자. 
public class C03If {
	public static void main(String[] args) {
		int hour = 10; //hour값에 따라 다르게 출력된다. 
		
		if(hour < 12) {//false리턴됨.따라서 해당 블록은 실행되지앟는다.
			System.out.println("Good Morning.");
		} else if(hour < 18 ) {
			System.out.println("Good Afternoon");
		} else if(hour < 21 ) {
			System.out.println("Good Evening."); 
		} else {
			System.out.println("Good Night."); //if와 else 사이에 다른 조건문을 껴넣어서 상세하게 만든다 else if로 중간에 추가. 
		}
		
		hour = 20; //println의 중복이 많으니 가독성이 떨어진다. 한 줄에 쓸수 있는 방법, 가독성좋은 코드를 만들어보자 [논리의 시작점]
		String bow = ""; //인사말이 4개가있다는 관점으로 봤을때 , 스트링으로 선언
		if(hour < 12) bow = "Good Morning.";
		else if(hour < 18) bow = "Good Afternoon.";
		else if(hour < 21) bow = "Good Evening.";
		else bow = "Good Night.";
		System.out.println(bow); //[논리의 끝] 가독성이 좋다. 
	}

}
