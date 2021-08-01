package ch02.ex02;

import java.time.LocalDate; //컨트롤쉬프드오로 불러오기 클래스를 
import java.time.LocalTime;

//날짜를 다루는 방법 , 이걸로 접속한 시간이나 그런 것을 구현할 수 있음. 날짜와 시간을 다룰땐 이런 메소드를 쓰자 
public class C06Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); //now의 기준은 vm이 실행되고 있는 기준임 바로 지금 호출되는 시점.
		LocalTime time = LocalTime.now(); //crtl+shifto로 위에 import해와야함 
			
		System.out.println(date); 
		System.out.println(time);
	}

}
