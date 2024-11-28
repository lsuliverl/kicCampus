package Exetends;

/*
 * - 클래스 다이어그램을 참조하여 QNAArticle, FileArticle 완성
 * 단, toString() 무시
 * - Main02 클래스에서 각각의 객체 생성 후,
 * setter로 할당, 해당 내용 모두 getter 출력
 */
public class Main02 {

	public static void main(String[] args) {
		
		QNAArticle q = new QNAArticle();
		q.setNum(1);
		q.setTitle("첫번째 질문");
		q.setAnswer("첫번째 답변");;
//		System.out.println(q.getNum());
//		System.out.println(q.getTitle());
//		System.out.println(q.getAnswer());
		System.out.println(q.toString());
		System.out.println("--------------------------");

		FileArticle f = new FileArticle();
		f.setNum(1);
		f.setTitle("파일 업로드 첫번째");
		f.setFileName("java.ppt");;
//		System.out.println(f.getNum());
//		System.out.println(f.getTitle());
//		System.out.println(f.getFileName());
		System.out.println(f.toString());

		
	}

}
