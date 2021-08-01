package ch05.ex05.case08;

public class Cat {
	private String name;
	
	public Cat breed() {
		return new Cat();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
/*
*6>"고양이가 새끼낳는 것에 관심을 갖는다"
	
*새끼르 ㄹ낳으면 고양이가 생성돼야하니, 6번의 리턴타입은 Cat으로 들어가야한다 = 캣클래스내에서 캣클래스를 데이터타입으로 쓸 수 있다.
*/