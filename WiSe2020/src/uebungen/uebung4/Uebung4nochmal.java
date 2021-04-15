package uebungen.uebung4;

public class Uebung4nochmal {
	
	public static void print(char[] ca) {
		System.out.print("[");
		for(int index = 0; index < ca.length -1; index++) {
			System.out.print(ca[index] + ", ");
			}
		System.out.print(ca[ca.length-1]);
		System.out.print("]");
	}
	
	public static void print(int[] ca) {
		System.out.print("[");
		for(int index = 0; index < ca.length -1; index++) {
			System.out.print(ca[index] + ", ");
			}
		System.out.print(ca[ca.length-1]);
		System.out.print("]");
	}
	
	public static char[] stringToCharArray(String s) {
		char[] ca = new char[s.length()];
		for(int index = 0; index < ca.length; index++) {
			ca[index] = s.charAt(index);
		}
		return ca;
	}
	
	public static char[] stringToCharArray2(String s) {
		char[] ca = new char[s.length()];
		for(int index = 0; index < ca.length; index++) {
			ca[index] = s.charAt(index);
		}
		return ca;
	}
	
	public static char[] filter(char[] carr, char filter) {
		int nrOfOccurences = 0;
		for(int index = 0; index < carr.length; index++) {
			if(carr[index] == filter) {
				nrOfOccurences++;
			}
			 
		}
		int newLength = carr.length - nrOfOccurences;
		char[] newA = new char[newLength];
		int indexNew = 0;
		for(int index = 0; index < carr.length; index++) {
		
		if(carr[index] != filter) {
			newA[indexNew] = carr[index];
			indexNew++;
		}
	
		}
		return newA;
	}
	
	public static char[] filter1(char[] carr, char filter) {
		int nrOfOccurrences = 0;
		for(int index = 0; index < carr.length; index++) {
			if(carr[index] == filter) {
				nrOfOccurrences++;
			}
		}
		int newLength = carr.length - nrOfOccurrences;
		char [] newChar = new char [newLength];
		int newNrOfOccurences = 0;
		for(int index = 0; index < carr.length; index++) {
			if(carr[index] != filter) {
				newChar[newNrOfOccurences] = carr[index];
				newNrOfOccurences++;
			}
		}
		return newChar;
		
	}
	
	public static int[] minAndMax(int[] iarr) {
		int currentMaximum = 0;
		for(int index = 0; index < iarr.length; index++) {
			if(iarr[index]>currentMaximum) {
				currentMaximum = iarr[index];
			}
		}
		int currentMinimum = currentMaximum;
		for(int index = 0; index < iarr.length; index++) {
			if(iarr[index] < currentMinimum) {
				currentMinimum = iarr[index];
			}
		}
		int[] mM = {currentMaximum, currentMinimum};
		return mM;
		
	}
	
	public static int[] reverse(int[] iarr) {
		int[] iaNew = new int[iarr.length];

        for (int index = 0; index < iaNew.length; index++)
        {
            iaNew[index] = iarr[iarr.length-1 - index];
        }

        return iaNew;
	}
	
	

	public static void main(String[] args) {
	
		System.out.printf("%n%n-------------------- Aufgabe 1 ---------------------%n%n");
		char[] letters = {'a', 'b', 'c', 'a', 'c', 'a', 'b', 'c'};
		print(letters);
	//	char[] leer = {};
	//	print(leer); 
	
		System.out.printf("%n%n-------------------- Aufgabe 2 ---------------------%n%n");
		int[] zahlen = {1, 2, 3, 4, 5, 6, 7, 8};
		print(zahlen);
		
		System.out.printf("%n%n-------------------- Aufgabe 3 ---------------------%n%n");
		String s1 = "hallo!";
		char [] stc = stringToCharArray(s1);
		print(stc);
		
		String s3 = "hallöle";
		char [] stc2 = stringToCharArray2(s3);
		print(stc2);
		
		System.out.printf("%n%n-------------------- Aufgabe 4 ---------------------%n%n");
		print(letters);
		char [] carr1 = filter(letters, 'c');
		print(carr1);
		
		char[] carr2 = filter1(letters, 'a');
		print(carr2);
		
		System.out.printf("%n%n-------------------- Aufgabe 5 ---------------------%n%n");
		print(zahlen);
		int[] newZahlen = minAndMax(zahlen);
		print(newZahlen);
		
		System.out.printf("%n%n-------------------- Aufgabe 6 ---------------------%n%n");
		int[] neuZahlen = reverse(zahlen);
		print(neuZahlen);
	}

}
