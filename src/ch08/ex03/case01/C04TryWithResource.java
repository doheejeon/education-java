package ch08.ex03.case01; //발전한 try문법. 자원관리객체 

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C04TryWithResource {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		try( 	//try가로안에 리소스생성할 코드를 넣는다.
			PrintWriter out = new PrintWriter(new FileWriter("c:/DEV/1.txt"));
			PrintWriter out2 = new PrintWriter(new FileWriter("c:/DEV/2.txt"));
		){
			for(int i = 0; i < arr.length; i++) {
				out.println("arr[" + i + "]: " + arr[i]);
				out2.println("arr[" + i + "]: " + arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 exception이 발생했습니다.");
		} catch(IOException e) {
			System.err.println("파일 exception이 발생했습니다."); //메세지가 빨간색으로 나타남.
		}
		
		System.out.println("끝.");
	}
}


/*
catch로 예외처리할땐, 상속관계를 주의해서 맨 위에 부모를 두지않아야한다. 

*/