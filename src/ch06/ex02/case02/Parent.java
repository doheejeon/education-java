package ch06.ex02.case02;

public class Parent {
	private String regNumber;
	private String name;
	private int money;
	
	private String getRegNumber() {
		return regNumber;
	}
	
	public String getName() {
		return name;
	}
	
	protected int getMoney() {
		return money;
	}
	
	void addMoney(int money) {
		this.money += money;		//돈을 누적시킨다. 
	}
}
