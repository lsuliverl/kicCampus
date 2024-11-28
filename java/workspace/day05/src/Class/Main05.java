package Class;

/*
 * 계산기 클래스 생성,
 * +, -, /, * 메서드를 각각 생성, int x, int y -> 파라미터 2개, return
 * main() -> 각각의 메서드 결과 출력
 */

class Calc2{
	int plus( int x, int y ) {
		return x + y;
	}
	int minus( int x, int y ) {
		return x - y;
	}
	int divide( int x, int y ) {
		int result = 0;
		
		if( y != 0 ) {
			result = x / y;
		}
		return result;
	}	
	
	int multiply( int x, int y ) {
		return x * y;
	}	
}


public class Main05 {

	public static void main(String[] args) {

		Calc2 c2 = new Calc2();
		System.out.println("8 + 2 = "+ c2.plus(8, 2));
		System.out.println("8 - 2 = "+ c2.minus(8, 2));
		System.out.println("8 / 2 = "+ c2.divide(8, 2));
		System.out.println("8 * 2 = "+ c2.multiply(8, 2));
		
	}

}
