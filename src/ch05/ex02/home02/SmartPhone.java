package ch05.ex02.home02;

public class SmartPhone {
	private String message;
	private int phoneNumber;
	private String birthdayDate;
	private boolean power;
	
	
	public String getMessage() {
		return message;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getBrithdayDate() {
		return birthdayDate;
	}
	
	public boolean isPower() {
		return power;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setBirthdayDate(String birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	

}
