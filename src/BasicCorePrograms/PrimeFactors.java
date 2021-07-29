package BasicCorePrograms;

import java.util.Scanner;
public class PrimeFactors {
	
	public boolean isPrime(int factor) {
		
		for(int i=2; i<factor; i++) {
			//checking factor divisible or not  
			if((factor % i) == 0){
				//return false if it is divisible
				return false;
			}	
		}
		//return true by default if number is not divisible
		return true;
	}
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		//create object of PrimeFactors class
		PrimeFactors prime = new PrimeFactors();
		
		System.out.print("Enter a number greater than 1 : ");
		int number = sc.nextInt();
		if(number > 1) {
			for(int i=2; i<=number; i++) {
				//check each i is the factor of given number
				if(number % i == 0) {
					//calling method using class object
					boolean primeFlag = prime.isPrime(i);
					//checking prime factor or not using return value of method
					if(primeFlag == true) {
						System.out.println("Prime Factors :" + i);
					}
				}
			}
		}
		else {
			System.out.println("invalid input");
		}
		sc.close();
	}
}
