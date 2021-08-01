package ch04.ex02.home;

public class H01Grade_t {
	public static void main(String[] args) {
		int score = 75;
		String grade = "";
		
		int share = score /10;
		int rest = score % 10;
		
		switch(share) {
		case 10: grade = "A+"; break; //백점은 따로구성
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		default: grade = "C";
		}
		
		if(80 <= score && score <= 99) {
			if(rest >= 8) grade += "+";
			else if(rest < 4) grade += "-";
		}
		
		System.out.println(grade);

	}

}
