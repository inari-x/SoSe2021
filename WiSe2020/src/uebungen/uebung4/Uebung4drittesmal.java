package uebungen.uebung4;

public class Uebung4drittesmal {
	
	public static void print(char[] ca) {
		System.out.print("[ ");
		for(int index = 0; index < ca.length -1; index++) {
			System.out.print(ca[index] + ", ");
		}
		if(ca.length>0) {
			System.out.print(ca[ca.length-1]);
			System.out.println("]");
			}
	}
	
	
	
	public static void main(String[] args) {
	
		int length = 8;
		char[] letters = new char[length];
		int [] numbers = new int[length];
		letters[0] = 'a';
		letters[1] = 'b';
		letters[2] = 'c';
		letters[3] = 'a';
		letters[4] = 'c';
		letters[5] = 'a';
		letters[6] = 'b';
		letters[7] = 'c';
		
		numbers[0] = 1;
		
		System.out.println("--------------------1-------------------");
		System.out.println();
		print(letters); 
	}

}
