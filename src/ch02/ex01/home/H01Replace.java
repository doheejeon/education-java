package ch02.ex01.home;
                        //short name H01Replace , Full name :ch02.ex01.home.H01Replace
public class H01Replace {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("a:%d, b:%d\n", a, b);
		
		int tmp = 0;
		tmp = a; //tmp에 a값을 백업해두는 과정
		a = b;
		b = tmp;
		System.out.printf("a:%d, b:%d\n", a, b);  //tmp변수에 잠깐 1를 저장해놔야 아래처럼 도출가능 
		
		
	}
} 

