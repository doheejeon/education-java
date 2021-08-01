package ch07.ex01.case09;

public class Main {
	public static void main(String[] args) {
		AppleCar appleCar = new AppleCar();
		GoogleCar googleCar = new GoogleCar();
		
		TeslaCar car = new TeslaCar(appleCar);
		car.start();
		car.stop();
		car.klaxon();
		
		car.setSoftware(googleCar);
		car.start();
		car.stop();
		car.klaxon();
	}

}
/*
5-6> 소프트웨어준비. 
8> 테슬라에서 테스트카를 만들때 위의 두개의 회사중에서 애플로둔다면, 애플의 방식으로 작동한다. 
13> 구굴의 소프트웨어를 넣으면 구글의 방식으로 작동한다.

*/