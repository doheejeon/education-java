package ch08.ex03.case01; //throws 는 사용자에게 미리 선언하는 방법이다. 

public class C06Throws {
	public void first() throws Exception {
		//try {
			second(); 		
		//} catch(Exception e) {
		//	System.out.println("Exception: first()");
		//}
	}
	
	public void second() throws Exception { //second에서 실행중에 언제든지 exception이 발생할수있어! 라고 선언부에써서 클라이언트에게 알려줌.
		third();
	}
	
	public void third() { 					//->여기서 exception이 발생하도록 한다. (그럼 second와 first모두 오염됨)
		int i = 3 / 0; 
	}
	
	public static void main(String[] args) {
		C06Throws t = new C06Throws();
		try {
			t.first(); 
		}catch(Exception e) {
			
		}
	}
}

/*
메소드 선언부에 thorws가 붙으면 클라이언트는 해당메소드 호출문을 try, catch로 감싸줘야한다.  ->first가 처리해줘야함. 
6> 12번의 throws Exception 쓰면 여기 second에 오류나서, try catch로 감싸줘야 오류제거됨. (그냥 exception이라서)
23>  //Exception: first() 출력됨

메인에서도 만약 throws를 떠넘기면 VM에서 처리한다. 
*/