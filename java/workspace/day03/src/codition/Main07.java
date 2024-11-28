package codition;

public class Main07 {

	public static void main(String[] args) {
		/*
		 * char grade 변수 선언,
		 * grade가 A, B, C일때는	-> pass 출력
		 * 나머지					-> not-pass 출력
		 */
		char grade = 'C';
				
				switch ( grade ) {
				case 'A':
				case 'B':
				case 'C':
					System.out.println("pass");
					break;
				default:
					System.out.println("not-pass");
					break;
				}
		
		
	}

}
