package loop;

public class Main01 {

	public static void main(String[] args) {
		// 1부터 10까지의 누적된 합
		// 1 + 2 + ... + 9 + 10 = 55
		int sum = 0;
		
		//초기식; 조건식; 증감식
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println("sum : "+ sum);
		}
		
			System.out.println("합 : "+ sum);
		
		
	}

}
