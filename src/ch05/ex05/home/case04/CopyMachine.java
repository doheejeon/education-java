package ch05.ex05.home.case04;

public class CopyMachine {
	public Document copy(Document document) {
		Document document1 = new Document();
		document.setTitle(document.getTitle());
		document.setStory(document.getStory());
		document.setReportDate(document.getReportDate());
		
		return document1;
	}
	


	
}