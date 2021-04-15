package uebungen.uebung2_nochmal;

public class Uebung2 {
	
	public static void printTimesTables(int nr1, int nr2) {
		for(int z = 1; z <= nr1; z++) {
			for(int s = 1; s <= nr2; s++) {
				System.out.println(z + " * " + s + " = " + (z*s));
			if(s == 10)  System.out.println();
			}
		}
	}
	
	public static void printTimesMatrix(int nr1, int nr2) {
		for(int z = 1; z <= nr1; z++) {
			for(int s = 1; s <= nr2; s++) {
				System.out.printf("%3d",(z*s));
			if(s == 10)  System.out.println();
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
					if(x <= y && y <= z && (x*y*z == factor)) {
						System.out.println(x + " * " + y + " * " + z + " = " + factor);
					}
				}
			}
		}
	}
	
	public static void printSeconds(int seconds) {
		int minutes = (seconds/60);
		int reminderM = minutes%60;
		int hours = minutes/60;
		int reminderH = hours%24;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		printTimesTables(10,10);
		printTimesMatrix(10,10);
		printTriangleUp(7);
		threeNumberFactors(36);
		
	}

}
