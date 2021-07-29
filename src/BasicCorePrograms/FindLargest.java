package BasicCorePrograms;

import java.util.Scanner;

public class FindLargest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number : ");
		int number1 = sc.nextInt();
		System.out.print("Enter Second number: ");
		int number2 = sc.nextInt();
		System.out.print("Enter Third number : ");
		int number3 = sc.nextInt();
		if(number1 > number2 && number1 > number3) {
			System.out.println("Largest Number : " + number1);
		}
		else if(number2 > number1 && number2 > number3){
			System.out.println("Largest Number : " + number2);
		}
		else {
			System.out.println("Largest Number : " + number3);
		}
		sc.close();
	}
}
