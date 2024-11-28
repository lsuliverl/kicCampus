package patternchecker;

import study.java.helper.RegexHelper;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * 이름, 나이, 이메일, 전화번호를 입력 받고
		 * RegexHelper를 이용한 validation check하는
		 * 회원가입 절차 작성
		 */
		
		String name = "자바학생";
		String age = "19";
		
		// 정규표현식을 사용한 입력값 형식 검사
		if(!RegexHelper.getInstance().isKor(name)) {
			System.out.println("이름을 한글로 입력해주세요.");
			return;
		}
		
		if(!RegexHelper.getInstance().isNum(age)) {
			System.out.println("나이는 숫자로만 입력해주세요.");
			return;
		}
		
		
		
		
		
		System.out.println("회원가입 절차를 시작합니다.");
	}

}
