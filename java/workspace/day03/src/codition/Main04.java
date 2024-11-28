package codition;

public class Main04 {

	public static void main(String[] args) {
		int point = 87;
		
		/*
		 * 만약 point가 90 초과이고, 100 이하면 "A" 출력
		 * 만약 point가 80 초과이고, 90 이하면 "B" 출력
		 * 만약 point가 70 초과이고, 80 이하면 "C" 출력
		 * 나머지는 "F" 출력
		 */
		
		if( point > 90 && point <= 100  ) {
			System.out.println("A");
		} else if( point > 80 && point <= 90 ) {
			System.out.println("B"); 
		} else if( point > 70 && point <= 80 ) {
			System.out.println("C"); 
		} else {
			System.out.println("F");
		}
		
	}

}
