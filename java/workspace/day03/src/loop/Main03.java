package loop;

public class Main03 {

	public static void main(String[] args) {
		/*
		 *  구구단 7단
		 *  결과 값 :
		 *  7
		 *  14
		 *  21
		 *  ...
		 *  63
		 */
		int result = 0;
				
		for (int i = 1; i < 10; i++) {
			result = 7 * i;
			System.out.println(result);
		}
		
		System.out.println(result);
		
	}

}
