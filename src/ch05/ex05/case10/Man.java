package ch05.ex05.case10;

public class Man {
	public void strip() {}
	public void wash() {}
	public void wear(Pajamas pajamas) {}
	public void lie() {}
	
	public void sleep(Pajamas pajamas) {
		this.strip();
		this.wash();
		this.wear(pajamas);
		this.lie();
		
	}
}



/*
'자다'를 4가지 행동으로 세팅해둠
4> 옷을 벗어요
5>씻어요
6> 파자마를 입어요 ( 파라미터로 파자마를 준비한다) ->public void wear(Pajamas pajamas) 
7>누워요 

멤버메소드에서 멤버메소드를 쓸 수 있다.
9>원래 4줄짜리 메소드를 통합해서 sleep으로 만들고 그 안에 때려넣기
10> 나의멤버.명령(); "this.strip();"
*/