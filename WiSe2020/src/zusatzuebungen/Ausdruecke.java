package zusatzuebungen;

public class Ausdruecke {
	
	public static void gleichZwölf(int nr1, int nr2) {
		int result = (nr1%nr2);
		System.out.println((nr1 + " % " + nr2 + " = " + result));
	}
	
	public static void gleichZwölf1(int nr1, int nr2) {
		int result = (nr1/nr2);
		System.out.println((nr1 + " / " + nr2 + " = " + result));
	}
	
	

	public static void main(String[] args) {
		
	gleichZwölf(12, 13);
	gleichZwölf(24, 2);
	gleichZwölf1(24, 2);
	gleichZwölf1(25, 2);
	
	// Pre- und Postoperator
	/*
	 * int a = 300;
	 * int b = a++;
	 * int c = --b;
	 */
	
	int a = 300;
	int b = a++;
	int c = --b;
	System.out.println(c);
		
	}

}
