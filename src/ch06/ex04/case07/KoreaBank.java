package ch06.ex04.case07;

public class KoreaBank {
	private double rate;
	
	public KoreaBank(double rate) {
		this.rate = rate; 						//"한국은행을 금리를 정하는 곳으로 보는 관점이다"
	}
	
	public double getRate() {
		return this.rate;
	}

}
