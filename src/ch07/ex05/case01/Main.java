package ch07.ex05.case01;
//"function도 '값'이다" 라고 생각하자. functions = method like,객체도 값이다. 
public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("hello"); //function메서드가 한개라서 이름을 생략해도 정의가 가능.
		human.say();
	}
}

/*
say function이 값이 된 이유는 -> 빅데이터의 시대라 그렇다. 

*/