package overload;

public class Character {
	private String job;
	private int age;
	
	public void setPropety(String job) {
		this.job = job;
	}
	public void setPropety(int age) {
		this.age = age;
	}
	public void setPropety( int age, String job ) {
		this.age = age;
		this.job = job;
	}	
		
	public void setPropety( String job, int age ) {
		this.job = job;
		this.age = age;
		
	}
	@Override
	public String toString() {
		return "Character [job=" + job + ", age=" + age + "]";
	}
	
}
