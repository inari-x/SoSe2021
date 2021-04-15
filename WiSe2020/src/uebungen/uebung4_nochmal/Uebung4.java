package uebungen.uebung4_nochmal;


public class Uebung4 {
	
	public static void print(char[] ca) {
		System.out.print("[");
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i] + ", ");
		}
		if(ca.length > 0) {
			System.out.print(ca[ca.length -1]);
		}
		System.out.println("]");
	}
	
	public static void print(int[] ca) {
		System.out.print("[");
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i] + ", ");
		}
		if(ca.length > 0) {
			System.out.print(ca[ca.length -1]);
		}
		System.out.println("]");
	}
	
	public static char[] stringToCharArray(String s) {
		char[] ca = new char[s.length()];

        for (int index = 0; index < ca.length; index++)
        {
            ca[index] = s.charAt(index);        
        }
        return ca;
	}
	
	public static char[] filter(char[] carr, char filter) {
		int nrOfOccurrences = 0;
		for (int i = 0; i < carr.length; i++) {
			if(carr[i] == filter) {
				nrOfOccurrences++;
			}
		}
		int newLength = carr.length - nrOfOccurrences;
		char[] caNew = new char[newLength];
		int index = 0;
		for (int i = 0; i < carr.length; i++) {
			if(carr[i] != filter) {
				caNew[index] = carr[i];
				index++;
			}
			
		}
		return caNew;
	}
	
	public static int[] minAndMax(int[] iarr) {
		int curMin = iarr[0];
		int curMax = iarr[0];
		for (int i = 0; i < iarr.length; i++) {
			if(iarr[i] < curMin) {
				curMin = iarr[i];
			}
			if(iarr[i] > curMax) {
				curMax = iarr[i];
			}
		}
		int[] ra = new int[2];
		ra[0] = curMin;
		ra[1] = curMax;
		return ra;
	}
	
	public static int[] reverse(int[] iarr) {
		int [] neu = new int[iarr.length];
		for (int i = 0; i < neu.length; i++) {
			neu[i] = iarr[iarr.length -1 -i];
		}
		return neu;
	}
	
	 public static int norOfOccurrences(char[] ca, char element)
	    {
	        int nrOfOccurrences = 0;

	        for (int index = 0; index < ca.length; index++)
	        {
	            if(ca[index] == element)
	            {
	                nrOfOccurrences++;
	            }
	        }
	        return nrOfOccurrences;
	    }
	
	 public static boolean containsDoublets(char[] ca) {
		 boolean doublet = false;
	        for (int index = 0; index < ca.length && !doublet; index++)
	        {
	            if (norOfOccurrences(ca, ca[index]) >= 2)
	            {
	                doublet = true;
	            }
	        }
	        return doublet; 
	 }

	public static void main(String[] args) {
		System.out.printf("%n%n ---------------- Aufgabe 1 ----------%n%n");
        char[] carr1 = new char[10];
        char c1 = 'w';
        carr1[0] = 'w';
        carr1[1] = 'i';
        carr1[2] = 'o';
        carr1[3] = 'u';
        carr1[4] = 'w';
        carr1[5] = 'r';
        carr1[6] = 'e';
        carr1[7] = '2';
        carr1[8] = '!';
        carr1[9] = 'q';
        // carr1[10] = 'w';     // ArrayIndexOutOfBoundsException

        char[] carr2 = {'a', 'b', 'c', 'a', 'c', 'a', 'b', 'c'};

        print(carr1);
        print(carr2);

        char[] carr3 = new char[0];
        print(carr3);
        
        System.out.printf("%n%n ---------------- Aufgabe 2 ----------%n%n");
        int[] iarr1 = { 4,2,8,1,6,2,4,1,8 };
        print(iarr1);
        
        System.out.printf("%n%n ---------------- Aufgabe 3 ----------%n%n");
        String s1 = "Hallo FIW!"; 
        // System.out.println(s1.charAt(9));
        char[] carr4 = stringToCharArray(s1);
        print(carr4);
        
        System.out.printf("%n%n ---------------- Aufgabe 4 ----------%n%n");
        print(carr2);
        char[] carr5 = filter(carr2, 'c');
        print(carr5);
        carr5 = filter(carr2, 'a');
        print(carr5);
        carr5 = filter(carr2, 'b');
        print(carr5);
        carr5 = filter(carr2, 'd');
        print(carr5);
        
        System.out.printf("%n%n ---------------- Aufgabe 5 ----------%n%n");
        int[] iarr2 = minAndMax(iarr1);
        print(iarr2);
        System.out.println("Minimum : " + iarr2[0] + " Maximum : " + iarr2[1]);
        int[] iarr3 = { 4 };
        iarr2 = minAndMax(iarr3);
        print(iarr2);
        System.out.println("Minimum : " + iarr2[0] + " Maximum : " + iarr2[1]);
        
        System.out.printf("%n%n ---------------- Aufgabe 6 ----------%n%n");
        int[] iarr4 = reverse(iarr1);
        print(iarr1);
        print(iarr4);
        
        System.out.printf("%n%n ---------------- Zusatzaufgabe ----------%n%n");
        System.out.println(containsDoublets(carr2));
        char[] carr6 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] carr7 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'a'};
        char[] carr8 = { };
        char[] carr9 = { 'a', 'a'};
        System.out.println(containsDoublets(carr6));
        System.out.println(containsDoublets(carr7));
        System.out.println(containsDoublets(carr8));
        System.out.println(containsDoublets(carr9));


	}
	
}
