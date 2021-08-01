package ch05.ex08.case01;

public class Baby {
	private String name;
	
	public Baby() {}		//'기본생성자' 수동추가도 가능.

	public Baby(String name) { 	//베이비를 오버로딩합니다. 인스턴스 초기화 = 멤버변수의 값을 집어넣는것 
		this.name = name;		//파라미터에 생성자를 넣어줌 =  이야기에따라 내가 생성자를 골라서 객체를 만들어줄수있다. 객체생성전에 내가 이미 데이터를 알고있는 경우에씀
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
/*


*/