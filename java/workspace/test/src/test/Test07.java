package test;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		System.out.println("첫번째 숫자 : "+ num1);
		System.out.println("두번째 숫자 : "+ num2);
		
		System.out.println("이름을 입력해주세요");
		Calc calc = new Calc(sc.next());
		System.out.println("Name : "+ calc.getName());
		
		System.out.println("Plus result: " + calc.plus(num1, num2));
		System.out.println("Minus result: " + calc.minus(num1, num2));
		System.out.println("Multiple result: " + calc.multiple(num1, num2));
		System.out.println("Divide result: " + calc.divide(num1, num2));
		
		sc.close();
		
	}

}
