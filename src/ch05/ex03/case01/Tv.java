package ch05.ex03.case01;

public class Tv {
	private String color;
	private boolean power;
	private int channel;
	
	public void turnPower() {
		power = !power;					//power값을 toggle합니다. 
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {			//메소드 이름은 동사로한다.
		channel--;
	}

	public String getColor() {
		return color;					//this가 없어도 됨.
	}

	public boolean isPower() {			//boolean 타입의 읽기 메시지는 is로 시작한다. 
		return power;
	}

	public int getChannel() {
		return channel;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPower(boolean power) {//this가 있어야 지역변수, 파라미터 구분가능.
		this.power = power;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
}
