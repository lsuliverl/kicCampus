package method;

public class Main04 {

	public static void main(String[] args) {
		System.out.println(f2(100));
		
	}

	public static int f1(int x) {
		return x + 1;
	}
	
	public static int f2(int x) {
		return f1(x) + 1;
	}
	
}
