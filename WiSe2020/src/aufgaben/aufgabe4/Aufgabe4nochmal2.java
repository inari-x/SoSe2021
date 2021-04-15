package aufgaben.aufgabe4;

import java.util.Random;

public class Aufgabe4nochmal2 {
	
	public static char[] createAndFillCharArray() {
		char[] ca = new char[25]; //char array Länge 25
		Random r = new Random();  //Random Klasse
		for(int index = 0; index < ca.length; index++) {
			int randNr = r.nextInt(26) +97; //Erzeugt Random Nummer 
			char c = (char) randNr; //Tapecast nach char
			
			while(contains(ca, c)) {  //char befüllen
				randNr = r.nextInt(26) + 97;
				c = (char) randNr;
			}
			ca[index] = c;
		}
		return ca;
	}
	
	public static boolean contains(char[] ca, char c) {
		boolean contains = false;
		for(int index = 0; index < ca.length && !contains; index++) {
			if(ca[index] == c) {
				contains = true;
			}
		}
		return contains;
	}
	
	public static char[] sort(char[] a) {
		char[] b  = copy(a);
		
		boolean swapped = true;
		for(int bubble = 1; bubble <= b.length -1 && swapped; bubble++) {
			swapped = false;
			for(int index = 0; index < b.length - bubble; index++) {
				if(b[index] > b[index+1]) {
					char tmp = b[index+1];
					b[index+1] = b [index];
					b[index] = tmp;
					swapped = true;
				}
			}
		}
		return b;
	}
	
	public static void print(char[] a)
    {
        String s = "[ "; 
        for(int index=0; index<a.length-1; index++)
        {
            s = s + a[index] + ", ";
        }
        if(a.length > 0)
        {
            s = s + a[a.length-1];
        }
        System.out.println(s + " ]");
    }
	

	public static char[] copy(char[] a) {
		char[] b = new char[a.length];
		for(int index = 0; index < b.length; index++) {
			b[index] = a[index];
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int asciiValue = 97; asciiValue<123; asciiValue++)
		{
		    char c = (char) asciiValue;
		    System.out.print(c + " ");
		}
	}

}
