package ch05.ex08.case02;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("최한석", 25, LocalDate.now()); //이미 최한석에대해알고있었음의경우
		User user2 = new User("한아름", 30, LocalDate.now());
		
		User user3= new User();
		user3.setName("양승일");
		user3.setAge(25);
		user3.setRegDate(LocalDate.now());
	}
}
/*
7>객체생성하고 객체정보를 넣어주는게 한 줄로 끝날수가있다. 
10-13> 원래 하던 방식, 일일히 데이터를 세팅해줘야함. 
객체 생성전에 (유저를 만나기전에) 이미 내가 데이터를 알고 있는 경우네는 7번메소드처럼쓰고
객체 생성후에 데이터를 세팅하는 경우는 후자.
*/