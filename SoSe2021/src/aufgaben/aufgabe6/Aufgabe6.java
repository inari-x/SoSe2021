package aufgaben.aufgabe6;

public class Aufgabe6 {
	
	public static void main(String[] args) {
		long a = 1000;
		Integer b = 1000;       
		Integer c = 1000;       
		System.out.println(a == b);
		System.out.println(Integer.valueOf(b).equals(Integer.valueOf(c)));
	}

}
