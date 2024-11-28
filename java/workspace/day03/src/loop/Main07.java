package loop;

public class Main07 {

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
		int j = 0;
		int i = 1;
		
		do {
			j = 7 * i;
			i++;
			System.out.println(j);
		}while( i < 10 );
		
		
		
	}

}
