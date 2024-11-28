package exception;

public class Main01 {

	public static void main(String[] args) {
		// 문자열의 숫자 변환에 아무런 문제가 없다.
		String year1 = "1980";
		int age1 = 2023 - Integer.parseInt(year1);
		System.out.println(age1);
		
		// 숫자로 변환할 수 없으므로, 에러가 발생한다.
		// "나이" 라는 문자열은 int로 변환할 수 없기 때문에
		// 에러가 발생한다.
		// - Java프로그램은 예외 상황을 만나면 즉시
		// 프로그램을 중단하고 강제 종료된다.
		// 마지막 "프로그램 종료" 출력되지 않는다.
		String year2 = "나이";
		int age2 = 2023 - Integer.parseInt(year2);
		System.out.println(age2);

		System.out.println("---프로그램 종료---");
	}

}
