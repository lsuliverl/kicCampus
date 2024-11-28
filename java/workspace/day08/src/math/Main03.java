package math;

import com.it.study.helper.Util;

public class Main03 {

	public static void main(String[] args) {
		// 0~9사이의 5자리 인증번호 생성하기
		// "인증번호 = 12345"
		String authNum = "";
		
		for( int i = 0; i < 5; i++ ) {
			authNum += Util.getInstance().random(0, 9);
		}
	
		System.out.println( "인증번호 = "+ authNum);
	
	
	}

}
