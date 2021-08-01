package ch07.ex02.case15;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set);	//[1, 2, 3]
		
	}
}

/*
set 이라는 interface 는 바로 '집합'이다 
set은 중복 값을 저장하지 않는다. 중복제거된다. 
List는 각각의 데이터가 인덱스로 구분돼서 중복허용되지만(key, value로 관리한다.) 
key는 유일한 값이여야하며 value는 중복이 상관없다. ex) key: 주민번호 value: 이름  
set같은 경우 key를 갖고있지않고 value로만 데이터를 관리해서 중복이 제거되므로 인덱스로 불러올 수 없다. (즉 인덱스가 없다) 
	


*/