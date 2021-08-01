package ch09.ex01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class C02Executor {
	public static void main(String[] args) {
		Runnable r1 = () -> {  		//runnable의 값은 커서 이렇게 lamda로 기술해야한다. 
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		};
		
		Runnable r2 = () ->{
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c +  " ");
		};
		
		Executor executor = Executors.newCachedThreadPool(); //스레드를 담을 pool을 만들어서 executor에 담는다.
		executor.execute(r1); //execute는 러너블타입의 값을 쓰레드로 랩핑해서 작동시켜준다. 
		executor.execute(r2);
		
		
	}
}
