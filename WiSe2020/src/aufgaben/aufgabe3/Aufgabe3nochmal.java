package aufgaben.aufgabe3;

import java.util.Random;

public class Aufgabe3nochmal {

	public static int[] createAndFillArray(int length, int fromInclusive, int toInclusive) {
		int[] a = new int[length];
		int bound = (toInclusive - fromInclusive);
		Random r = new Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(bound) + fromInclusive;
		}
		return a;
	}
	
	public static void printArray(int[] a) {
		System.out.print("[ ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		if(a.length > 0) {
			System.out.print(a.length -1);
		}
		System.out.print(" ]");
		
	}
	
	public static void printTable(int[] a) {
		for(int index = 0; index < a.length; index++) {
			if(index == 0) {
				System.out.print(" | Index:  |");
			}
			else {
				System.out.printf("  %2d  |", index -1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();	
		int length =  r.nextInt(10) +10;
		int[] arr1 = createAndFillArray(length, 20, 30);
		
		System.out.printf("%n%n%n----------- printArray -----------------%n%n%n");
		printArray(arr1);
		
		System.out.printf("%n%n%n----------- printTable -----------------%n%n%n");
		printTable(arr1);

		
	}

}
