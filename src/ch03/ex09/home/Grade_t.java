package ch03.ex09.home;
//logic을 나누는 이유는 유지보수가 쉽기때문이다.
import java.util.Scanner;

public class Grade_t {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		                     //입력을 받을 변수를 먼저 입력한다. 변수이름을 줄일땐 보통 단어의 앞3,4글자만뜯어냄 / 데이터선언이 먼저 돼야함 중요하다.
		int kor = 0; //약자를썼을땐 주석으로 '국어'처럼 설명해준다. (for.유지보수하는사람들
		int eng = 0; //영어
		int math = 0;//수학
		int total = 0;//toatl 'tot' 총점
		double avg = 0;//average는'avg' 평균, 실수가 나오는경우가있어서 double로 선언 
		char grade = 0; //학점
		                     // presentation logic '논리' 이라고 한다. 입력받는 성격으로 다음문단 작성 / 입력
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		                     // business logic 처리내용을 다음문단에 작성
		total = kor + eng + math;
		avg = total / 3.0; //3뒤에 .0을 붙여줌으로써 오류방지 
		grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : 'C';
		                    //출력을 다음문단에 작성
		System.out.printf("\n총점: %d\n평균: %.1f\n학점: %c", total, avg, grade);
	}

}
