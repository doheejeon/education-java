package ch08.ex03.case01; //C02에 이어 try 문법을 확장하여보자 - 디스크와 IO해본다. 지금까지는 메모리상의 IO만 해왔음.

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03TryCatchFinally {
	public static void main(String[] args) {
		PrintWriter out = null; 					//printwriter를 이용해 '파일'에 write할 수 있다.
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("c:/DEV/a.txt")); 	// "프린터라이터로 파일라이터를 랩핑하고 그것을 아웃변수에 담는다."
			
			for(int i = 0; i < arr.length; i++)
				out.println("arr[" + i + "]: " + arr[i]);
		} catch(ArrayIndexOutOfBoundsException e) {
			out.println("배열에서 exception이 발생했습니다."); 	//로그를 남김. 
		} catch(IOException e) {	//->13에서 오류가 나면 이 블럭 실행.
			System.out.println("IOException이 발생했습니다."); 	//여기의 out은 Console을 대리하는 아웃객체임. 
		} finally {							//try 블럭중에 꼭 실행하고싶은 명령문이 있다면 finally블럭안에 기술한다. try가 실행해서 실패하든 성공하든 무조건 실행하고싶은 명령문finally로 
		  if(out != null) out.close(); 		//위에서 성공하든 실패하든 out객체를 죽임. garbage collector와 다르게 즉시 죽여버림. 
		}
		
		System.out.println("끝.");
	}
}

/*
11> 파라미터로 만들어질 a.txt를 넣고(만들어짐)->  데이터를 파일에 쏟아넣을 수 잇게 됨. 
22>out.close(); out객체가 있다는 전제하에 클로즈하는거니까  if(out != null)아웃객체가 있는지없는지부터 앞에 써준다. 
이 클래스를 통해 콘솔이 아닌 다른 데이터로 저장이됐다. 
Console이 아닌 다른 파일에 기록하는 이유: 저장하고 보관가능. 
*/