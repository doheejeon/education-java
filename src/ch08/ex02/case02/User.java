package ch08.ex02.case02;
//레벨도메인을 이용하느 ㄴ또다른 User도메인을 만든다.
public class User {
	private String name;
	private Level level;
	
	public User(String name, Level level) {
		this.name = name;
		this.level = level;
	}
	
	public void upgradeLevel() { //도메인스스로할 수 있는 업그레이드 업무로직 구현.
		Level nextLevel = level.next();
		
		if(nextLevel == null)		//승일 등업시 null뜨는 오류 해결하는 과정. 15~
			throw new  IllegalStateException("이미 최고 등급입니다.");
		else this.level = nextLevel; //16번의 조건이 아니면, nextLevel값을 level에 저장한다. 
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", name, level); //format을 이용해 내가 원하는 형식으로 리턴되게한다.
	}
}


/*
16>IllegalStateException() 이 객체를 쓴다. 오류해결위해서  '오류'를 객체로 만든다.

*/