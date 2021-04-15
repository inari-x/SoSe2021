package uebungen.uebung3;

import java.util.Scanner;

public class Aufgabe3professor {
	
	 public static int inputInt()
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Geben Sie eine Zahl ein : ");
	        int number = sc.nextInt();
	        sc.close();
	        return number;
	    }

	    public static boolean isPrime(int number)
	    {
	        boolean isPrime = true;     // true ist wichtig!

	        if(number<2)
	        {
	            isPrime = false;
	        }
	        else 
	        {
	            if(number==2)
	            {
	                isPrime=true;
	            }
	            else
	            {
	                for(int divider=2; divider<=Math.sqrt(number) && isPrime; divider++)
	                {
	                    if(number % divider == 0)
	                    {
	                        isPrime = false;
	                    }
	                }
	            }
	        }

	        return isPrime;
	    }

	    public static void printPrimeNumbers(int maximum)
	    {
	        for(int number=1; number<=maximum; number++)
	        {
	            if(isPrime(number))
	            {
	                System.out.print(number+" ");
	            }
	            else
	            {
	                System.out.print(". ");
	            }
	            if(number%30 == 0)
	            {
	                System.out.println();
	            }
	        }
	    }

	    public static int getSmallestDivider(int number)
	    {
	        int smallestDivider = 0;
	        boolean found = false;

	        if(number<2)
	        {
	            smallestDivider = number;
	        }
	        else
	        {
	            if(isPrime(number))
	            {
	                smallestDivider = number;
	            }
	            else
	            {
	                for(int divider=2; divider<number && !found; divider++)
	                {
	                    if(number % divider == 0)
	                    {
	                        smallestDivider = divider;
	                        found = true;
	                    }
	                }
	            }
	        }
	        return smallestDivider;
	    }

	    public static String createStringOfPrimeFactorization(int number) 
	    {
	        String s = "";
	        /*
	         *  2 * 2 * 5 * 11 * 13 * 13 * 17 = 632060
	         *  632060 --> 2 
	         *  316030 --> 2
	         *  158015 --> 5
	         *   ...   --> divider
	         *  result/divider == 1
	         */
	        int smallestDivider = getSmallestDivider(number);
	        s = s + smallestDivider;
	        int result = number/smallestDivider;

	        while(result > 1)
	        {
	            smallestDivider = getSmallestDivider(result);
	            s = s + " * " + smallestDivider;
	            result = result/smallestDivider;
	        }
	        s = s + " = " + number;

	        return s;
	    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("%n%n----------- Aufgabe 1 ------------ %n %n");
        int number = inputInt();
        System.out.println("Sie haben " + number + " eingegeben.");

        System.out.printf("%n%n----------- Aufgabe 2 ------------ %n %n");
        System.out.println(isPrime(number));

        System.out.printf("%n%n----------- Aufgabe 3 ------------ %n %n");
        printPrimeNumbers(number);

        System.out.printf("%n%n----------- Aufgabe 4 ------------ %n %n");
        System.out.println(getSmallestDivider(number));

        System.out.printf("%n%n----------- Aufgabe 5 ------------ %n %n");
        String output = createStringOfPrimeFactorization(632060);
        System.out.println(output);
    }

}
