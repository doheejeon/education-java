package ch07.ex01.case06;

public class Main {
	public static void main(String[] args) {
		Human human = new Student();			//학생이 1명 출석.
		human.sleep();
		
		Student student = (Student)human;		//학생이됩니다.
		student.study();
		student.sleep();
	}
}
