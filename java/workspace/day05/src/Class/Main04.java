package Class;

class Calc{
	int plus( int x, int y ) {
		return x + y;
	}
	
	int minus( int x, int y ) {
		return x - y;
	}
	
}

public class Main04 {

	public static void main(String[] args) {

		Calc c = new Calc();
		System.out.println("100 + 5 = "+ c.plus(100, 5));
		
		Calc c2 = new Calc();
		System.out.println("100 - 5 = "+ c2.minus(100, 5));
		
		System.out.println("100 - 5 = "+ c.minus(100, 5));
		
		
	}

}
