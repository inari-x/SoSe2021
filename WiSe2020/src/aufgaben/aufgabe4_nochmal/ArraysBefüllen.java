package aufgaben.aufgabe4_nochmal;

import java.util.Random;

public class ArraysBefüllen {
	
	public static boolean contains(char[] ca, char c) {
		for (int i = 0; i < ca.length; i++) {
			if(ca[i] == c) return true;
		}
		return false;
	}
	
	public static char[] createAndFillCharArray() {
		char[] filledArray = new char[25];
		Random number = new Random();
		int fromInclusive = 97;
		int toInclusive = 123;
		int bound = (toInclusive - fromInclusive);
		for(int index = 0; index < filledArray.length; index++) {
			int number1 = number.nextInt(bound) + fromInclusive;
			while(contains(filledArray, (char)number1) == true) {
				Random numberNew = new Random();
				number1 = numberNew.nextInt(bound) + fromInclusive;	
			}	
			filledArray[index] = (char)number1;
		}
		return filledArray;
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
	
	public static void print(char[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		if(a.length > 0) {
			System.out.print(a[a.length -1] + " ]");
		}
	}
	
	public static char getMissingLetter(char[] a) {
		char missing = ' ';
		char[] ca = sort(a);
		for (int asciiValue = 97; asciiValue < 122 && missing == ' '; asciiValue++) {
			char c = (char)asciiValue;
			int index = asciiValue - 97;
			if(ca[index] != c) {
				missing = c;
			}
		}
		if(missing == ' ') {
			missing = 'z';
		}
		return missing;
	}
	
	 public static void findWord(String word) {
		 word = word.toLowerCase();
		 for (int i = 0; i < word.length(); i++) {
			 System.out.print(word.charAt(i));
	            char[] ca = createAndFillCharArray();
	            char c = getMissingLetter(ca);
	            int nr = 1;
	            while(word.charAt(i) != c)
	            {
	                System.out.print(".");
	                ca = createAndFillCharArray();
	                c = getMissingLetter(ca);
	                nr++;
	            }
	            System.out.println(c + " (" + nr + ")");
		 }
	 }

	public static void main(String[] args) {
		for(int asciiValue = 97; asciiValue<123; asciiValue++)
		{
		    char c = (char) asciiValue;
		    System.out.print(c + " ");
		}
		
		System.out.printf("%n%n----------------- Erzeugen ------------------%n%n");
		char[] ca1 = createAndFillCharArray();
		print(ca1);

		System.out.printf("%n%n----------------- Sortieren ------------------%n%n");        
		char[] ca2 = sort(ca1);
		print(ca2); 
		
		 System.out.printf("%n%n----------------- FindWord ------------------%n%n");     
	        findWord("weihnachten");
	    
	}

}
