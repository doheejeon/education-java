package ch05.ex02.home02;
//스마트폰 객체 디자인. 선생님버전 , 세부묘사를 멤버변수로 한다./ 객체를 구분해주는 속성으로 멤버변수를 구성해도된다.
public class SmartPhone2 {		//멤버변수는 중요한 순으로 쓴다. 
	private String phoneNumber; //유저입장에서 가장 중요한 변수.
	private int imei; 			//스마트폰의 주민등록번호같은 값,*#06#
	private String brandName;
	private String makerName;
	private int price;
	//10번부터 멤버메소드. 
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public int getImei() {
		return imei;
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public String getMakerName() {
		return makerName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setImei(int imei) {
		this.imei = imei;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void dialUp(String phoneNumber)	{			//핸드폰이 하는 기능을 디자인. 전화를 거는 것은 void로 하고 우선 public으로 세팅. 
														//50번 string phonenumber는 행동을할때 꼭 있어야하는 것 즉 파라미터를 집어넣는다.
	}
	
	public String recevieMsg() {					//메세지를 읽는것 , 리턴타입이 void가 아니면 바디안에 리턴 명령이 필수. 우선 55번줄처럼 한다. 
		return "";
	}
	
	

}
