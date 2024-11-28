package loop;

public class Main05 {

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
		int i = 1;
		while ( i < 10 ) {
			result = 7 * i;
			i++;
			System.out.println(result);
		}
		
		
		
	}

}
