package ch05.ex05.case09;

public class Main {
	public static void main(String[] args) {
		Baker baker = new Baker();
		
		Bread bread = baker.bake();
		baker.stickPrice(bread, 2000);
		
		System.out.println(bread);  //2000
	}

}
/*
5> bread는  new로 생성하면안됨 = baker가 참조하고있어서 
7> "2.그 튀어나온빵을 변수 Bread에 담는다 = 1.제빵사가 빵을 굽는다 "
8> 리턴값이 void여서 앞에 지정ㅎ는 지역변수를 설정하지 않는다.
*/
