package BasicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float result = 0;
		System.out.print("Enter Harmonic value : ");
		int N = sc.nextInt();
		if(N != 0) {
			
			for(int i= 1; i<= N; i++) {
			
				result = result + (float)1/i;
			}
		}
		else {
			System.out.println("Invalid Input");
		}
		System.out.printf("Sum of Harmonic value : %.2f " , result);
		sc.close();
	}

}
