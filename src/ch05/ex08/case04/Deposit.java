package ch05.ex08.case04;

public class Deposit {
	private int balance;

	public Deposit() {
		//this.balance = 1;
		//this(1, 0); 혹은
		this(1);
	} 
	
	public Deposit(int principal) {				//잔금이 있어야하니 파라미터로 잔금을 넣어줌 
		//this.balance = principal;				//계좌를 만들자마자 잔액이 존재함.
		this(principal, 0);						//실제로는 이렇게 쓰는것이 논리를 해침. 
	}
	
	public Deposit(int principal, int interest) {
		this.balance = principal + interest; 	//계좌르 ㄹ열고 동시에 이자를 준다고할때 
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}			
	
	
	
	

}
/*
4>예금잔액으로 통장을 구분한다"
6> 예금계좌로 최소한의 돈을 지불해야할때 this.balance = 1;
6> "기본계좌를 개설하겠다 1억"
10> "원금을 따로 정하겠다."
14>"vip손님용, 예금을 얼마하면, 이자를 준다. "

*/