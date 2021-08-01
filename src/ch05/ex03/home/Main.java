package ch05.ex03.home;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.setName("최한석");
		student1.setAge(25);
		
		student2.setName("한아름");
		student2.setAge(30);
		
		student1.washUp();
		student2.study();
	}
}



//최한석과 한아름은 공시생입니다. 
//한석이는 25살이고, 아름이는 30살입니다.
//한석이는 이제 막 일어나서 세수를 합니다. 
//아름이는 공부를 합니다. 


