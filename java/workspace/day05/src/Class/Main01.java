package Class;
// 학생 정보를 포함하는 클래스 작성
class Student {	// class 이름 시작점은 대문자로 하는게 약속
	// 멤버변수
	String name = "자바학생";
	int age = 20;
	String number = "01012345678";
	
}

public class Main01 {

	public static void main(String[] args) {
		// 객체의 선언과 할당 분리
		Student std;
		std = new Student();
		
		// 객체의 생성과 할당 일괄지정
		Student std2 = new Student();
		
		System.out.println("std 이름 : " + std.name);
		System.out.println("std 나이 : " + std.age);
		System.out.println("std 전화번호 : " + std.number);
		
		System.out.println("std2 이름 : " + std2.name);
		System.out.println("std2 나이 : " + std2.age);
		System.out.println("std2 전화번호 : " + std2.number);
		System.out.println("-----------------------");
	
		std.name = "홍길동";
		std.age = 30;
		
		System.out.println("std 이름 : " + std.name);
		System.out.println("std 나이 : " + std.age);
		
		System.out.println("std2 이름 : " + std2.name);
		System.out.println("std2 나이 : " + std2.age);
		System.out.println("-----------------------");
		
		std2.name = "이순신";
		std2.age = 25;
		
		System.out.println("std 이름 : " + std.name);
		System.out.println("std 나이 : " + std.age);
		
		System.out.println("std2 이름 : " + std2.name);
		System.out.println("std2 나이 : " + std2.age);
		System.out.println("-----------------------");
		
	}

}
