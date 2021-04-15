package uebungen.uebung3;

import java.util.Scanner;

public class Uebung3drittesmal {
	
	public static int inputInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl ein: ");
		int number = sc.nextInt();
		sc.close();
		
		return number;
	}

	public static boolean isPrime(int number) {
		boolean prime = true;
		if(number < 2) {
			prime = false;
		}
		else {
			if(number == 2) {
				prime = true;
			}
			else {
				for(int divider = 2; divider <= Math.sqrt(number) && prime; divider++) {
					if(number%divider == 0) {
						prime = false;
					}
				}
			}
		}
		return prime;
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
	
	
	public static void main(String[] args) {
		
		int number = inputInt();
		System.out.println(isPrime(number));
		
		printPrimeNumbers(number);
		
		
		
	}

}
