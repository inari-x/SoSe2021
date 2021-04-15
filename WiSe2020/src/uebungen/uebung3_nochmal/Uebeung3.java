package uebungen.uebung3_nochmal;

import java.util.Scanner;

public class Uebeung3 {
	
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
					if(number%divider == 0) {
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
			if(number%30 == 0) {
				System.out.println();
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%n%n----------- Aufgabe 1 ------------ %n %n");
        int number = inputInt();
        System.out.println("Sie haben " + number + " eingegeben.");
       
	}

}
