package Class;

class Member{
	String name;
	int age;

	void setName( String name ) {
		this.name = name;
	}
	
	void setAge( int age ) {
		this.age = age;
	}
	
	String getName( ) {
		return this.name;
	}
	int getAge( ) {
		return this.age;
	}	
	
	void say() {
		System.out.println(this.getName());
		System.out.println(this.getAge());
	}
	
}


public class Main06 {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.setName("자바학생");
		member.setAge(20);
		member.say();
		
	}

}
