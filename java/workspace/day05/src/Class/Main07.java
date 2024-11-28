package Class;

class Book{
	String subject;
	String content;
	
	Book(){	// 생성자
		System.out.println("생성자 호출");
		this.subject = "Java입문";
		this.content = "Java는 객체지향 언어입니다.";
	
	}
	
	void read() {
		System.out.println("read()메서드 실행됨");
		System.out.println(this.subject);
		System.out.println(this.content);
	}
	
}

public class Main07 {

	public static void main(String[] args) {
		// Book클래스의 생성자에서 멤버변수에 대한 기본값을
		// 설정하기 떄문에, 객체를 생성하는 것 만으로 멤버변수가
		// 초기화 된다.
		Book book = new Book();
		book.read();
		
	}

}
