package overload;

public class Main01 {

	public static void main(String[] args) {
		Character c = new Character();
		System.out.println(c.toString());
		
		c.setPropety("회사원");
		System.out.println(c.toString());
		
		c.setPropety(30);
		System.out.println(c.toString());
		
		c.setPropety( 50, "교수");
		System.out.println(c.toString());
		
		c.setPropety("학생", 20);
		System.out.println(c.toString());
	}

}
