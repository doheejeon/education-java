package ch05.ex02.home;

import java.util.Scanner;
//멤버변수를 자동으로 초기화되기때문에, (heap의 알고리즘) 여기서 따로 변수선언및초기화안해줘도됨
public class Main_t {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Memo_t memo = new Memo_t();
		System.out.print("메세지: ");
		memo.setMsg(sc.nextLine());
		System.out.print("발신자명: ");
		memo.setCallerName(sc.nextLine()); //넥스트라인이 먼저실행되고 그 담에쎗콜러넴실행
		
		System.out.printf("\n%s from %s", memo.getMsg(), memo.getCallerName());

}
}
/*전화 받은 메세지를 메모한다.  메모: 메시지, 발신자명 2개임 
발신자명을 메모한다. 
메모를 읽는다. (화면에 출력한다) 
--

메세지: hello 원하는대로쓰기
발신자명: terry

hello from terry. 
*/


