package ch08.ex01;

@Type(name= "nihao", value= 1) //type에서 지정한대로 속성 name과 value의 속성값을 나열해줘야한다., '주석'이라서 메타데이터임.
public class MyClass {	//-> 이게 Type임.
	@Field(value=1) //속성명 밸류는 기본이라 @Field(1)만 적어도됨. 
	private String name; //-> 이게  Field임.
	
	@Constructor		//target위치를 벗어나 다른 곳에 쓰면 컴파일러오류뜬다.
	public MyClass() {
		
	}
	
	@Method
	public void play(@Param String parm, @Param int duration) {
		@Local int i = 0;
	}
	
	
}


/*
apple은 데이터고 알파벳은 메타데이터이다. 

annotation읽는 방법은 나중에 현장에 가서 필요하면 따로 공부하기 
annotation을 쓰는목적: 메타데이터를 기술하기위해
	 과거에는 메타데이터를 엑셀파일에 따로 기술함 ->불편해서 소스코드로 메타데이터개발하려고
	 어노테이션이 등장했다. 
*/