package ch04.ex02;

public class C02Switch {
	public static void main(String[] args) {
		String grade = "gold";
		String coupon = "";
		
		//과거엔integer로만 쓸 수 있었음. 지금은 케이스와 기준값을 스트링값으로 쓸수 있다.
		switch(grade) { 
		case "gold": coupon += "10,000원 ";
		case "silver": coupon += "5,000원 ";
		case "copper": coupon += "1,000원 ";
		}
		
		System.out.println(coupon);
	}

}
