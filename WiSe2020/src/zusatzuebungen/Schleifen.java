package zusatzuebungen;

import java.util.Scanner;
import java.util.Random;

public class Schleifen {

	
	public static void istQuadratzahl(int zahl) {
		
		Boolean printResult = false;
		String trueString = ", and the square root is: ";
		
		for(int i = 1; i <= zahl; i++) {
			if((zahl%i == 0) && (zahl/i == i)) {
				printResult = true;
				trueString += i;
			}
		}
		if (printResult) {
			System.out.println(true + trueString);
		}
		else {
			System.out.println(false);
		}
	}
	
	public static boolean istPrimzahl(int zahl) {
		 boolean isPrime = true;     // true ist wichtig!

	        if(zahl<2)
	        {
	            isPrime = false;
	        }
	        else 
	        {
	            if(zahl==2)
	            {
	                isPrime=true;
	            }
	            else
	            {
	                for(int divider=2; divider<=Math.sqrt(zahl) && isPrime; divider++)
	                {
	                    if(zahl % divider == 0)
	                    {
	                        isPrime = false;
	                    }
	                }
	            }
	        }

	        return isPrime;
	    }
	
	public static void printPrimzahlenBisN(int n) {
		for(int zahl = 0; zahl <= n; zahl++) {
			if(istPrimzahl(zahl)) {
				System.out.println(zahl);
			}
		}
	}
	
	public static int reverseInt(int number) {
		int reversed = 0;
		while(number != 1) {
			int digit = number%10;
			reversed = digit;
			number/=10;
			if(number == 0)
				System.out.print(digit);
			System.out.print(reversed);
		}
		
		
		return number;	
	}
	
	public static void zahlenRaten(int raten) {
		Scanner sc = new Scanner(System.in);
		int ganzeZahl = sc.nextInt();
		System.out.print("Geben Sie eine ganze Zahl ein: ");
		Random r = new Random();
		int bound = 100;
		int randomNumber = r.nextInt(bound);
		for(int index = 0; index <= bound; index++) {
			System.out.print(randomNumber);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	istQuadratzahl(10);	 
	istQuadratzahl(9);	
	istQuadratzahl(23104);	
	istQuadratzahl(119025);	
	
	System.out.println();
	
	System.out.println(istPrimzahl(20));
	printPrimzahlenBisN(30);
	System.out.println();
	int number = 1200;
	System.out.print(number);
	System.out.println();
	System.out.println(reverseInt(number));
	
	System.out.println();
	

	
	
		

	}

}
