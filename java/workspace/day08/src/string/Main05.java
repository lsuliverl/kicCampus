package string;

public class Main05 {

	public static void main(String[] args) {
		/*
		 * 주민번호에서 생년월일 추출하기
		 * ex) 8005011234567 -> 1980년 05월 01일 남자
		 * - 1번이 성별코드
		 * 		-> 성별코드 1 or 2 : 19~
		 * 		-> 성별코드 3 or 4 : 20~
		 * 		-----------------------
		 * 		-> 성별코드 1 or 3 : 남자
		 * 		-> 성별코드 2 or 4 : 남자
		 */
		
		String num = "8005011234567";
		String gender1 = "";
		char gender = num.charAt(6);
		if ( gender == 1 || gender == 3) {
			gender1 = "남자";
		} else {
			gender1 = "여자";
		}
		System.out.println(gender1);
		
		
		
		
	}

}
