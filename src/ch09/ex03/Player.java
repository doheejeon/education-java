package ch09.ex03;

public class Player extends Thread{
	private Counter counter; //방금 만든 counter를 디펜던시로 가짐. 
	
	public Player(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() { //thread 안에run메소드가 있어서 바디를 기술함.
		for(int i = 0; i < 100; i++) { //"백번동안 버튼을 누름. "
			counter.increase();
			counter.decrease();
			
			if(i % 10 == 0) counter.print(); //"10회가 지나면 현재 값을 출력해서 볼것암 "
			
			try {
				sleep((int)(Math.random() *2 )); //0.0이상 2.0미만 랜덤값 호출(0초-2초 랜덤값) 일단 1000단위가아니여도 잠을재우는게 목적.
			} catch(InterruptedException e) {}//sleep동안 방해받으면? catch블럭 실행	
		}
	}
		
		public static void main(String[] args) {
			Counter counter = new Counter();
			new Player(counter).start();  //"counter기계 1개를 3명의 사람이 공유해서 손에 쥔다. "
			new Player(counter).start(); 
			new Player(counter).start(); 
		
		}
	}



/*
15> 여기서 최대로 자는 시각은 0.01초
26> 하나의 counter를 3명의 player가 공유해서 값이 엉망진창으로 나옴 
	-> 해결책  줄세우기que, 잠그기 lock하면됨.  
	
*/