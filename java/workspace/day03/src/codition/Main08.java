package codition;

public class Main08 {

	public static void main(String[] args) {
		  /*
	       * 문1. if문
	       * 만약 3000원 이상의 돈을 가지고있으면
	       * "택시를 타고 가라" 출력
	       * 그렇지 않으면 "걸어가라" 출력
	       */
	      int point = 4000;
	      
	      if( point >= 3000 ) {
	    	  System.out.println("택시를 타고 가라");
	      } else {
	    	  System.out.println("걸어가라");
	      }
	      System.out.println("-------------------");
	      
	      /*
	       * 문2. if문
	       * 돈이 3000원 이상 있거나, 카드가 있으면
	       * "택시를 타고 가라" 출력
	       * 그렇지 않으면 "걸어가라" 출력
	       */
	      int point1 = 2000;
	      // true : 카드가 있음, false : 카드 없음
	      boolean Card = true;
	      if ( point1 >= 3000 || Card ) {
	    	  System.out.println("택시를 타고 가라");
		} else {
			  System.out.println("걸어가라");
		}
	      System.out.println("--------------------------");
	      
	      /*
	       * 문3. if문
	       * 어떤 특정 정수값 a(변수명)가 
	       * 짝수이면 "짝수", 홀수이면 "홀수" 출력
	       */
	      int a = 23;
	      
	      if ( a % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	      System.out.println("----------------");
	      
	      /*
	       * 문4. if문
	       * 어떤 특정 서로다른 정수값 a1, b1, c1의 최대값 을 구하여라.
	       * a1 = 10, b1 = 20, c1 = 9;
	       */
	      int a1 = 100, b1 = 200, c1 = 9;
	      int max = 0;
	      
	      if ( a1 > b1 && a1 > c1 ) {
			max = a1;
		} else if( b1 > c1 ) {
			max = b1;
		} else {
			max = c1;
		}
	      System.out.println("최대값 : "+ max);
	      
	      System.out.println("--------------------");
	      
	      /*
	       * 문5. if문
	       * 수학 점수가 90점 이상이면 "A학점"
	       * 수학 점수가 80점 이상이면 "B학점"
	       * 수학 점수가 70점 이상이면 "C학점"
	       * 수학 점수가 60점 이상이면 "D학점"
	       * 나머지 "F학점"
	       */
	      int point2 = 40;
	      
	      if ( point2 >= 90 ) {
	    	  System.out.println("A학점");
		} else if ( point2 >= 80 ) {
	    	  System.out.println("B학점");
		} else if ( point2 >= 70 ) {
	    	  System.out.println("C학점");
		} else if ( point2 >= 60 ) {
	    	  System.out.println("D학점");
		} else {
	    	  System.out.println("F학점");
		}
	      
    	  System.out.println("------------------");
	  
	      /*
	       * 문6. switch-case
	       * 특정 정수 num의 값이 1이면 "축구",
	       * 2이면 "농구", 3이면 "야구,
	       * 4이면 "배구", 그 외에는 "배드민턴"이 출력
	       */
	      int num = 8;
	    		  
	    		  switch ( num ) {
				case 1:
			    	  System.out.println("축구");
					break;
				case 2:
			    	  System.out.println("농구");
					break;
				case 3:
			    	  System.out.println("야구");
					break;
				case 4:
			    	  System.out.println("배구");
					break;
				default:
			    	  System.out.println("배드민턴");
					break;
				}
	    		  
	    		  System.out.println("--------------");
    	  
	      /*
	       * 문7. switch-case
	       * 특정 정수의 값이 3이면 "안녕"이 세줄,
	       * 2이면 "안녕"이 두줄, 1이면 "안녕"이 한줄,
	       * 그 외는 "잘가" 출력
	       */
		int Hi = 3;
		
		switch ( Hi ) {
		case 3:
	    	  System.out.println("안녕");
		case 2:
	    	  System.out.println("안녕");
		case 1:
	    	  System.out.println("안녕");
			break;
		default:
	    	  System.out.println("잘가");
		}
	}

}
