package ch05.ex08.case04;

public class Main {
	public static void main(String[] args) {
		Deposit deposit1 = new Deposit();			
		Deposit deposit2 = new Deposit(2);		//2억짜리만들게요
		Deposit deposit3 = new Deposit(3, 1);		//'vip용'3억짜리만들게요, 이자 1억
		
		System.out.printf("%d, %d, %d",
				deposit1.getBalance(), deposit2.getBalance(), deposit3.getBalance()); //1, 2, 4
	}
}
