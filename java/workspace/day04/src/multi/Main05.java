package multi;

public class Main05 {

	public static void main(String[] args) {
		  // 문1. while
	      // 구구단(2~9) 결과값을 출력, 2중 while문으로 출력
		
		int i = 2;
		while ( i < 10 ) {
			int j = 1;
			while ( j < 10 ) {
			int k = i * j;
			j++;
				System.out.println( k );
			}
			i++;
			if ( i < 10 ) {
				System.out.println("-----------");
			}
		}
		System.out.println("-----------");
		
	      // 문2. for
	      // 1~10까지의 숫자 합
	      	
			int sum = 0;
			for (int j = 0; j < 11; j++) {
				sum += j;
			}
			System.out.println("1~10까지 합 : " + sum);
			System.out.println("-----------");
			
	      // 문3. for
	      // 1~10까지의 홀수의 합
			
			int sum1 = 0;
			for (int j = 1; j < 11; j++) {
				if ( j % 2 == 0 ) {
					continue;
				}
				sum1 += j;
			}
			System.out.println("1~10까지 홀수의 합 : " + sum1);
			System.out.println("-----------");
			
	      // 문4. for
	      // 1~10까지의 짝수의 합
	      
			int sum2 = 0;
			for (int j = 1; j < 11; j++) {
				if ( j % 2 == 1 ) {
					continue;
				}
				sum2 += j;
			}
			System.out.println("1~10까지 짝수의 합 : " + sum2);
			System.out.println("-----------");
	      
			/*
	       * 문5.(8*8)
	       *  ★★★★★★★★
	         ★★★★★★★★
	         ★★★★★★★★
	         ★★★★★★★★
	         ★★★★★★★★
	         ★★★★★★★★
	         ★★★★★★★★
	         ★★★★★★★★
	         
	         System.out.println("");   -> ln 엔터
	         System.out.print("★");      -> 엔터없이 출력
	       */
			
			for (int j = 0; j < 8; j++) {
				for (int u = 0; u < 8; u++) {
					System.out.print("★");
				}
				System.out.println("");
			}
			System.out.println("-----------");
	      
	      /*
	       * 문6.
	       *    ★★★★★★★★
	         ★★★★★★★
	         ★★★★★★
	         ★★★★★
	         ★★★★
	         ★★★
	         ★★
	         ★
	       */

			for( int q = 8; q > 0; q--) {
				for( int j = 0; j < q; j++){
					System.out.print("★");
				}
				System.out.println("");
			}
			System.out.println("-----------");
			
	      /*
	       * 문7.
	       *    ★
	         ★★
	         ★★★
	         ★★★★
	         ★★★★★
	         ★★★★★★
	         ★★★★★★★
	         ★★★★★★★★
	       */
	      
			for( int u = 1; u < 9; u++) {
				for( int j = 0; j < u; j++){
					System.out.print("★");
				}
				System.out.println("");
			}
			System.out.println("-----------");
			
	      /*
	       * 문8.while
	       * "10번찍어 안넘어 가는 나무 없다."
	       * [결과 값]
	       * 나무를 1번 찍었습니다.
	       * 나무를 2번 찍었습니다.
	       * ...
	       * 나무를 10번 찍었습니다.
	       * 나무가 넘어갑니다.
	       */
			
			int tree = 1;
			while ( true ) {
				if( tree < 11 )
				System.out.println("나무를 " + tree + "번 찍었습니다.");
				tree++;
				if ( tree == 11 ) {
					System.out.println("나무가 넘어갑니다.");
					break;
				}
			}
			
	}

}
