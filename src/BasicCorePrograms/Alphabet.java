package BasicCorePrograms;

import java.util.Scanner;
public class Alphabet {
	
	public static void isVowelOrConsonant(char alpha) {
		
		if(alpha == 'a' || alpha == 'e'|| alpha == 'i' || alpha == 'o' || alpha == 'u' ) {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character :");
		//store the character input in to variable 
	    char alpha = sc.next().charAt(0);
	    isVowelOrConsonant(alpha);
		sc.close();
	}
}
