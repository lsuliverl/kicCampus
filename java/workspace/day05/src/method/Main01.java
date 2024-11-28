package method;

public class Main01 {

	public static void main(String[] args) {
		// 여러번 사용 가능
		plus();	
		plus();	
		plus();	
		plus();	
		plus();	
		plus();	
	}
	
	public static void plus() {
		int x = 100;
		int y = x + 1;
		System.out.println(y);
	}

	
}
