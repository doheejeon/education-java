package ch06.ex05.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		
		console.out();		//println() 으로 출력하다.
		browser.out();		//HTML로 출력하다.
		
		UI.in(); 			//static메소드는 class. 으로 호출한다. 
		//console.in();
		//browser.in();
		//Console.in();
		//Browser.in();
		
		System.out.println();	//줄바꿈
		Chrome chrome = new Chrome();
		//chrome.in();
		chrome.out();
		
		chrome.play();
		Chrome.play();
		Browser.play();
		
	}

}
/*
12,13> 에러의 이윤, UI interface에서 static은 상속이 안된다. default는 가능. 
	즉 지금 console 과 browser에는 in메소드가 없다. 12-15가 모두 에러남.
22-24>	단 일반클래스가 갖고있는 static메소드는상속이된다.

*/