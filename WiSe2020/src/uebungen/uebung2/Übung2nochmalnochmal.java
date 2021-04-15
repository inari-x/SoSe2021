package uebungen.uebung2;

public class Übung2nochmalnochmal {
	
	public static void printTimesTables(int nr1, int nr2) {
		for(int zeile = 1; zeile <= nr2; zeile++) {
			for(int spalte = 1; spalte <= nr1; spalte++) {
				if(spalte * zeile <= 100) {
					System.out.println(zeile + " * " + spalte + " = " + (zeile* spalte));
					if(spalte == 10) {
						System.out.println();
					}
				}
			}
		}
	}
	
	public static void printTimesMatrix(int nr1, int nr2) {
		for(int zeile = 1; zeile <= nr1; zeile++) {
			for(int spalte = 1; spalte <= nr2; spalte++) {
				if(spalte * zeile <= 100) {
					System.out.printf("%4d", zeile * spalte);
					if(spalte >= 10) {
						System.out.println();
					}
				}
			}
		}
	}
	
	public static void printTriangleUp(int height) {
		for(int zeile = height -1; zeile >= 0; zeile--) {
			for(int spalte = 0; spalte <= zeile; spalte++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void threePossibles(int factor) {
		for(int x = -factor; x <= factor; x++) {
			for(int y = -factor; y <= factor; y++) {
				for(int z = - factor; z <= factor; z++) {
					if((x <= y) && (y <= z) && ( x * y * z == factor)) {
						System.out.println(x + "*" + y + "*" + z + " = " + factor);
					}
				}
			}
		}
	}
	
	public static void printSeconds(int seconds) {
		int minutes = seconds/60;
		int reminderM = minutes%60;
		int hours = minutes/60;
		int reminderH = hours%60;
		int days = hours/24;
		int reminderS = seconds%60;
		
		System.out.println(seconds + " Sekunden sind " + days + " Tage, " + reminderH + " Stunden, " + reminderM + " Minuten, " + reminderS + " Sekunden. ");
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
	
	printTimesTables(10, 10);
	printTimesMatrix(10, 10);
	printTriangleUp(7);
	threePossibles(36);
	printSeconds(3456789);
	
	
	}
}
