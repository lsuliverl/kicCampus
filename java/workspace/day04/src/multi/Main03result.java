package multi;

public class Main03result {

	public static void main(String[] args) {
		// 1~100까지의 홀수들의 합
		// continue; break; 사용
		// while(true) -> 무한루프
		int sum = 0;
		int i = 0;
		while ( true ) {
			i++;
			if( i % 2 == 0 ) {
				continue;
			}
			if( i > 100 ) {
				break;
			}
			sum += i;
		}	
		System.out.println(sum);
	}

}
