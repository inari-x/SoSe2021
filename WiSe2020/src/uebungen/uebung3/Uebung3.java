package uebungen.uebung3;

import java.util.Scanner;

public class Uebung3 {

	public static int inputInt() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie eine Zahl ein : ");
		int number = sc.nextInt();
		return number;
	}
	
	public static boolean isPrime(int number) {
		double sqrt = Math.sqrt(number);
		for(int nr = 2; nr <= sqrt; nr++) {
			if(number % nr == 0) {
				return false;	
			}
		}
		return true;
	}
	
	public static void printPrimeNumbers(int maximum) {
		System.out.println("Zahl: " + maximum);
		for(int number = 2; number <= maximum; number++) {
				if(isPrime(number)) {
				System.out.print(number +" ");
				}
				else {
				System.out.print(". ");
			} 
		}
	}
	public static int getSmallestDivider (int number) {
		int smallestDivider = 0;
		boolean foundSmallestDivider = false;
			if(number < 2 || isPrime(number)) {
				smallestDivider = number;
				//foundSmallestDivider = true; // brauchen wir nicht wegen else
			}
				else {
					for(int divider = 2; divider < number && !foundSmallestDivider; divider++) {
						if(number % divider == 0) {
							smallestDivider = divider;
						}
					}
				}
		return smallestDivider;
		}
		

	public static String createStringOfPrimeFactorization(int number) {
		String s = "";
		
		int smallestDivider = getSmallestDivider(number);
		int result = number / smallestDivider;
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputInt();
		System.out.println(isPrime(3));
		printPrimeNumbers(61);
		System.out.println();
		System.out.println(getSmallestDivider(16));
		System.out.println();
		createStringOfPrimeFactorization(632060);
		
	}

}
