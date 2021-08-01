package ch09.ex04;

public class Buffer {
	private Integer value; //초기값 null이 세팅되어있음.
	
	public synchronized int remove() {
		while(value == null) { 	//value 가 읽을값이 없어 null이면? "기다린다"/ value에 값이 있으면 try블럭은 실행안한다.
			try {
				wait();  //object 클래스에 있는 wait -> wait를 호출한 쓰레드가 wait한다.
			} catch(InterruptedException e) {}
		} //value값이 있어서 while을빠져나오면 아래가 실행
		
		int value = this.value;
		this.value = null; //값을 가져갔으니, 멤버변수는 null로 만들어준다.
		
		notifyAll(); //특정쓰레드를 지정하지않고 모든 쓰레드가 들을 수 있도록 불특정 다수를 깨움->그중꺠어나는 쓰레드가 대기큐에  들어감 
		
		return value;
	}
	
	public synchronized void add(Integer value) { 
		while(this.value != null) {	//value가 채워져있으면? wait으로 들어간다. 위랑 반대.
			try {
				wait();
			} catch(InterruptedException e) {}
		} //값이 없음이 확인되면 while을 빠져ㅏ옴
		
		this.value = value;
		notifyAll(); 
	}
}

//remove블럭에서 notifyall은 add하려고 대기중인 쓰레드를 깨우기위해, 에드에서는 리무브하려고 웨잇중인 쓰레드를 꺠우기 위해 노티파이함 
//21>만약 값이 있으면 ? 그 값은 4번줄의 valuel에 들어가있다가 22번줄 조건이(값이 null)충족되지않아서 28번으로 넘어오고 그 값을 꺠어난 쓰레드가 가져간다.