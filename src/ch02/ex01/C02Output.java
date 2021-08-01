package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {	
		int score = 100;
		System.out.println(100); //parameter 매개변수 (가로)에 들어가있는 모든 것을 매개변수라고 한다. 
		System.out.println(score); //변수
		System.out.println(100+1); //수식, expression 연산자가 포함된 수식
		System.out.println(Math.random()); // method를 call했다.  
		
		System.out.print(200); 
		System.out.print(300);
		System.out.print("\n"); //줄바꿈 \n  역슬래시를 back slash 라고 함. <특수문자>업무상직접사용하지 않아서 특수문자로 불림. '엔터문자'
		System.out.print(400);
		System.out.print("\n"); //혹은 System.out.println();도 가능 
		System.out.printf("%b, %c, %d, %.1f, %s\n", true, 'a', 10, 1.15, "hello"); //앞 변수가5개니까 뒤의 빈칸도 동일하게 5개 넣어줘야한다. , f에는 앞에 .1 등으로 자릿수를 정해줄 수 있음.  뒤에 \n을 넣어줄바꿈
		System.out.printf("%5b, %-5c, %5d, %5.2f, %5s", true, 'a', 10, 1.15, "ear"); //자릿수를 5자리로 하고싶을땐 앞에 쓰면됨. -5를 달아서 왼쪽정렬함, %5.2f는 소숫점이2자리포함5자리를할당/ 
		//format string. 첫번째는 string. %가 붙어있는 문자는conversion이라고 부른다(빈칸), 그외에 문자는 콘솔에 출력.
		String name = "차은우";
		int age = 22;
		System.out.printf("\n%s는 %d살입니다.", name, age); //문장도 하나의 정보가 될 수 있음. 
		System.out.printf("\n%s는 %d살입니다.", "박보검", 29); //응용! 
		System.out.println();
		System.out.println(name + "는 " + age + "살입니다."); //printf가 없었을 때 21번 커맨드를 이렇게 쓸 수 있음. 붙이기 연산자.
		//피연산자가 숫자일땐 더하기연산자, 피연산자가 하나이상이 문자면 붙이기연산자. 
	}
}
