package uebungen.uebung1;

public class Uebung1 {
	
	public static void printIntDivison(int nr1, int nr2 ) {
		
		int division = ( nr1 / nr2 );
		int rest = ( nr1 % nr2 );
		if(rest==0)
		{
			System.out.println(nr1 + " geteilt durch " + nr2 + " ergibt " + division + " ohne Rest. ");
		}
		else
		{
				System.out.println(nr1 + " geteilt durch " + nr2 + " ergibt " + division + " es bleibt ein Rest von " + rest);
		}
	}
	public static int getQuotient(int nr1, int nr2) {
		int quotient = ( nr1 / nr2 );
		return quotient;
		
	}
	
	public static int getRemainder(int nr1, int nr2) {
		int remainder = (nr1 % nr2);
		return remainder;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ganzeZahl = 123;
		long großeZahl =  2147483648L;
		char character = 65;
		byte kleineZahl = 127;
		short zahl = 32767;
		float kurzDecimal = 4.23f;
		double decimal = 6.98;
		boolean zweiOptionen = true;
		String text = "Hallo!";
		
		System.out.println("Wert vom Typ int    : " + ganzeZahl);
		System.out.println("Wert vom Typ long   : " + großeZahl);
		System.out.println("Wert vom Typ char   : " + character);
		System.out.println("Wert vom Typ byte   : " + kleineZahl);
		System.out.println("Wert vom Typ short  : " + zahl);
		System.out.println("Wert vom Typ float  : " + kurzDecimal);
		System.out.println("Wert vom Typ double : " + decimal);
		System.out.println("Wert vom Typ boolean: " + zweiOptionen);
		System.out.println("Wert vom Typ String : " + text);
		
		System.out.println();
		
		ganzeZahl= 2147483647;
		System.out.println("Wert vom Typ int    : " + ganzeZahl);
		ganzeZahl++;
		System.out.println("Wert vom Typ int    : " + ganzeZahl);
		
		System.out.println();
		
		printIntDivison(7, 4);
		printIntDivison(17, 4);
		printIntDivison(16, 4); 
		
		System.out.println();
		
		int nr1 = 17;
		int nr2 = 4;
		int result = getQuotient(nr1, nr2);
		
		
		System.out.println();
		System.out.println( nr1 + " / " + nr2 + " = " + result );		
		
		int rest = getRemainder(nr1, nr2);
		System.out.println();
		System.out.println( nr1 + " mod " + nr2 + " = " + rest);
	}
		
}

