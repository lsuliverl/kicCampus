package exception;

public class Main02 {
	/*
	 * - 아래의 예제는 크기가 3인 배열을 0~5까지
	 * 반복하면서 데이터에 저장
	 * - 배열의 크기가 3이므로 배열 인덱스는 0~2까지로
	 * 제한되기 때문에 i의 값이 3이 되었을 때 에러가 발생한다
	 */
	public static void main(String[] args) {
		int[] arr = new int[3];
		for( int i = 0; i<5; i ++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
		
		
	}

}
