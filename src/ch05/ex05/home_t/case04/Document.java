package ch05.ex05.home_t.case04;

import java.time.LocalDate;
//도메인 디자인은 캡슐화 
public class Document {
	private String title;
	private String content;
	private LocalDate writtenDate;
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public LocalDate getWrittenDate() {
		return writtenDate;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setWrittenDate(LocalDate writtenDate) {
		this.writtenDate = writtenDate;
	}
}
