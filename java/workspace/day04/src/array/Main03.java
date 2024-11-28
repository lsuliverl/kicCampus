package array;

public class Main03 {

	public static void main(String[] args) {
		/*
		 * 문1.
		 * 배열 num = {22, 3, 8, 12}의
		 * 각 배열의 요소의 합을 구하여라
		 */
		int[] num = {22, 3, 8, 12};
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("합 = " + sum);
		System.out.println("------------------");
		
		/*
		 * 문2.
		 * 배열 num2 = {60, 95, 88}
		 * 각 배열의 요소의 합과 평균을 구하여라
		 */
		int[] num2 = {60, 95, 88};
		
		int sum2 = 0;

		for (int i = 0; i < num2.length; i++) {
			sum2 += num2[i];
		}
		System.out.println("합 = " + sum2 + 
				", 평균 = " + sum2 / num2.length );
		System.out.println("------------------");
		
		/*
		 * 문3.
		 * 배열 num3 = {94, 85, 95, 88, 90}
		 * 서로 다른 각 배열의 요소 중 최대값을 출력하는 프로그램 작성
		 */
		int[] num3 = new int[] {94, 85, 95, 88, 90 };
		int max = num3[0];		// 첫번째꺼를 최대값으로 설정
		
		for (int i = 1; i < num3.length; i++) {
			if (max < num3[i]) {
				max = num3[i];		// max보다 높은 값 나올 시
			}						// 그 값으로 저장
		}
		System.out.println("최대값 = " + max );
		System.out.println("------------------");
		
		/*
		 * 문4.
		 * 배열 num4 = {22, 3, 8, 12}
		 * 각 요소의 홀수와 짝수의 합을 각각 구하는 프로그램 작성
		 */
		
		int[] num4 = new int[] {22, 3, 8, 12};
		int sum4 = 0; 	// 짝수의 합
		int sum5 = 0;	// 홀수의 합
		for (int i = 0; i < num4.length; i++) {
			if (num4[i] % 2 == 0) {
				sum4 += num4[i];
			} else {
				sum5 += num4[i];
			}
		}
		System.out.println("짝수의 합 = " + sum4 
				+ ", 홀수의 합 = " + sum5 );

	}

}
