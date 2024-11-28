package exception;

public class Main03 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		for( int i = 0; i<5; i ++) {
			/*
			 * 프로그램이 논리적 모순에 빠지지 않도록
			 * 프로그래머가 if문을 사용하여 처리해 준다.
			 */
			if( i<arr.length ) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}
		
		
		
	}

}
