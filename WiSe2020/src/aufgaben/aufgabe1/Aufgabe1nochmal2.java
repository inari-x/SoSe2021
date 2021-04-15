package aufgaben.aufgabe1;

public class Aufgabe1nochmal2 {
	
	public static void printRhombusFilled(int upperHalf){
		for(int colom = 0; colom <= upperHalf +1; colom++) {
			for(int space = 0; space <= upperHalf - colom; space++) {
				System.out.print(" ");
			}
			for(int row = 0; row <= colom -1; row++) {
				if(row <= 0) {
				System.out.print("*");
				}
				else {
					System.out.print("**");
				}
			}
			System.out.println();
		}
		
		for(int colom = upperHalf; colom >= 0; colom--) {
			for(int space = 0; space <= upperHalf - colom; space++) {
				System.out.print(" ");
			}
			for(int row = 0; row <= colom -1; row++) {
				if(row <= 0) {
				System.out.print("*");
				}
				else {
					System.out.print("**");
				}
			}
			System.out.println();
		}	
		
	}
	
	public static void printRhombusUnfilled(int upperHalf){
		for(int colom = 0; colom <= upperHalf +1; colom++) {
			for(int space = 0; space <= upperHalf - colom; space++) {
				
			}
		}
	}
	
	public static void printRhombus(int upperHalf, boolean filled){
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printRhombusFilled(5);
	}

}
