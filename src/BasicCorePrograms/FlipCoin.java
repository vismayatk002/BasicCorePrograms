package BasicCorePrograms;

import java.lang.Math;
import java.util.Scanner;
public class FlipCoin {
	
	public static void percentageCalc(int flipCount , float headCount , float tailCount) {
		
		float headPercentage = (float)(headCount * 100) / flipCount;
		float tailPercentage = (float)(tailCount * 100) / flipCount;
		System.out.printf("Percentage of Head : %.2f ", headPercentage);
		System.out.printf("\nPercentage of Tail : %.2f ", tailPercentage );
	}
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);	
		int headCount = 0;
		int tailCount = 0;
		System.out.print("Enter the number of times to Flip coin : ");
		//store the input into a variable
		int flipCount = sc.nextInt();

		if(flipCount > 0) {
			for(int i=0; i<flipCount; i++) {
				//get 0 or 1 randomly
				float flipCoin = (float)(Math.random());
				if(flipCoin < 0.5) {
					tailCount++;
				}
				else {
					headCount++;
				}
			}
		}
		else {
			System.out.println("Ivalid Input");
		}
		percentageCalc(flipCount, headCount, tailCount);
		sc.close();	
	}

}
