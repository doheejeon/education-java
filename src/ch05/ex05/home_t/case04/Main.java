package ch05.ex05.home_t.case04;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Document document = new Document();
		Copier copier = new Copier();
		
		document.setTitle(Console.inLine("제목"));
		document.setContent(Console.inLine("내용"));
		document.setWrittenDate(LocalDate.now());
		
		//System.out.println("작성일: " + document.getWrittenDate());
		System.out.println("문서가 작성되었습니다.\n복사합니다.");
		
		Document doc1 = copier.copy(document);			//위에서 만든 내용을 복사한다.
		Document doc2 = copier.copy(document);
	}
}
