package ch05.ex01.case01;
//여기서 데이터는 5개가 된다. int의 변수 12,35,30 그리고 time의 new time 2개 = 5개 
public class Main {
	public static void main(String[] args) {
		int hour = 12;
		int minute = 35;
		int second = 30;
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		
		Time time = new Time(); 	 //new=새로운 객체를 만들거야 , 오른쪽의 객체 주소값을 읽어서 왼쪽 time 에 입력된다	.'타임객체'
		time.hour = 12;				 //time 변수 hour공간에 12를 넣겠다.  12는 hour에 두세요.
		time.minute = 35;
		time.second = 30;			//결국 3개의 데이터를 하나의time공간에 넣은 것. 
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		
		Time time2 = new Time(); 	//두번째 새로운 객체(데이터)를 만들거야. 
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		System.out.printf("%d시 %d분 %d초\n", time2.hour, time2.minute, time2.second);
		
		System.out.println(time2); 	//time2의 주소값. 1b6d3586 = hashcode. 
		System.out.println(time2.toString()); //객체주소값을 갖고있는 지역변수가 println에 들어오면22번처럼써도되지만 23번줄과 같은 형태로 실행됨
		
		System.out.println(time); //23번과 해쉬코드가 다름 = 서로 다른 객체
	}

}
