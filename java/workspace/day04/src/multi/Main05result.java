package multi;

public class Main05result {

	public static void main(String[] args) {
		// 문1. while
	      // 구구단(2~9) 결과값을 출력, 2중 while문으로 출력
		
		int i = 2;
		int j = 1;
		while ( i < 10 ) {
			while ( j < 10 ) {
			int k = i * j;
				System.out.println( k );
				j++;
			}
			if ( i < 9 ) {
				System.out.println("-----------");
			}
			i++;
			j = 1;
		}
		System.out.println("-----------");
	
	      // 문2. for
	      // 1~10까지의 숫자 합
	
			int sum = 0;
			for (int j1 = 0; j1 < 11; j1++) {
				sum += j1;
			}
			System.out.println("1~10까지 합 : " + sum);
			System.out.println("-----------");
		
			// 문3. for
			// 1~10까지의 홀수의 합
			
			int sum1 = 0;
			for (int j3 = 1; j3 < 11; j3++) {
				if ( j3 % 2 == 1 ) {
					sum1 += j3;
				}
			}
			System.out.println("1~10까지 홀수의 합 : " + sum1);
			System.out.println("-----------");
			
	      // 문4. for
	      // 1~10까지의 짝수의 합
		
			int sum2 = 0;
			for (int j3 = 1; j3 < 11; j3++) {
				if ( j3 % 2 == 0 ) {
					sum2 += j3;
				}
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
			
			for (int p = 0; p < 8; p++) {
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
			
			for( int q = 0; q < 8; q++) {
				for( int j8 = q; j8 < 8; j8++){
					System.out.print("★");
				}
				System.out.println("");
			}
			System.out.println("-----------");		
				
				/*
		       * 문7.
		       * ★
		         ★★
		         ★★★
		         ★★★★
		         ★★★★★
		         ★★★★★★
		         ★★★★★★★
		         ★★★★★★★★
		       */
		      
				for( int u = 7; u >= 0; u-- ) {
					for( int t = u; t <= 7; t++ ){
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
	
				int tree = 0;
				while ( tree < 10 ) {
					tree++;
					System.out.println("나무를 " + tree 
							+ "번 찍었습니다.");
					if( tree == 10 )
						System.out.println("나무가 넘어갑니다.");
					}
				}
				
}
