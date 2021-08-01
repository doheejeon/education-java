package ch03.ex08;
//&& 연산자와 || 연산자 
public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;  //true
		b = (2 > 1) && (2 > 1); //true  양쪽 실행하는 리턴값이 모두 true여서 true가 출력된다. 가독성을위해 가로를 쓰자.
		b = 2 < 1 && 2 > 1; //ture&&true빼고는 모두 false 출력 
		b = 2 < 1 || 2 > 1; // ||연산자는 하나의 값이 true면 true출력.
		b = 2 < 1 || 2 < 1; // 둘 다 false 니까 false 출력.
		System.out.println(b); //빠른연산자라고도 부른다
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0;// x:1, y:0, b:false &&연산자는 하나만 false여도 false로 리턴돼서, ++x < 0 계산식에서 이미 false가 출력됐으니, 뒤에것은 계산하지 않고 출력한ㄷ.
		
		x = 0; //청소
		y = 0; 
		b  = ++x < 0 & ++y < 0;//x:1, y:1, b:false
		
		x = 0; //청소
		y = 0; 
		b  = ++x > 0 || ++y > 0;//x:1, y:0, b:true (or ||)경우 하나만트루여도 다트루여서 뒤에 식은 계산하지 않고 출력
		
		x = 0; //청소
		y = 0; 
		b  = ++x > 0 | ++y > 0;//x:1, y:1, b:true |하나만 쓰는것은 빠르지않은 연산식이여서, 빠른 계산이필요할땐 || 쓰고, 그렇지 않을땐 |만써도 된다. 
		System.out.printf("x:%d, y:%d, b:%b\n", x, y ,b);
	}

}
