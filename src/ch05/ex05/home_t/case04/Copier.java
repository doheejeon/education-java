package ch05.ex05.home_t.case04;

public class Copier{
	public Document copy(Document document) {
		Document doc = new Document();
		doc.setTitle(document.getTitle());
		doc.setContent(document.getContent());
		doc.setWrittenDate(document.getWrittenDate());
		
		return doc;
	}
}
/*
5> 새로운 문서가 생성돼야한다. 
6>생성된 문서는 텅비어있으니 원본문서를 복사해줘야한다. 

*/