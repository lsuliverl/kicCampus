package singleton;

public class Main01 {

	public static void main(String[] args) {
		// getInstance() 메서드를 사용하여
		// 객체를 리턴받는 형식
		Calc c1 = Calc.getInstance();
		
		// 여러 개의 객체를 리턴 받더라도 모두 하나의
		// static 객체를 참조하게 되기 때문에
		// 전역 객체 하나만이 메모리에 할당되게 된다.
		System.out.println( c1.plus(20, 10) );
		
		// 참조 처리를 생략하고 직접 사용하는 경우
		System.out.println( Calc.getInstance().minus(20, 10) );
		
	}

}
