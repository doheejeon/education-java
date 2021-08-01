package ch05.ex02.home02;

public class Puppy {
	private String hairColor; 		//명사
	private int age;
	private int birthday;
	private String typeName;
	
	
	public String getHairColor() {
		return hairColor;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getBirthday() {
		return birthday;
	}
	
	public String getTypeName() {
		return typeName;
	}
	
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public void protect(boolean howling) {	//protect는 동사로
	}
	
}
