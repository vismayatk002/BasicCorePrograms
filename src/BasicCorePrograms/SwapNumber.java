package BasicCorePrograms;

import java.util.Scanner;

public class SwapNumber {
	
	public static void swap(int number1, int number2) {
		
		//without using temporary variable
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("After Swapping numbers :" +number1 + "," + number2);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number : ");
		int number1 = sc.nextInt();
		System.out.print("Enter Second number: ");
		int number2 = sc.nextInt();
		System.out.println("Numbers :" + number1 + "," + number2);
		swap(number1 ,number2);
		sc.close();
	}
}
