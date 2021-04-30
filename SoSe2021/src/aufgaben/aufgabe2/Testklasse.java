package aufgaben.aufgabe2;

public class Testklasse {

	public static void main(String[] args) {
		
		MyInteger mi1 = null, mi2=null;
	
		
		try {
			mi1 = new MyInteger("aaaa");
			System.out.println("mi1: "+mi1.intValue());
		}
		catch (IllegalArgumentException e) {
			System.out.println("mi1: " + e.getMessage());
		}
		
		try {
			mi1 = new MyInteger("00021");
			System.out.println("mi1: "+mi1.intValue());
		}
		catch (IllegalArgumentException e) {
			System.out.println("mi1: " + e.getMessage());
		}
		
		try {
			mi1 = new MyInteger("-21");
			System.out.println("mi1: "+mi1.intValue());
		}
		catch (IllegalArgumentException e) {
			System.out.println("mi1: " + e.getMessage());
		}
		
		try {
			mi1 = new MyInteger("+21");
			System.out.println("mi1: "+mi1.intValue());
		}
		catch (IllegalArgumentException e) {
			System.out.println("mi1: " + e.getMessage());
		}
		
		try {
			mi1 = new MyInteger("");
			System.out.println("mi1: "+mi1.intValue());
		}
		catch (IllegalArgumentException e) {
			System.out.println("mi1: " + e.getMessage());
		}
		
		try {
			mi1 = new MyInteger("-");
			System.out.println("mi1: "+mi1.intValue());
		}
		catch (IllegalArgumentException e) {
			System.out.println("mi1: " + e.getMessage());
		}
		
		try {
			mi2 = new MyInteger("5");
			System.out.println("mi2: "+mi1.intValue());
		}
		catch (IllegalArgumentException e) {
			System.out.println("mi2: " + e.getMessage());
		}
		System.out.println("mi1 equals mi2?: " +mi1.equals(mi2));
		System.out.println("mi1 double mi2?: " +mi1.doubleValue());
		System.out.println("mi1 hashCode mi2?: " +mi1.hashCode());
	}

}
