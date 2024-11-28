package overload;

public class Main03 {

	public static void main(String[] args) {
		Member m = new Member();
		
		m.member(40);
		System.out.println(m.toString());
		
		m.member("선생님");
		System.out.println(m.toString());
		
		m.member("학생", 24);
		System.out.println(m.toString());
		
		m.member(50, "교수님");
		System.out.println(m.toString());
	}

}
