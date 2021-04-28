package vorlesung1;

import javax.swing.JOptionPane;

public class Ausnahmen {
	
	public static int division(int nr1, int nr2) {
	//	if(nr2 == 0) return -1; 
		return nr1/nr2;
	}
	
	public static int getValueAtIndex(int[] arr, int index) {
//		if(index<0 || index > arr.length-1) {
//			return 0;
//		}
		return arr[index];
	}
	
	public static char charAt(String s, int index ) {
		return s.charAt(index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nr1 = 4;
		int nr2 = 1;
		try {
			int result = division(nr1,nr2);
			System.out.printf("%2d / %2d = %2d %n", nr1, nr2, result);
		}
		
		catch(RuntimeException e) {
			System.out.println("Division durch 0 nicht definiert");
		}
		
		int[] arr = {1, 2, 3, 4};
		try {
			int value = getValueAtIndex(arr, 4);
			System.out.println(value);
		}
		
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Kein Index des Arrays");
		}
		
		String s = "hallo!";
		try {
			char c = charAt(s, 6);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Kein Index des Strings");
		}
		
		boolean eingabeOK = false;
		int zahl = 0;
		while(!eingabeOK) {
			String eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl ein: ");
			try {
				zahl = Integer.valueOf(eingabe);
				eingabeOK = true;
				
			}
			catch(NumberFormatException e) {
				System.out.println("Eingabe war keine Zahl");
			}
		}
		System.out.println(zahl);
			
	}

}
