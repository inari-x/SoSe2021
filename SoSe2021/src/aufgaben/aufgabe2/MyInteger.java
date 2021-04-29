package aufgaben.aufgabe2;

import javax.swing.JOptionPane;

public class MyInteger {
	
	static int MAX_VALUE;
	static int MIN_VALUE;
	private int value;
	
	public static int parseInt(String s) {
		boolean eingabeOk = false;
		int zahl = 0;
		while(!eingabeOk) {
			try {
				zahl = Integer.parseInt(s);
				eingabeOk = true;
				return zahl;
			}
			catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Es wurde keine Zahl eingegeben!");
				eingabeOk = false;
			}
		}
		return zahl;
	}
	
	MyInteger(int value) {
		this.value = value;
	}
	
	MyInteger(String s) {
		try {
			this.value = Integer.parseInt(s);
		}
		catch(IllegalArgumentException iae) {
			JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein: ");
		}
	}
	
	public int intValue() {
		return this.value;
	}
	
	public double doubleValue() {
		double zahl = this.value;
		return zahl;
	}
	
//	public static String valueOf(String s) {
//		try {
//			MyInteger mi = new MyInteger();
//		}
//	}

}
