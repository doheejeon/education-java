package ch05.ex08.case03;

public class Citrus {
	private String name;
	
	public Citrus() {
		//this.name = "천혜향"; //1."손님이 그냥 귤달라고하면 기본으로 천혜향을 줘야지 했을때 " 
		//new Citrus("천혜향"); //2.손님이 그냥 귤달라고하면 난 천혜향을 줘야지. 메소드안에서 메소드호출
		this("천혜향");			//디스에 들어가있는 데이터타입은 '시트러스'
	}
	
	public Citrus(String name) {
		this.name = name;
	}

	public String getName() {//컴파일러는 파라미터로 자동으로 Citrus this가 들어가게한다
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
/*
7> 이렇게쓰면 다른 줄의 this.name = name과 중복된다. 
8> new 생성자로호출해서 객체.메소드 로 문법을 맞춰준다. 과제-> Citrus("천혜향")에 new를 붙여준다.
    ->하지만 main을 통해 출력하면 null나옴. 여기의 뉴시트러스가아니라 메인꺼여서. 
 9> "a생성자에서 b생성자를 부르고싶어요 "- "this생성자호출문 " -> 여기서 this는  어떤객체를 담고있는게 아니고 
 		this( ) 이것은 ()입니다. 
   this를써도 다같은 생성자이름을써서 알아볼 수 있음. 동일한 citrus를 쓰고있음 
*/