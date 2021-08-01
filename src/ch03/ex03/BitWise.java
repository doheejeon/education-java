package ch03.ex03;
//잊어도됨.  비트전환연산자
public class BitWise {
	public static void main(String[] args) {
		int x = 10;
		System.out.printf("%s, %d\n", Integer.toBinaryString(x), x); //1010(보이지않는 28개의 0이 생략됨),10 으로 출력 
		
		x = ~x; // ~모양이 비트전환연산자. 0은1로 1은0으로 전환시킴. 
		System.out.printf("%s, %d\n", Integer.toBinaryString(x), x); //기계를 작동시킬때 자주 쓰는 거라 내가 쓸 일은 별로없음.	
		x = x + 1;
		System.out.printf("%s, %d\n", Integer.toBinaryString(x), x); //더하기 1을 함으로써, 음수값을 받을수도있는 알고리즘. 1.비트전환시키고2.더하기1을하면됨 
	}

}
// 기계를 작동시키는 목적으로 만들어진 소프트웨어를  embeded system라고 한다 . 지하철 버스에서 카드태깅하는 것. 냉장고의 온도  