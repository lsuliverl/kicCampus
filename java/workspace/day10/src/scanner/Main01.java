package scanner;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("int type입력 : ");
		int i = scanner.nextInt();
		System.out.println("int 결과 : "+ i);
		
		System.out.println("double type 입력 :");
		double d = scanner.nextDouble();
		System.out.println("double 결과 : " + d);
		
		
		
		
		scanner.close();
	}

}
