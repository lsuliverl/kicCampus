package hiding;

/*
 * 게시판 작성할 클래스
 * 	- 별도의 게시판 작성을 위한 클래스 생성
 * 	- 글 번호, 글 제목, 글 내용, 작성자, 조회수, 작성일시(String)
 * 	- getter, setter 전체 생성
 * 	- 파라미터가 있는 생성자 생성(필드값 전체를 피라미터로 받아온다)
 * Main04
 * 	-게시판 클래스로 객체생성 -> getter 전체 값 출력
 */
	

public class Main04 {

	public static void main(String[] args) {
		Board b = new Board(1, "자바", "자바란....", "자바학생", 10, "2023/01/30");
		
		System.out.println(b.getNumber() + " " + b.getTitle() + " "
				+ b.getContents() + " "+ b.getWriter() + " "+ b.getViews() + " "
				+ b.getDate() + " ");
		
		
	}

}
