package exception;

public class Main04 {

	public static void main(String[] args) {
		try {
			String year2 = "나이";
			int age2 = 2023 - Integer.parseInt(year2);
			System.out.println(age2);
		} catch( NumberFormatException e ) {
			System.out.println("에러가 발생했습니다.");
			// e.printStackTrace()
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("---프로그램 종료---");
	}

}
