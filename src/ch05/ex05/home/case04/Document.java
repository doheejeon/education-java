package ch05.ex05.home.case04;

import java.time.LocalDate;

public class Document {
	private String title;
	private String story;
	private LocalDate reportDate;
	
	public String getTitle() {
		return title;
	}
	
	public String getStory() {
		return story;
	}
	
	public LocalDate getReportDate() {
		return reportDate;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setStory(String story) {
		this.story = story;
	}
	
	public void setReportDate(LocalDate reportDate) {
		this.reportDate = reportDate;
	}
}