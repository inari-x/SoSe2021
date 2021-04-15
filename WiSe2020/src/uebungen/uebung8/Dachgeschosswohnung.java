package uebungen.uebung8;

public class Dachgeschosswohnung extends Wohnung {

	public Dachgeschosswohnung(int qm, int anzZimmer, double qmMiete) {
		
		super(qm, anzZimmer, 5, qmMiete); //Konstruktor Wohnung
	}
	
	@Override
	public String toString() {
		String satz = "";
		
		satz = String.format("%d-Zimmer DG-Wohnung mit %d qm in der 5. Etage. Monatliche Miete: %.2f Euro%n", this.anzZimmer, this.qm, this.qmMiete);
		//mit gettern eigentlich dann muss man Variablen nicht auf protected ändern
		return satz;
	}
}
