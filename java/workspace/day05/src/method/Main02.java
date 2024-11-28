package method;

public class Main02 {

	public static void main(String[] args) {
		plus(10, 20);
		plus(20, 35);
		plus(60, 25);
		System.out.println("--------------");
		minus(10, 24);
		minus(20, 54);
		minus(30, 44);
	}
	
	public static void plus ( int x, int y ) {
		int z = x + y;
		System.out.println(z);
	}

	// minus, int x, int y, x - y, 출력
	public static void minus (int x, int y) {
		int z = x - y;
		System.out.println(z);
	}
}
