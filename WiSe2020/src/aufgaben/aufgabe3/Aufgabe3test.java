package aufgaben.aufgabe3;
/**
 * 
 * @author Katrin Malfent
 * 
 * Diese Klasse gibt verschiede Arrays aus.
 *
 */

import java.util.Random;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.OptionalInt; 

public class Aufgabe3test {

	public static int[] createAndFillArray(int length, int fromInclusive, int toInclusive) {
		int[] a = new int[length];
		int bound = (toInclusive - fromInclusive) +1;
		Random r = new Random();
			for(int i = 0; i < a.length; i++) {
				a[i] = r.nextInt(bound) + fromInclusive;
			}
		return a;
	}
	
	public static void printArray(int[] a) {
		System.out.print("[");
			for(int index = 0; index < a.length; index++) {
				System.out.print(a[index] + ", ");
			}
					if(a.length>0) {
						System.out.print(a[a.length-1]);
					}
		System.out.println("]");
	}
	

	public static void printTable(int[] a) {
		for(int index = 0; index < a.length -1; index++) {	
			if(index == 0) {
				System.out.print("| Index :   |");
			}
				else {
					System.out.printf(" %2d  |", index);
				}
		}
		
		for(int index = 0; index < a.length -1; index++) {
			if(index == 0) {
				System.out.printf("%n");
				System.out.print("|-----------|");
			}
				else {
					System.out.print("-----|");
				}
		}
			
		for(int index = 0; index < a.length-1; index++) {
			if(index == 0) {
				System.out.printf("%n");
				System.out.print("| Wert :    |");
			}
			else {
				System.out.printf(" %2d  |", a[index]);
			}
		}
	}
	
	public static void printHorizontal(int[] a) {
		
		System.out.println("\n      |");
		for(int index = 0; index < a.length; index++) {
			
			System.out.printf("  %2d  | ", index);
				
			for(int index1 = 0; index1 <= a[index]; index1++) {
					System.out.print( "*");	
			}	
		 System.out.println("\n      |");
		}
	}
	
	public static void printUpsideDown(int [] a) {
		for(int index = 0; index < a.length; index++) {
			if(index == 0) { 
				System.out.printf("    |  %2d",index); 
			}
			else {
			System.out.printf("  %2d", index);
			}
			
		}
		System.out.println();
		System.out.print("----+");
		for(int count = 0; count <= a.length; count++) {
			System.out.print("----");	
		}
		System.out.println();
		int max = IntStream.of(a).max().orElse(0);
		
		
		for(int spalte = 0; spalte < max; spalte++) {
			System.out.printf(" %2d |", spalte);
			
			for (int count = 0; count <= a.length - 1; count++) {
				if(!(a[count] < spalte )) {
					System.out.print("   *");
				}
				else {
					System.out.print("    ");
				}
				
			}
				System.out.printf("%n");
		}
		
		}	
	
	public static void printVertical(int[] a) {
		int max = IntStream.of(a).max().orElse(0);
		for(int spalte = max; spalte > 0; spalte--) {
			if(spalte > 0) {
			System.out.printf(" %2d | ", spalte);
		
			for(int count = 0; count <= a.length - 1; count++) {
				if(!(a[count] < spalte )) {
					System.out.print("  * ");
				}
				else {
					System.out.print("    ");
				}
				
			}
				System.out.printf("%n");
			}
		}
			System.out.print("----+");
				for(int count = 0; count <= a.length -1; count++) {
					System.out.print("----");
				}
				System.out.print("-");
				System.out.println();
				
		for(int index = 0; index < a.length; index++) {
			if(index > 0) {
				System.out.printf("  %2d",index);
			}
			else {
				System.out.printf("    |  %2d",index);
				
			}
		}	
	}

	public static void main(String[] args) {
	Random r = new Random();	
	int length =  r.nextInt(10) +10;
	int[] arr1 = createAndFillArray(length, 20, 30);
	
	System.out.printf("%n%n%n----------- printArray -----------------%n%n%n");
	printArray(arr1);
	
	System.out.printf("%n%n%n----------- printTable -----------------%n%n%n");
	printTable(arr1);
	
	System.out.printf("%n%n%n----------- printHorizontal ------------%n%n%n");
	printHorizontal(arr1);
	
	System.out.printf("%n%n%n----------- printUpsideDown ------------%n%n%n");
	printUpsideDown(arr1);
	
	System.out.printf("%n%n%n----------- printVertical --------------%n%n%n");
	printVertical(arr1);
	}

}

