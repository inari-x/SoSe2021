package uebungen.uebung6_nochmal;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Konto k1 = new Konto(1234);

		k1.einzahlen(100.0);
		k1.einzahlen(50.0);
		k1.einzahlen(150.0);
		
		k1.kontoauszug(1235);       // Falsche PIN!
		k1.kontoauszug(1234); 
		
		k1.auszahlen(1235, 100.0);  // Falsche PIN!
		k1.auszahlen(1234, 100.0);  
		k1.kontoauszug(1234);       
		k1.auszahlen(1234, 300.0);  // Guthaben reicht nicht
		k1.auszahlen(1234, 200.0);  
		k1.kontoauszug(1234);
	}

}
