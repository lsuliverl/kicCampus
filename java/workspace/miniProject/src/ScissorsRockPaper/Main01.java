package ScissorsRockPaper;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int user = 0;
		System.out.println("가위(1), 바위(2), 보(3)에서 숫자로 입력해주세요.(게임 종료를 원할 시 0 입력해주세요)");
		
		while (true) {							// while(무한루프) - 계속 가위바위보 도전 가능
		    if (scn.hasNextInt()) {				// if 사용 - 정수인 경우 실행
		        user = scn.nextInt();			// Scanner 입력이 정수이면 user에 저장
		        scn.nextLine();					// 저장된 엔터값 소비
		        
		        if (user >= 1 && user <= 3) {	// user 값이 1이상이거나 3이하일 때 실행
		        	if( user == 1 ) {			 	
						new Scissors(user);		// 1 입력할 경우 Scissors 클래스 실행
						System.out.println("가위(1), 바위(2), 보(3)에서 숫자로 입력해주세요.(게임 종료를 원할 시 0 입력해주세요)");
						continue;				// 재실행
						
					} else if ( user == 2) {
						new Rock(user);			// 2 입력할 경우 Rock 클래스 실행
						System.out.println("가위(1), 바위(2), 보(3)에서 숫자로 입력해주세요.(게임 종료를 원할 시 0 입력해주세요)");
						continue;				// 재실행
							
					} else {
						new Paper(user);		// 3 입력할 경우 Paper 클래스 실행
						System.out.println("가위(1), 바위(2), 보(3)에서 숫자로 입력해주세요.(게임 종료를 원할 시 0 입력해주세요)");
						continue;				// 재실행
					}	// if ~ else if ~ else( user 값에 따라 실행 )
		        	
		        } else if ( user < 0 || user > 3) {// user 값이 0 미만이거나 3 초과일 때 실행
		        	System.out.println("숫자 0~3 사이 숫자로 다시 입력해주세요.");
		        } // if ~ else( user 입력값 제한 )
		        
		    	} else {							// else - 정수가 아닐 경우 실행
		    		scn.nextLine(); 				// 저장된 엔터값 소비
		    		System.out.println("숫자가 아닙니다. 다시 입력해주세요.");
		    		continue;
		    	} if ( user == 0) {					// user 값이 0일 때 게임 종료
		    		System.out.println("게임을 종료합니다.");
		    		scn.close();
		    		break;
		    }	
		    	
		}		// while( 무한 루프 )

	}			// main 메서드

}				// Main01 클래스

