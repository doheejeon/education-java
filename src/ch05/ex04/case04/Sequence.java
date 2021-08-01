package ch05.ex04.case04;
//중복되지 않는 값을 순차적으로 생성하는 객체를 Sequence라고 한다. ex) 번호표 
public class Sequence {
	private static int currentNum;
	
	public static int nextNum() {
		return currentNum++;
	}
	
	public static void setCurrentNum(int currentNum) {
		Sequence.currentNum = currentNum;
	}

}
/*
* 4> 번호표를 뽑아내는 기계는 공용으로 쓰는 것이니까 static으로 선언 
* 6> 다음숫자를 뽑아오는 것. 
* 7> 리턴값은 4가 아니라 3이된다. 쁠쁠연산자가 뒤에있기때문에. 만약쁠쁠이 앞에있으면 4가 리턴됨 
* 10> 시작값을 정해주기 위해 세터설정, 설정안하면 0부터 시작 
*/