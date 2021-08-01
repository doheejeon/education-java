package ch06.ex05.case07;

public class Main {
	public static void main(String[] args) {
		int inVal = 1;
		
		switch(inVal) {
		case 1: 
		case 2:
		}
		
		switch(inVal) {		//코드를쓰면 7번블럭보다 훨씬 가독성좋아진다.
		case Code.USER_ADD:
		case Code.USER_DEL:
		}
	}
}
