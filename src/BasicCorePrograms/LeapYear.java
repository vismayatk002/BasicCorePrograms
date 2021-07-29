package BasicCorePrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Year ( 4 digit ) : ");
		int year = sc.nextInt();
		int yearLength = String.valueOf(year).length();
		if(yearLength == 4) {
			
			if(year % 4 == 0) {
				
				System.out.println("Leap Year");
			}
			else {
				System.out.println("Not a Leap Year");
			}
		}
		else {
			System.out.println("Invalid input");
		}
		sc.close();
	}
}
