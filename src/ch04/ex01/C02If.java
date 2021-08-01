package ch04.ex01;

public class C02If {
	public static void main(String[] args) {
		int visitCnt = 0;
		
		if(visitCnt < 1) { //두개중에하나만 실행되는 것 'exclusive'라고 한다. 
			System.out.println("첫방문입니다.");
			visitCnt++;	
		} else {
			System.out.println("재방문입니다."); 
		}
		
		if(visitCnt < 1) System.out.println("첫방문입니다.");//한줄이니까 블럭기호 생략가능
		else System.out.println("재방문입니다."); //위에 8번9번에서 방문수가 추가됐으니까 재방문입니다가 출력
	}

}
