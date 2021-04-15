package uebungen.uebung8_nochmal_2;

public class Testklasse {

	public static void main(String[] args) {
		System.out.printf("%n%n--------------------- Test Wohnung -------------------------%n%n");
		Wohnung w1 = new Wohnung(70, 3, 4, 12.50);
		Wohnung w2 = new Wohnung(40, 1, 0, 9.50);
		Wohnung w3 = new Wohnung(90, 4, 2, 11.10);
		Wohnung w4 = new Wohnung(60, 2, 0, 9.00);

		w1.print();
		w2.print();
		w3.print();
		w4.print();
		
		System.out.printf("%n%n---------------------- Test Haus ---------------------------%n%n");
		Haus h1 = new Haus(10);
		h1.print();
		

	        System.out.printf("%n%n----- Test wohnungenInEtage() und print(Wohnung[]) ---------%n%n");
	        for(int etage=0; etage<6; etage++)
	        {
	            System.out.println("Etage " + etage + " ---------------------------------------");
	            h1.print(h1.wohnungenInEtage(etage));
	            System.out.println();
	        }

	        System.out.printf("%n%n--------------- Test teuersteWohnung() ---------------------%n%n");
	        Wohnung teuerste = h1.teuersteWohnung();
	        teuerste.print();

	        System.out.printf("%n%n---------------- Test gesamtMieteHaus() --------------------%n%n");
	        System.out.printf("Die Gesamtmiete fuer das Haus betraegt %.2f Euro.%n", h1.gesamtMieteHaus());

	        System.out.printf("%n%n------------------- Test sortieren() -----------------------%n%n");
	        h1.sortieren();
	        h1.print();
	}

}
