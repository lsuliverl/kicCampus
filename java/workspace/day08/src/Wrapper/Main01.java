package Wrapper;

public class Main01 {

	public static void main(String[] args) {
		String a = "20";
		String b = "3.14";
		
		// 문자열을 실제 데이터 형으로 변환하는 기능
		int num_a = Integer.parseInt(a);
		float num_b = Float.parseFloat(b);
		
		// 변환된 값은 사칙 연산이 가능하다.
		int v1 = num_a + 100;
		float v2 = num_b + 100;
	
		System.out.println("V1 ="+ v1);
		System.out.println("V2 ="+ v2);
	
		// 기본 데이터형의 객체화
		Integer i = new Integer(100);
		
	}

}
