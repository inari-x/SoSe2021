package uebungen.uebung2;

public class Uebung2 {

	public static void printTimesTables(int nr1, int nr2) {
		for(int z = 1; z <= nr2; z++) {	
			for(int s = 1; s <= nr1; s++) {
				if( z * s <= 100 ) System.out.println(z + " * " + s + " = " + (z * s));
					if( s == 10 ) System.out.println();
			}
		}
	}
	
	public static void printTimesMatrix(int nr1, int nr2) {
		for(int z = 1; z <= nr2; z++) {
			for(int s = 1; s <= nr1; s++) {
				if( z * s <= 100 ) System.out.print(" " + z * s + " " );
					if( s == 10 ) System.out.println();
			}
		}
	}
				
	public static void printTriangleUp(int height) {
		for(int z = height; z >= 0; z--) {
			for(int s = 0; s < z; s++) {
				System.out.print("*");
			}
					System.out.println();
		}
	}
	
	public static void threeNumberFactors(int factor) {
		for(int x = -factor; x <= factor; x++) {
			for(int y = -factor; y <= factor; y++) {
				for(int z = -factor; z <= factor; z++) {
					if ( (x <= y) && (y <= z) && (x * y * z == factor ) ) {
						System.out.println(x + " * " + y + " * " + z + " = " + factor);
					}
				}

			}
		}
	}
	
	public static void printseconds(int seconds) {
		int minutes = seconds/60;
		int remainderMinutes = ((seconds/60)%60);
		int hours = minutes/60;
		int remainderHours = (hours%24);
		int days = hours/24;
		int remainderSeconds = seconds%60;
		
		
		System.out.println(seconds + " Sekunden sind " + days + " Tage, " + remainderHours + " Stunden, " + remainderMinutes + " Minuten, " + remainderSeconds + " Sekunden. ");
		
	}

	public static int crossSum ( int num ) {
		  int summe = 0; 
		    while( num > 0) { 

		      summe += num%10;
		      num -= num%10;
		      num /= 10;
		        
		    }
		    return summe;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printTimesTables(10, 10);
		
		System.out.println();
		System.out.println();
		
		printTimesMatrix(10, 10);
		
		System.out.println();
		System.out.println();
		
		printTriangleUp(7); 

		System.out.println();
		System.out.println();
		
		threeNumberFactors(36);
		
		System.out.println();
		System.out.println();
		
		printseconds(3456789);
		printseconds(2345678);
		printseconds(123456);
		printseconds(12345);
		
		System.out.println();
		System.out.println();
		
		System.out.println(crossSum(123456789) );
		
	}
	
}
