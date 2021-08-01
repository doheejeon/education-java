package ch05.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setName("늠름이");
		
		Cat cat2 = cat1.breed();
		cat2.setName("튼튼이");
		
		System.out.printf("엄마: %s, 아기: %s\n", cat1.getName(), cat2.getName());	//엄마: 늠름이, 아기: 튼튼이
		System.out.printf("엄마: %s, 아기: %s", cat1, cat2);		//엄마: 늠름이, 아기: 튼튼이 
	}
}
/*
*8> 고양이가 새끼를 낳고 그 고양이1의 리턴값은 고양이2에 담아야한다. 
*12> Cat class에서 overiding해서 11번과 같은 결과 출력.
*/