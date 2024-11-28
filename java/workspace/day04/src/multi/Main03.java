package multi;

public class Main03 {

	public static void main(String[] args) {
		// 1~100까지의 홀수들의 합
		// continue; break; 사용
		// while(true) -> 무한루프
		int sum = 0;
		int i = 1;
		while ( true ) {
			sum = sum + i;
			i += 2;
			if( i == 101 ) {
				System.out.println(sum);
				break;
			}
			continue;
		}	
	}

}
