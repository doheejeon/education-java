package ch04.ex02;
//덮어씌워져서 버그 생김 
public class C03Break2 {
	public static void main(String[] args) {
		int score = 96;
		char grade = 0;
		
		switch(score) { //과제, 알고리즘 창조능력훈련, score자체에 /10을 하고 십의 자리에만 관심을 둔다. 
		case 90: grade = 'A'; break; //브레이크걸리면 아예 블럭 밖으로나옴
		case 80: grade = 'B'; break; 
		case 70: grade = 'C'; break;
		default: grade = 'D';        //마지막에는 break걸면 안됨. 90점이상쓰면 D가 나오는 버그가 생김
		}
		
		System.out.println(grade);
	}

}
