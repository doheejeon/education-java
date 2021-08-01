package ch02.ex01;

public class C05Scope {
	public static void main(String [] args) {
		int i = 0;
		//int i = 0; //변수명은 유일해야해서 컴파일러가 에러처리함. 
		int j = 0;
		{//블럭안에 또 하나의 블럭을 만들어볼 수 있음. {} 
			//int i = 0; 자식블럭에 i를 0으로 선언해도 부모블럭에 i가 있어서 여전히 컴파일에러가 발생함
			int x = 0;
			int y = 0;	
		}
		int x = 0; //위의 변수 x를 선언했음에도 불구하고 여기서는 에러가나지 않음. 이유는 13번째줄에서  앞의 블럭이 닫혀서 끝났기때문.
	}

}
//Scope 태어나서 죽을때까지 = 시간관점
