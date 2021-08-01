package ch06.ex02.case02;

public class Friend {
	public void play() {
		Parent parent = new Parent();		//부모가 친구집에감.= new parent로 표현
		
		//parent.getRegNumber();			private으로 감춰져있어서 호출불가. 
		parent.getName();
		parent.getMoney();
		parent.addMoney(1000);
		
	}

}
