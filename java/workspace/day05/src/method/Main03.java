package method;

public class Main03 {

	public static void main(String[] args) {
		int result = plus(10, 20);
		System.out.println(result);
		int result2 = minus(10, 5);
		System.out.println(result2);
		
	}
	
	public static int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	
	// minus, int x, int y, return x - y,
	// main에서 minus 호출한 결과값 출력
	public static int minus(int x, int y) {
		return x - y;
	}
}
