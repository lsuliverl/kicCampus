package array;

public class Main01 {

	public static void main(String[] args) {
		/*
		 * 배열의 생성
		 */
		int[] dooly;
		dooly = new int[3];
		
		dooly[0] = 75;
		dooly[1] = 82;
		dooly[2] = 91;
		
		int[] douneo = new int[3];
		douneo[0]= 88;
		douneo[1]= 64;
		douneo[2]= 50;
		
		int[] ddochy = new int[] {100, 100, 90};
		
		/*
		 * 배열의 활용
		 */
		
		int sum1 = 0, sum2 =0, sum3 = 0;
		
		//각 배열의 요소의 값에 대한 합계 구하기
		// 둘리
		
		System.out.println("둘리 배열 길이 : " + dooly.length);
		for (int i = 0; i < dooly.length; i++) {
			sum1 += dooly[i];
		}
		System.out.println("둘리 총합 : "+ sum1);
		System.out.println("둘리 평균 : "+ sum1 / dooly.length);
		
		// 도우너 총합, 평균
		
		for (int i = 0; i < douneo.length; i++) {
			sum2 += douneo[i];
		}
		System.out.println("도우너 총합 : "+ sum2);
		System.out.println("도우너 평균 : "+ sum2 / douneo.length);
		
		// 또치 총합, 평균
		
		for (int i = 0; i < ddochy.length; i++) {
			sum3 += ddochy[i];
		}
		System.out.println("또치 총합 : "+ sum3);
		System.out.println("또치 평균 : "+ sum3 / ddochy.length);
	
	}

}
