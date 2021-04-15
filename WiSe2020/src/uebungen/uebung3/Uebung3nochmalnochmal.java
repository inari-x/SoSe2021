package uebungen.uebung3;

import java.util.Scanner;

public class Uebung3nochmalnochmal {
	
	public static int inputInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl ein: ");
		int number = sc.nextInt();
		sc.close();
		return number;
		
	}
	
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		if(number < 2) {
			isPrime = false;
		}
		else {
			if(number == 2) {
			isPrime = true;
			}
			else {
				for(int divider = 2; divider <= Math.sqrt(number) && isPrime; divider++) {
					if(number % divider == 0) {
						isPrime = false;
					}
				}	
			}
		}
		return isPrime;
	}
	
	public static void printPrimeNumbers(int maximum) {
		for(int number = 1; number <= maximum; number++) {
			if(isPrime(number)) {
				System.out.print(number + " ");
			}
			else {
				System.out.print(". ");
			}
		}
	}
	
	public static int getSmallestDivider(int number) {
		int smallestDivider = 0;
		boolean found = false;
		if(number < 2) {
			smallestDivider = number;
		}
			else {
				if(isPrime(number)) {
					smallestDivider = number;
				}
				else {
					for(int divider = 2; divider < number && !found; divider++) {
						if(number % divider == 0) {
							smallestDivider = divider;
							found = true;
						}
					}
				}
			}
		return smallestDivider;
	}
	
	public static String createStringOfPrimeFactorization (int number) {
		String s = "";
		int smallestDivider = getSmallestDivider(number);
		s = s + smallestDivider;
		int result = number/smallestDivider;
		while(result > 1) {
			smallestDivider = getSmallestDivider(result);
            s = s + " * " + smallestDivider;
            result = result/smallestDivider;
		}
		s = s + "=" + number;
		return s;
	}
	
	
	public static void main(String[] args) {
		
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
        System.out.println(createStringOfPrimeFactorization(number));
	}

}
