package ch05.ex05.home.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Document document = new Document();
		CopyMachine copymachine = new CopyMachine();
		
		document.setTitle(Console.inLine("제목"));
		document.setStory(Console.inLine("내용"));
		document.setReportDate(LocalDate.now());
		
		System.out.println("문서가 작성되었습니다.\n복사합니다.");
		
		Document doc1 = copymachine.copy(document);
		Document doc2 = copymachine.copy(document);
	
		
	}
}
/*
원본 문서를 작성한다.
문서 내용은 제목, 내용, 작성일이다.  
제목과 내용은 수동입력, 작성일을 자동입력한다. 

위 문서1장을 복사기로 복사해서, 
복사본 2장을 만든다. 
--

제목: (입력) 태백산맥
내용: (입력) 빨치산도 대한민국의 역사이다. 
작성일 : 자동입력

문서가 작성되었습니다. 복사합니다.

*/