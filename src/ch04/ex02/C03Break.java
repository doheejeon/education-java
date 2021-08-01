package ch04.ex02;
//덮어씌워져서 버그방지
public class C03Break {
	public static void main(String[] args) {
		int score = 96;
		char grade = 0;
		
		switch(score / 10) { //과제, 십의자리에만 관심을 두겠다. 몫을 리턴하니까, 나누면 십의자리숫자만도출됨 
		case 10: case 9: grade = 'A'; break; //브레이크걸리면 아예 블럭 밖으로나옴, 100점을 위해 케이스앞에 또다른케이스 추가가능
		case 8: grade = 'B'; break; 
		case 7: grade = 'C'; break;
		default: grade = 'D';        //마지막에는 break걸면 안됨. 90점이상쓰면 D가 나오는 버그가 생김
		}
		
		System.out.println(grade);
	}

}
//break는 자신이 소속된 블럭을 빠져나온다. 단 if블럭은 빠져나오지않는다. 