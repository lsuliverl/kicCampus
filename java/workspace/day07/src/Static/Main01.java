package Static;

public class Main01 {

	public static void main(String[] args) {
		Article.setCategory("자유게시판");
		
		Article a1 = new Article(1, "첫 번째글", "2023-01-02");
		Article a2 = new Article(2, "두 번째글", "2023-01-31");
		Article a3 = new Article(3, "세 번째글", "2023-01-31");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println("----------------------------------");
		
		Article.setCategory("공지사항");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
	}

}
