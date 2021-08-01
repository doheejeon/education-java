package ch06.ex03.case03;
//점을 만든다. 점도 관념적인 존재이다. 실재하진 않음. 
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

/*
점: 직선과 직선이 교차하는 지점.
8,9 > 점을찍기전에 xy좌표값은 이미 존재한다! 

*/