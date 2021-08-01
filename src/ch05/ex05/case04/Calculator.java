package ch05.ex05.case04;

public class Calculator {
	public void add(Paper paper) {
		paper.setResult(paper.getA() + paper.getB());
	}
	
	public Paper add2(Paper paper) {
		paper.setResult(paper.getA() + paper.getB());
		return paper;				//입력받은 그 종이를 그대로 쓴다. 즉 파라미터로 받은 것을 리턴한다. 
	}	
	
	//
	public Paper add3(Paper paper) {
		Paper paper2 = new Paper();
		paper2.setResult(paper.getA() + paper.getB());
		
		return paper2;			//새 종이를 쓴다.
	}
}
/*
*두개의 메소드가 다 페이퍼를 받을거야. 
*4> add하고 리턴값을void 없다.= 종이를 리턴 하지 않는다.
*8> add하고 종이를 리턴한다. 
*두 가지의 기능은 같지만 알고리즘만 다르다. 종이를먹냐(4) 토해내냐(8)차이 리턴값의 유무차이를 비교
*14>리턴값이 있을때".들어온 종이는 관심없고 결과값을 찍어낼 종이를 새로 만들겠다. " 
*15> paper가 13의 paper와 중복되므로 같으 ㄴ이름으로 하면 오류발생하니 paper2로 설정 
*/