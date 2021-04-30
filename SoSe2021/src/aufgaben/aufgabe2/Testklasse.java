package aufgaben.aufgabe2;

public class Testklasse {

	public static void main(String[] args) {
		
		try {
			MyInteger mi1 = new MyInteger("aaaa");
			System.out.println("mi1: "+mi1.intValue());
		}
		catch (IllegalArgumentException e) {
			System.out.println("mi1: " + e.getMessage());
		}
		
		try {
			MyInteger mi1 = new MyInteger("00021");
			System.out.println("mi1: "+mi1.intValue());
		}
		catch (IllegalArgumentException e) {
			System.out.println("mi1: " + e.getMessage());
		}
		
		try {
			MyInteger mi1 = new MyInteger("-21");
			System.out.println("mi1: "+mi1.intValue());
		}
		catch (IllegalArgumentException e) {
			System.out.println("mi1: " + e.getMessage());
		}
		
		try {
			MyInteger mi1 = new MyInteger("+21");
			System.out.println("mi1: "+mi1.intValue());
		}
		catch (IllegalArgumentException e) {
			System.out.println("mi1: " + e.getMessage());
		}
		
		try {
			MyInteger mi1 = new MyInteger("");
			System.out.println("mi1: "+mi1.intValue());
		}
		catch (IllegalArgumentException e) {
			System.out.println("mi1: " + e.getMessage());
		}
		
		try {
			MyInteger mi1 = new MyInteger("-");
			System.out.println("mi1: "+mi1.intValue());
		}
		catch (IllegalArgumentException e) {
			System.out.println("mi1: " + e.getMessage());
		}
	
	}

}
