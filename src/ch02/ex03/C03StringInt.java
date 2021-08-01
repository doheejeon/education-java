package ch02.ex03;

public class C03StringInt {
	public static void main(String[] args) {
		int i = 1;
		String str = "" + i; //+는 여기서 붙이기 연산자. str에는 문자1이 저장됨.
		System.out.println(str); //문자 1출력
		
		str = "1"; //6번은 수식에 리턴값을 넣었고 9번은 상수에 넣음
		i = Integer.parseInt(str);//str이 갖고있는 문자1을 parseInt가 파라미터로받아서 바꿔서 숫자1로 리턴함. Int로 바꿤
		int result = i + 1;//.result값을 넣어서 위에 넣은 str 값이 문자가아닌 숫자1임을 확인할 수있음.
		System.out.println(result); //i를 넣을땐 7번의 1은 스트링타입의 1, 11번은 숫자 1
		
		
		
		
	}

}
