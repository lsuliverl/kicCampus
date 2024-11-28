package Exetends;

public class QNAArticle extends Article {
	private String answer;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "질문/답변 [답변=" + answer 
				+ ", 글 번호()=" + getNum() 
				+ ", 제목()=" + getTitle() + "]";
	}
		
	
}
