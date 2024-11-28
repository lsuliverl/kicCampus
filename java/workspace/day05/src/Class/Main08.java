package Class;

class Article{
	int seq;		// 글 번호
	String subject;	// 글 제목
	String writer;	// 작성자

	Article( int seq, String subject, String writer ) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	void print() {
		System.out.println(this.seq);
		System.out.println(this.subject);
		System.out.println(this.writer);
	}
	
}


public class Main08 {

	public static void main(String[] args) {
		Article article1 = new Article(1, "자바연습", "자바힉생");
		article1.print();
		System.out.println("--------------------");
		
		Article article2 = new Article(2,
				"자바는 객체지향 언어이다", "자바학생2");
		article2.print();
				
	}

}
