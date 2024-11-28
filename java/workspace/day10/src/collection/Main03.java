package collection;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

	public static void main(String[] args) {
		/*
		 * List를 사용하는 가장 일반적인 방법은,
		 * 사용자 정의 클래스에 대한 객체를 포함하도록
		 * 지정하는 것이다.
		 */
		List<Member> pList
			= new ArrayList<Member>();
		
		// 10명의 데이터를 임의로 추가
//		pList.add( new Member("회원0", "01012345670"));
//		pList.add( new Member("회원1", "01012345671"));
//		pList.add( new Member("회원2", "01012345672"));
//		pList.add( new Member("회원3", "01012345673"));
//		pList.add( new Member("회원4", "01012345674"));
//		pList.add( new Member("회원5", "01012345675"));
//		pList.add( new Member("회원6", "01012345676"));
//		pList.add( new Member("회원7", "01012345677"));
//		pList.add( new Member("회원8", "01012345678"));
//		pList.add( new Member("회원9", "01012345679"));
		
		for (int i = 0; i < 10; i++) {
			pList.add(new Member("회원"+ i, "0101234567"+ i));
		}
		
		// 출력
		// toString(); 반복문
		for (int i = 0; i < pList.size(); i++) {
			// List에 저장된 데이터를 하나 꺼내면,
			// Member 클래스 형의 객체
			Member item = pList.get(i);
			System.out.println(item.toString());
		}	
			
		
		
	}

}
