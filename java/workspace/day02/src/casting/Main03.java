package casting;

public class Main03 {

	public static void main(String[] args) {
		double a = 10.5d;
		float b = 20.5f;
		
		/*
		 * 큰 범위의 변수와 작은 범위의 변수가 연산을 수행하면,
		 * 작은 범위의 변수가 큰 범위의 데이터형으로
		 * 암묵적 형변환을 수행한다.
		 * 그러므로 a + b 의 결과는 double형의 변수가 된다.
		 */
		// float f = a + b;
		
		double d = a + b;
		System.out.println("d : "+ d);
		
		float f = (float)a + b;
		System.out.println("f : "+ f);
	}

}
