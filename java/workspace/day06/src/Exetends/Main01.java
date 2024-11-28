package Exetends;

public class Main01 {

	public static void main(String[] args) {
		CalcParent parent = new CalcParent();
		System.out.println(parent.plus(20, 10));
		System.out.println(parent.minus(20, 10));
		
		System.out.println("-------------------");
	
		CalcChild child = new CalcChild();
		System.out.println(child.times(20, 10));
		System.out.println(child.divide(20, 10));
		System.out.println(child.plus(20, 10));
		System.out.println(child.minus(20, 10));
	
	}

}
