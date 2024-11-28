package collection;

import java.util.HashMap;
import java.util.Map;

public class Mail01 {

	public static void main(String[] args) {
		
		// 데이터를 저장할 배열 생성
		// 제너릭 -> <값의 이름, 값의 종류>
		Map<String, Integer> hm
		 = new HashMap<String, Integer>();
		
		// 데이터 츄가는 put 메서드 사용
		// -> 중복을 허용하지 않는다.
		hm.put("kor", 90);
		hm.put("math", 100);
		hm.put("eng", 95);
		// 객체를 넣는 것이므로 null 사용 가능
		hm.put("kor", null);
		hm.put("kor", 80);
		
		// 저장된 갯수 얻기
		System.out.println( "hashmap size : "+ hm.size());
		
		// 저장된 데이터 꺼내기
		System.out.println( hm.get("kor"));
		System.out.println( hm.get("math"));
		System.out.println( hm.get("eng"));
	}

}
