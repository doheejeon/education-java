package ch05.ex02.home;

public class Memo {
	private String message;
	private String senderName;
	
	public String getMessage() {
		return "Are you there?";
	}
	
	public String getFrom() {
		return "terry";
	}
	
	public void setMsg(String message) {
		this.message = message;
	}

	public void setFrom(String senderName) {
		this.senderName = senderName;
	}
}
