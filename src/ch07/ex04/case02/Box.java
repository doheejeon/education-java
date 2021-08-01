package ch07.ex04.case02;

public class Box {		//generic method를 경험해보자. 
	public <T> T getLastVal(T[] arr) {	//generic method 선언은 여기서, 접근제한자를쓰고 <>써줌. "T라는 generic type을 해당 메서드내에서 쓸수있다. 
		return arr[arr.length - 1]; 		//어떤 타입의 배열이 들어오든 마지막 인덱스의 값을 리턴하는 알고리즘 
	}
}


/*
generic method를 통해 '확장성'을 확보할 수있다. 
5>어떤값을 넣어도 이 알고리즘덕분에 마지막값을 구할 수있다.
*/