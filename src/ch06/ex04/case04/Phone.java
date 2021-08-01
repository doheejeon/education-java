package ch06.ex04.case04;

public class Phone {
	private String modelName;
	
	public Phone(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public boolean equals(Object obj) {		//object클래스와 동일하게 메소드를 써줌.
		boolean isEqual = false;
		
		if(obj instanceof Phone)			//1. 우선 물건이 전화기인지 확인이되면?
			isEqual = modelName.equals(((Phone)obj).modelName); 		//2. 그다음에 캐스팅 , 여기서equals는  string 타입에서 온 것.(문자열의 내용을비교)
		
		return isEqual;
	}
}
/*
14> 비교의 전제는 둘 다 '핸드폰'이라는 것이다. 
instanceof 연산자는 뒤에 클래스이름과 같이온다. 
객체 instanceof 클래스 ->이렇게 사용한다. 객체가 해당클래스를 갖고있으면true, 없으면 false 리턴된다.
해당객체가 갖고있는 데이터타입을 조사하는 연산자 = instanceof 
intanceof의 리턴값은 boolean 
파라미터로 받은 객체가 전화기인지먼저 검사한다. 
자식클래스가 부모클래스로 변환하면promotion이라한다. 
*/