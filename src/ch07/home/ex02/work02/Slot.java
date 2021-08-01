package ch07.home.ex02.work02;

import java.util.ArrayList;
import java.util.List;

public class Slot {
	private List<Ball> balls;			
	
	public Slot() {
		balls = new ArrayList<>();
		
		for(int i = 1; i <= 45; i++) 
		balls.add(new Ball(i));
	}
	
	public Ball chuck() {
		int i = (int)(Math.random() * balls.size());	
		return balls.remove(i);				
	}
}