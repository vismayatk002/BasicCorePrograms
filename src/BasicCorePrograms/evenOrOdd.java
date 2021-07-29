package BasicCorePrograms;

import java.util.Scanner;

public class evenOrOdd {
	
	 public static boolean isEven(int number) {
		//check number is even and return true or false
		return(number % 2 == 0);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		//calling method and store the value in variable result
		boolean result = isEven(number);
		if(result) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		sc.close();
	}

}
