package ch06.ex04.case07;

public class ShinhanBank extends KoreaBank {
	public ShinhanBank(double rate) {
		super(rate);				//신한이 한국은행의 이자 멤버변수를 이어받음. 
	}
	
	@Override
	public double getRate() {
		return super.getRate() + 0.01;			//해당뱅크를 나는 코리아뱅크로볼거야 ->하는 관점에서볼때 super를쓴다. *단 객체는 1개 불변.
	}
}
/*
11> "신한의이자는 한국은행 이자의 0.01 더한다. 

*/