package ch03.ex04;
//소숫점 연습
public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592; //무한한 파이값.
		//소숫점 한 자리로 조정하고싶을때.
		double shortPi = (int)(pi * 10) / 10.0; //1.더블을 int로 캐스팅하면, 31로 리턴됨 2.(31)을 더블 10.0으로 나누면(/)3.1이 보전됨.
		System.out.println(shortPi);//3.1출력.
		//소숫점 세자리 조정하고싶을때.
		shortPi = (int)(pi * 1000) / 1000d; // 7번과 똑같이 조정하고싶은 자릿수만큼 인트로 곱한 후 더블타입의 1000으로 나눠준다~ 
		System.out.println(shortPi); //3.141출력 마찬가지로 5번과 7번의 공통점을 캐치해서 알고리즘으로 만들어 다양한 활용이 가능하다.
		//반올림 처리! 선생님이 생각하신 알고리즘
		shortPi = Math.round(pi * 1000) / 1000d; //round의 리턴값이 long, 더블로 
		System.out.println(shortPi); //3.142출력. 3141.592에서 머리부분 3142.0으로 나오는 것. , 뒤에 1000d로나눠주면 반올림해서 나오는 값.3.142출력
		
	}

}
