package aufgaben.aufgabe4;

import java.util.Random;

public class Aufgabe4 {
	
	public static char[] createAndFillCharArray() {
		char[] filledArray = new char[25];
		Random number = new Random();
		int fromInclusive = 97;
		int toInclusive = 123;
		int bound = (toInclusive - fromInclusive);
		for(int index = 0; index < filledArray.length; index++) {
			int number1 = number.nextInt(bound) + fromInclusive;
			while( contains(filledArray, (char)number1) == true ) {
				Random numberNew = new Random();
				number1 = numberNew.nextInt(bound) + fromInclusive;	
			}	
			filledArray[index] = (char)number1;
		}
		return filledArray;
	}
		
	public static boolean contains(char[] ca, char c) {
		boolean contains = false;
		for(int index = 0; index < ca.length; index++) {
			if(c == ca[index]) {
				contains = true;
			}
		}
		return contains;
	}
	
	public static char[] sort(char[] a) {
	char[] sortedArray = a;
		for(int bubble = 1; bubble <= sortedArray.length-1; bubble++) {
			for(int index = 0; index < sortedArray.length - bubble; index++) {
				if(sortedArray[index] > sortedArray[index+1]) {
					char tmp = sortedArray[index+1];
					sortedArray[index+1] = sortedArray[index];
					sortedArray[index] = tmp;
				}
			}
			
		}
		return sortedArray;
	}
	
	public static void print( char[] a ) {
		System.out.print("[ ");
		for(int index = 0; index < a.length -1; index++) {
			System.out.print(a[index] + ", ");
		}
		System.out.print(a[a.length-1]);
		System.out.print(" ]");
	}
	
	public static char getMissingLetter(char[] a) {
		char missingLetter = 'a';
		char[] completeAlphabet = new char[26];
		for(int asciiValue = 97; asciiValue<123; asciiValue++) {
			completeAlphabet[asciiValue - 97] = (char) asciiValue;
		}
		for(int index = 0; index < completeAlphabet.length -1; index++) {
			if( completeAlphabet[index] != a[index] ) {
				missingLetter = completeAlphabet[index];
				return missingLetter; 
			}
		}
		return missingLetter;
	}
	
	
	public static void main(String[] args) {
		
		for(int asciiValue = 97; asciiValue<123; asciiValue++) {
			char c = (char) asciiValue;
		    System.out.print(c + " ");
		}
	    
	    System.out.printf("%n%n----------------- Erzeugen ------------------%n%n");
	    char[] ca1 = createAndFillCharArray();
	    print(ca1);

	    System.out.printf("%n%n----------------- Sortieren ------------------%n%n");        
	    char[] ca2 = sort(ca1);
	    print(ca2); 
		    
	    System.out.printf("%n%n--------------- Missing Char ----------------%n%n");  
		char ca3 = getMissingLetter(ca2);
	    System.out.println("Missing Letter: " + ca3);
	    
		}
	}


