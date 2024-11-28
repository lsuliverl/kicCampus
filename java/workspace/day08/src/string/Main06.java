package string;

public class Main06 {

	public static void main(String[] args) {
		/*
		 * D:/photo/2022/travel/food.jpg 라는 파일이 있습니다.
		 * 이 파일의 경로를 data라는 객체로 생성한 후,
		 * 다음의 형태로 출력
		 * 단, split 사용 금지
		 * ------------------------------------------------
		 * 파일이름	: food
		 * 확장자		: jpg
		 * 폴더명 	: D:/photo/2022/travel
		 */
		
		String src ="D:/photo/2022/travel/food.jpg";
		int data = src.indexOf(".");
		
		String src_name = src.substring(21 , 25);
		String src_flie = src.substring(data + 1);
		String src_flie1 = src.substring(0, 20);
		
		System.out.println( "파일이름 : " + src_name);
		System.out.println( "확장자 : " + src_flie);
		System.out.println( "폴더명 : " + src_flie1);
		
		
		
		
	}

}
