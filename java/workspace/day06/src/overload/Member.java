package overload;

/*
 * 멤버변수 String job, int age 선언
 * - 생성자를 기본, int, String, String int 총 4개 선언
 * - toString(), override 생성
 * Main03
 * - 객체를 생성자 가지수에 맞춰 총 4개 생성 및 toString() 각각 출력
 */
public class Member {
	private String job;
	private int age;
	
	public void member( String job ) {
		this.job = job;
	}
	public void member( int age ) {
		this.age = age;
	}
	public void member( String job, int age ) {
		this.job = job;
		this.age = age;
	}
	public void member( int age, String job ) {
		this.job = job;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [job=" + job + ", age=" + age + "]";
	}
	

}
