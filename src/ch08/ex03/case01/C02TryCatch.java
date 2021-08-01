package ch08.ex03.case01;

public class C02TryCatch {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			int result = arr[10]; 						//exception발생 기대됨. try실행으로 예외처리. try는 exception이 발생하는지 유무를 보는 거다.
		} catch(ArrayIndexOutOfBoundsException e) { 	//위 try블럭안에서 exception객체가 생성되면? array~ 어쩌고 오류가 발생하면 e라는 변수에 담겠다. 
			System.out.println("Exception 발생했습니다.");//그 e에 담길 내용을catch 블럭안에 기술해주면된다.
		}
		
		System.out.println("끝."); 						//위에서 앱이 죽지않도록해서, 13번 명령줄은 무조건 실행된다. 
	}
}


/*
실행결과 ----
Exception 발생했습니다.
끝.
---------------------

try문법을 쓰는 것 보다 if 로 아예 논리를 깨끗하게 써주는 것이 낫다.
	간혹 네트워크문제로 error가 생길 경우(내가 어찌할 도리가 없음) 그럴땐 try로 쓰는 것. => 기록(시간)을 남기기위해 exception 처리 try를 쓴다.
																		=log 남기기위해. 
*/