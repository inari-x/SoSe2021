package aufgaben.aufgabe1;

public class Aufgabe1nochmal {
	
	public static void printRhombusFilled(int upperHalf) {
		for(int s = 0; s <= upperHalf + 1; s++) {
			for(int space = 0; space <= upperHalf - s; space++) {
				System.out.print(" ");
			}	
				for(int z = 0; z <= s - 1; z++) {
					if(z <= 0) {
					System.out.print("*");
					}
					else {
						System.out.print("**");
					}
				}
				System.out.println();
		}
		for(int s = upperHalf; s >= 0; s--) {
			for(int space = 0; space <= upperHalf - s; space++) {
				System.out.print(" ");
			}
				for(int z = 0; z <= s - 1; z++) {
					if(z <= 0) {
						System.out.print("*");
					}
					else {
						System.out.print("**");
					}
				}
				System.out.println();
			}
		}
	
	public static void printRhombusUnfilled(int upperHalf) {
		for(int s = 0; s <= upperHalf; s++) {
			for(int space = 0; space <= upperHalf - s; space++) {
				System.out.print(" ");
			}
			for(int z = 0; z <= s - 1; z++) {
				if(z >= s - 1 || z == 0) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int s = upperHalf + 1; s >= 0; s--) {
			for(int space = 0; space <= upperHalf - s; space++) {
				System.out.print(" ");
			}
			for(int z = 0; z <= s - 1; z++) {
				if(z >= s-1 || z == 0) {
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
		printRhombusFilled(5);
		printRhombusUnfilled(5);
		printRhombus(5, true);
		printRhombus(5, false);

	}

}
