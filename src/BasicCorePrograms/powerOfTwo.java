package BasicCorePrograms;

//import java.util.Scanner;

public class powerOfTwo {
	public static void main(String[] args) {
		
		int power = 1;
		//read input using command line argument
		//convert command line argument to integer
		int N =Integer.parseInt(args[0]);
		//for testing
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the limit ");
//		int N = sc.nextInt();
        if( N >= 0  && N <= 31){

           for(int i= 0; i<= N; i++){

                System.out.println("2^" + i + "=" + power );
                power = (2 * power) ;
            }
        }
	}

}
