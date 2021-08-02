package BasicCorePrograms;

import java.util.Scanner;

public class QuatientAndRemainder {
	public static void calc(int dividend, int divisor) {
		
		float quotient = (float)dividend / divisor;
		System.out.println("Quatient :" + quotient );
		int remainder = dividend % divisor;
		System.out.println("Remainder :" + remainder);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Dividend :");
		int dividend = sc.nextInt();
		System.out.print("Enter a Divisor :");
		int divisor = sc.nextInt();
		calc(dividend , divisor);
		sc.close();
	}
}
