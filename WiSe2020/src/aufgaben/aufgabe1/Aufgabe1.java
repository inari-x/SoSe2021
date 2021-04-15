package aufgaben.aufgabe1;

/* 
 * @author Katrin Malfent 
 * 
 * Diese Klasse gibt auf die Konsole ein Rhombus (eine Raute) aus.
 * Der Rhombus ist entweder gefuellt oder ungefuellt. 
 * 
 * 
 */

public class Aufgabe1 {
	
	public static void printRhombusFilled(int upperHalf) {
		for(int colom = 0; colom <= upperHalf +1; colom++) {
			for(int space = 0; space <= upperHalf - colom; space++) { 
				System.out.print(" "); 
			}
			for(int row = 0; row <= colom - 1; row++) {
				if (row <= 0) { 
					System.out.print("*"); 
				}
				else { 
					System.out.print("**"); 
				}
			}
			System.out.println();
		}
		for(int colom = upperHalf; colom >= 0; colom--) {
			for(int space = 0; space <= (upperHalf) - colom; space++) {
				System.out.print(" ");
			}
			for(int row = 0; row <= colom - 1; row++) {
				if (row <= 0) { 
					System.out.print("*");
				}
				else {
					System.out.print("**"); 
				}
			}
			System.out.println();
		}
	 }
	
	public static void printRhombusUnfilled (int upperHalf) {
		for(int colom = 0; colom <= upperHalf; colom++) {
			for(int space = 0; space <= upperHalf - colom; space++) {
				System.out.print(" ");
			}
			for(int row = 0; row <= colom - 1; row++) {
				if (row >= colom -1 || row == 0) { 
					System.out.print("* ");
				}
				else {
					System.out.print("  "); 
				}
			}
			System.out.println();
		}
		
		for(int colom = upperHalf +1; colom >= 0; colom--) {
			for(int space = 0; space <= upperHalf - colom; space++) {
				System.out.print(" ");
			}
			for(int row = 0; row <= colom - 1; row++) {
				if (row >= colom -1 || row == 0) { 
					System.out.print("* ");
				}
				else {
					System.out.print("  "); 
				}
			}
			System.out.println();
		}
	}
	
	public static void printRhombus(int upperHalf, boolean filled) {
		if(filled == true) {
			printRhombusFilled(upperHalf);
		}
		else {
			printRhombusUnfilled(upperHalf);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printRhombusFilled(5);
		printRhombusUnfilled(5);
		printRhombus(5, true);
		printRhombus(5, false);	
	}
}
