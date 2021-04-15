package uebungen.uebung1;

public class Uebung1nochmal {
	
	public static void printIntDivision(int nr1, int nr2) {
		
		int division = ( nr1 / nr2 );
		int rest = (nr1 % nr2 );
		
		if(rest == 0)
		{
			System.out.println(nr1 + " geteilt durch " + nr2 + " ergibt " + division + " ohne Rest.");
		}
		else {System.out.println(nr1 + " geteilt durch " + nr2 + " ergibt " + division + " Es bleibt ein Rest von " + rest);
		}
		
	}
	public static int getQuotient(int nr1, int nr2) {
		int quotient = (nr1 / nr2 );
		return quotient;
		
	}
	
	public static int getRemainder(int nr1, int nr2) {
		int remainder = (nr1 % nr2 );
		return remainder;
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("--------3.-------");
		
		int in = 123;
		long lo = 456789;
		char ch = 'a';
		byte by = 127;
		short sh = 32767;
		float fl = 4.23f;
		double db = 6.98;
		boolean bl = true;
		String st = "Hallo!";
		
		System.out.println("Wert vom Typ int         :  " + in);
		System.out.println("Wert vom Typ long        :  " + lo);
		System.out.println("Wert vom Typ char        :  " + ch);
		System.out.println("Wert vom Typ byte        :  " + by);
		System.out.println("Wert vom Typ short       :  " + sh);
		System.out.println("Wert vom Typ float       :  " + fl);
		System.out.println("Wert vom Typ double      :  " + db);
		System.out.println("Wert vom Typ boolean     :  " + bl);
		System.out.println("Wert vom Typ String      :  " + st);
		System.out.println();
		
		System.out.println("--------4.-------");
		
		in = 2147483647;
		System.out.println(in);
		++in;
		System.out.println(in);
		System.out.println();
		
		System.out.println("--------5.-------");
		
		lo = 2147483647;
		System.out.println(lo);
		++lo;
		System.out.println(lo);
		System.out.println();
		
		System.out.println("--------6.-------");
		ch = 65;
		System.out.println(ch);
		System.out.println();
		
		System.out.println("--------7.-------");
		// oben
		
		printIntDivision(7, 4);
		printIntDivision(17, 4);
		printIntDivision(16, 4);
		System.out.println();
		
		System.out.println("--------8.-------");
		int nr1 = 17;
		int nr2 = 4;
		int result = getQuotient(nr1, nr2);

		System.out.println();
		
		System.out.println();
		System.out.println( nr1 + " / " + nr2 + " = " + result );		
		
		int rest = getRemainder(nr1, nr2);
		System.out.println();
		System.out.println( nr1 + " mod " + nr2 + " = " + rest);
		
		
		
		
		
	}

}
